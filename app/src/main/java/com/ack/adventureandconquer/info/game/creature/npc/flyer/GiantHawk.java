package com.ack.adventureandconquer.info.game.creature.npc.flyer;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 22/01/15.
 */
public class GiantHawk extends Npc {
    @Override
    public int getAdditionalHitPoints() {
        return 3;
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
