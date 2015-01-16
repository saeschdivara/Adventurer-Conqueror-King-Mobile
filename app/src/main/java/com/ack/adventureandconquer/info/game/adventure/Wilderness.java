package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Wilderness {

    public void findEncounterByTerrain(IsTerrain terrain) {
        IsDice dice = new D8();
        int roledDice = dice.role();
        IsCreatureType type = terrain.getEnemyType(roledDice);
        System.out.println(type);
    }

}
