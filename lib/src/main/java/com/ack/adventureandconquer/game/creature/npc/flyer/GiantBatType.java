package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class GiantBatType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return com.ack.adventureandconquer.game.creature.npc.animal.GiantBat.getFlock();

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
