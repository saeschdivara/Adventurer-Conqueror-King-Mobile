package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class TuataraLizardType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 25;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return TuataraLizard.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Lounge";
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
