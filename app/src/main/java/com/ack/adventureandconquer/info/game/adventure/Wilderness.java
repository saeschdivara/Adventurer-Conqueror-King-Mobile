package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;
import com.ack.adventureandconquer.info.game.dice.D100;
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
        IsDice diceD100 = new D100();

        // Enemy type
        int rolledEnemyTypeDice = diceD8.role();
        IsCreatureType creatureType = terrain.getEnemyType(rolledEnemyTypeDice);

        // Npc type
        int rolledNpcTypeDice = diceD12.role();
        IsNpc npcType = creatureType.getNpcType(terrain, rolledNpcTypeDice);

        // Is monster lair
        int rolledLairDice = diceD100.role();
        boolean isLair = npcType.isLair(rolledLairDice);

        String encounterDescription = "You have found: " + creatureType.toString() + "\n";
        encounterDescription += npcType.toString() + "\n";
        encounterDescription += "is lair: " + String.valueOf(isLair) + "\n";

        return encounterDescription;
    }

}
