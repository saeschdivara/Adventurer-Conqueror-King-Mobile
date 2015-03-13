package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class ThroghrinType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Throghrin.getPack();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Pack";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Throghrin.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
