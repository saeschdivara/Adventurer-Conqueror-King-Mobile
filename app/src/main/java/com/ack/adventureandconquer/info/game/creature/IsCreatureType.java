package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 15/01/15.
 */
public interface IsCreatureType {
    public IsNpcType getNpcType(IsTerrain terrain, int number);
}
