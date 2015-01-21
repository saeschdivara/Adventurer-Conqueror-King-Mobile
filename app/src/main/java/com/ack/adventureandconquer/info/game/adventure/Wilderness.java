package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.D12;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Wilderness {

    public Encounter findEncounterByTerrain(IsTerrain terrain) {
        IsDice diceD8 = new D8();
        IsDice diceD12 = new D12();
        IsDice diceD100 = new D100();

        Encounter encounter = new Encounter();

        // Enemy type
//        int rolledEnemyTypeDice = diceD8.role();
        int rolledEnemyTypeDice = 5;
        IsCreatureType creatureType = terrain.getEnemyType(rolledEnemyTypeDice);
        encounter.setCreatureType(creatureType);

        // Npc type
//        int rolledNpcTypeDice = diceD12.role();
        int rolledNpcTypeDice = 3;
        IsNpcType npcType = creatureType.getNpcType(terrain, rolledNpcTypeDice);
        encounter.setNpcType(npcType);

        // Is monster lair
        int rolledLairDice = diceD100.role();
        System.out.println("100d role: " + String.valueOf(rolledLairDice));
        boolean isLair = npcType.isLair(rolledLairDice);
        encounter.setLair(isLair);

        List<Npc> npcs;
        String encounterGroupName;

        if (isLair) {
            encounterGroupName = npcType.getLairWildnessEncounterName();
            npcs = npcType.getLairWildnessEncounter();
        }
        else {
            encounterGroupName = npcType.getNormalWildnessEncounterName();
            npcs = npcType.getNormalWildnessEncounter();
        }

        if (npcs == null) {
            npcs = new ArrayList<>();
        }

        encounter.setEncounterGroupName(encounterGroupName);
        encounter.setEncounterNpcs(npcs);

        return encounter;
    }

}
