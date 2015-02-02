package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class NaiadType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 95;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Naiad.getSolitary();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Solitary";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Naiad.getWateryLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Watery lair";
    }
}
