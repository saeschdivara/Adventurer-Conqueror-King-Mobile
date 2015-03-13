package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WereboarType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 20;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Wereboar.getHerd();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Herd";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Wereboar.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
