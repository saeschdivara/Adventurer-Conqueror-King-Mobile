package com.ack.adventureandconquer.info.game.creature.npc.men;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 17/01/15.
 */
public class BrigandType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 20;
    }
}
