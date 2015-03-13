package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WerebearType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Werebear.getSloth();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Sloth";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Werebear.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
