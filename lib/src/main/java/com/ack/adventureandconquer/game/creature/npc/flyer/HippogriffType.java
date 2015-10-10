package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class HippogriffType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Hippogriff.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Herd";
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
