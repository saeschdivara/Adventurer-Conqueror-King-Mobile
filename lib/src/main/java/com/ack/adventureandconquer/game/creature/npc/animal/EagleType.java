package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class EagleType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 20;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Eagle.getGroup();
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
