package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class CentaurType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 5;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Centaur.getPack();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Troup";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Centaur.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
