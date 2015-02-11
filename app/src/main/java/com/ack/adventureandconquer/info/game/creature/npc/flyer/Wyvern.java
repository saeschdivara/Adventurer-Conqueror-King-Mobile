package com.ack.adventureandconquer.info.game.creature.npc.flyer;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 11/02/15.
 */
public class Wyvern extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 7;
    }
}
