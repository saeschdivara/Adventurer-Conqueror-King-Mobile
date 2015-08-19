package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class LamiaType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 40;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Lamia.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Solidary";
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
