package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class CaeciliaType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 25;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Caecilia.getGroup();
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
