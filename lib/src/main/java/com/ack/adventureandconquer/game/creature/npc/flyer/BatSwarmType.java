package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class BatSwarmType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 50;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return com.ack.adventureandconquer.game.creature.npc.animal.BatSwarm.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Cloud";
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
