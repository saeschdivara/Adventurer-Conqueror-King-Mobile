package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 09/02/15.
 */
public class SkitteringMaw extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 8;
    }
}
