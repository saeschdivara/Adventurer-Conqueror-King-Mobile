package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 09/02/15.
 */
public class GiantOctopus extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 8;
    }
}
