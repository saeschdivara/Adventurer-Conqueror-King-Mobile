package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 11/02/15.
 */
public class SeaSerpent extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }
}
