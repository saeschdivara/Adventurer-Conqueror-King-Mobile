package com.ack.adventureandconquer.game.creature.npc.undead;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 11/02/15.
 */
public class Ghoul extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
