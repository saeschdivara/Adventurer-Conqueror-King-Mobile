package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 30/01/15.
 */
public class FrostGiant extends Npc {
    @Override
    public String getExtraInformation() {
        return "";
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 10;
    }
}
