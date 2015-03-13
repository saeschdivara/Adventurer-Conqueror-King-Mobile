package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 30/01/15.
 */
public class StormGiant extends Npc {

    private int mageLevel = 0;

    public StormGiant() {

        boolean hasMagic = d100.role() <= 10;
        if (hasMagic) {
            mageLevel = d6.role() + d6.role();
        }
    }

    @Override
    public String getExtraInformation() {
        return "Mage Level: " + String.valueOf(mageLevel);
    }

    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return 15;
    }
}
