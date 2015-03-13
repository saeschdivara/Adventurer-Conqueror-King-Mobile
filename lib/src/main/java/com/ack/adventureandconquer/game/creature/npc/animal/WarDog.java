package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 22/01/15.
 */
public class WarDog extends Npc {
    @Override
    public int getAdditionalHitPoints() {
        return 2;
    }

    @Override
    public int getArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
