package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 09/02/15.
 */
public class DragonTurtle extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 11;
    }

    @Override
    public int getDefaultHitDice() {
        return 30;
    }
}
