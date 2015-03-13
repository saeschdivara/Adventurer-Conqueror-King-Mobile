package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class ElfType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Elf.getCompany();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Company";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Elf.getFastness();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Fastness";
    }
}
