package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 29/01/15.
 */
public class CloudGiant extends Npc {

    private int mageLevel = 0;

    public CloudGiant() {

        boolean hasMagic = d100.role() <= 5;
        if (hasMagic) {
            mageLevel = d4.role() + d4.role();
        }
    }

    @Override
    public String getExtraInformation() {
        return "Mage Level: " + String.valueOf(mageLevel);
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 12;
    }
}
