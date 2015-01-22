package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class DoppelgangerType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 20;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Doppelganger.getThrong();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Throng";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Doppelganger.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
