package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class GiantCrocodile implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return null;
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return null;
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return null;
    }

    @Override
    public String getLairWildnessEncounterName() {
        return null;
    }
}
