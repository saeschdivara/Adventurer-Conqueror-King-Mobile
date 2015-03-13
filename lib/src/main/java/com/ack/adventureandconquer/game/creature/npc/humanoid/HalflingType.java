package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class HalflingType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 90;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Halfling.getMeet();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Meet";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Halfling.getShire();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Shire";
    }
}
