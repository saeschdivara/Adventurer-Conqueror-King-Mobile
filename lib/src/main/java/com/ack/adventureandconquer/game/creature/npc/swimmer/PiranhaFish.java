package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class PiranhaFish extends Npc {
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
