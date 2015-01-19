package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;

/**
 * Created by saskyrar on 18/01/15.
 */
public class VampireType implements IsNpc {
    @Override
    public boolean isLair(int number) {
        return number >= 25;
    }
}
