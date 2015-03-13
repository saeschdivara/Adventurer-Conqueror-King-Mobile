package com.ack.adventureandconquer.game.creature.npc.undead;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 11/02/15.
 */
public class Mummy extends Npc {
    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 5;
    }
}
