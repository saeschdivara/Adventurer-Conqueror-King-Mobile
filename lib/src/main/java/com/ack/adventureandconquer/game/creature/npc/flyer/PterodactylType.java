package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class PterodactylType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Peterodactyl.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Flight";
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
