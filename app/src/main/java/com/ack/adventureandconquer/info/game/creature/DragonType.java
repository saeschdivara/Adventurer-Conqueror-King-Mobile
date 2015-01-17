package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;

/**
 * Created by saskyrar on 15/01/15.
 */
public class DragonType implements IsCreatureType {
    @Override
    public IsNpc getNpcType(IsTerrain terrain, int number) {
        return null;
    }
}
