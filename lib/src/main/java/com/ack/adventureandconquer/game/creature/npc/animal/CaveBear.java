package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 30/01/15.
 */
public class CaveBear extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }
}
