package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class GiantLeech extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }
}
