package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WereratType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 30;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Wererat.getPlague();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Plague";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Wererat.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
