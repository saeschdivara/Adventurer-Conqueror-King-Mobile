package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class Crocodile extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
