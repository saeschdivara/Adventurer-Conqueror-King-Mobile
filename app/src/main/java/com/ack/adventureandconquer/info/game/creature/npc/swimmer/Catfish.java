package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class Catfish extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 8;
    }
}
