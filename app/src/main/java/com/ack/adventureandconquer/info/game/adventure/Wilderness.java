package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;
import com.ack.adventureandconquer.info.game.dice.D12;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Wilderness {

    public String findEncounterByTerrain(IsTerrain terrain) {
        IsDice diceD8 = new D8();
        IsDice diceD12 = new D12();

        int rolledEnemyTypeDice = diceD8.role();
        IsCreatureType creatureType = terrain.getEnemyType(rolledEnemyTypeDice);

        int rolledNpcTypeDice = diceD12.role();
        IsNpc npcType = creatureType.getNpcType(terrain, rolledNpcTypeDice);

        String encounterDescription = "You have found: " + creatureType.toString();
        System.out.println(npcType);

        return encounterDescription;
    }

}
