package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class DwarfType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 50;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Dwarf.getCompany();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Company";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Dwarf.getVault();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Vault";
    }
}
