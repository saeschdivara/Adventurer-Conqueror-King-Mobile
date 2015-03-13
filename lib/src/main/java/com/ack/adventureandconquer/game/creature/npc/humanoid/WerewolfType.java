package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WerewolfType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Werewolf.getRoute();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Route";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Werewolf.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
