package com.ack.adventureandconquer.info.game.creature.npc.flyer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 17/01/15.
 */
public class PterodactylType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }
}
