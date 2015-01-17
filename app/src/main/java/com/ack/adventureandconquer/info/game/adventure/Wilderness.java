package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Wilderness {

    public String findEncounterByTerrain(IsTerrain terrain) {
        IsDice dice = new D8();
        int rolledDice = dice.role();
        IsCreatureType type = terrain.getEnemyType(rolledDice);
        System.out.println(type);

        String encounterDescription = "You have found: " + type.toString();

        return encounterDescription;
    }

}
