package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class DryadType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Dryad.getSolitary();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Solitary";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Dryad.getGrove();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Grove";
    }
}
