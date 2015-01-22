package com.ack.adventureandconquer.info.game.creature.npc.dragon;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class BasiliskType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 40;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Basilisk.getBask();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Bask";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Basilisk.getNest();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Nest";
    }
}
