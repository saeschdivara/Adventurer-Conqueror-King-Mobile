package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;

/**
 * Created by saskyrar on 17/01/15.
 */
public class CloudGiantType implements IsNpc {
    @Override
    public boolean isLair(int number) {
        return number >= 40;
    }
}
