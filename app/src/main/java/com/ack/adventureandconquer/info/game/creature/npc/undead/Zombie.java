package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 11/02/15.
 */
public class Zombie extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 1;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
