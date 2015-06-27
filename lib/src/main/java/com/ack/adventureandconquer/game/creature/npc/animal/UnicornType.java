package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class UnicornType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 5;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Unicorn.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Blessing";
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
