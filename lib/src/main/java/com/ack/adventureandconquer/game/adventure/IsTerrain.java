package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.IsCreatureType;

/**
 * Created by saskyrar on 15/01/15.
 */
public interface IsTerrain {

    public IsCreatureType getEnemyType(int number);

    public String getTerrainName();
}
