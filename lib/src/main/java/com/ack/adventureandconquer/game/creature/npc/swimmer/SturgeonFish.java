package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class SturgeonFish extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 9;
    }

    @Override
    public int getDefaultHitDice() {
        return 10;
    }
}
