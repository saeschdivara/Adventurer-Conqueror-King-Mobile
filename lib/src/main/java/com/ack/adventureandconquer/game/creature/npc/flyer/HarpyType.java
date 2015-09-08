package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class HarpyType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Harpy.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Wing";
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
