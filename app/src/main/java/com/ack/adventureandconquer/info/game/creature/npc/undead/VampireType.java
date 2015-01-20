package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 18/01/15.
 */
public class VampireType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 25;
    }
}
