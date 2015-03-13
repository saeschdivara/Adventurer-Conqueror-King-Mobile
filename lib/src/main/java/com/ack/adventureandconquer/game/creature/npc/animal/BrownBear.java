package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 22/01/15.
 */
public class BrownBear extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }
}
