package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D100;
import com.ack.adventureandconquer.game.dice.D12;
import com.ack.adventureandconquer.game.dice.D8;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 15/01/15.
 * Modified by Florian Hübner
 */
public class Wilderness {

    public Encounter findEncounterByTerrain(IsTerrain terrain) {
        IsDice diceD8 = new D8();
        IsDice diceD12 = new D12();
        IsDice diceD100 = new D100();

        Encounter encounter = new Encounter();

        // Enemy type => Needs to be looked up in a terrain (i.e. Grass)
        // Android Studio debug Watches: Shift+Strg+i then F2
//        int rolledEnemyTypeDice = diceD8.role();
        int rolledEnemyTypeDice = 8;
        IsCreatureType creatureType = terrain.getEnemyType(rolledEnemyTypeDice);
        encounter.setCreatureType(creatureType);

        // Npc type => Needs to be looked up in a npc type (i.e. Humanoid)
//        int rolledNpcTypeDice = diceD12.role();
        int rolledNpcTypeDice = 4;
        IsNpcType npcType = creatureType.getNpcType(terrain, rolledNpcTypeDice);
        encounter.setNpcType(npcType);

        // Is monster lair
        int rolledLairDice = diceD100.role();
        rolledLairDice = 13;
        System.out.println(rolledLairDice);
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
        encounter.setWildernessType(terrain.getTerrainName());

        return encounter;
    }

}
