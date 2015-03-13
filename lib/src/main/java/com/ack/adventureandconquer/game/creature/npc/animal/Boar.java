package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 25/01/15.
 */
public class Boar extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
