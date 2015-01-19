package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;

/**
 * Created by saskyrar on 17/01/15.
 */
public class RattlerSnakeType implements IsNpc {
    @Override
    public boolean isLair(int number) {
        return false;
    }
}
