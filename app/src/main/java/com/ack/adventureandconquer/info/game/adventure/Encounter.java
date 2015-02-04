package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 20/01/15.
 */
public class Encounter {

    private IsCreatureType creatureType;
    private IsNpcType npcType;
    private boolean isLair;
    private List<Npc> encounterNpcs;
    private String encounterGroupName;

    public IsCreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(IsCreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public IsNpcType getNpcType() {
        return npcType;
    }

    public void setNpcType(IsNpcType npcType) {
        this.npcType = npcType;
    }

    public boolean isLair() {
        return isLair;
    }

    public void setLair(boolean isLair) {
        this.isLair = isLair;
    }

    public List<Npc> getEncounterNpcs() {
        return encounterNpcs;
    }

    public void setEncounterNpcs(List<Npc> encounterNpcs) {
        this.encounterNpcs = encounterNpcs;
    }

    public String getEncounterGroupName() {
        return encounterGroupName;
    }

    public void setEncounterGroupName(String encounterGroupName) {
        this.encounterGroupName = encounterGroupName;
    }

    public String getDescription() {
        String encounterDescription = "You have found: " + getCreatureType().getClass().getSimpleName() + "\n";
        encounterDescription += getNpcType().getClass().getSimpleName() + "\n";
        encounterDescription += "is lair: " + String.valueOf(isLair) + "\n";
        encounterDescription += "Encounter Group Name: " + getEncounterGroupName() + "\n";
        encounterDescription += "Group Size: " + String.valueOf(getEncounterNpcs().size()) + "\n";

        return encounterDescription;
    }
}
