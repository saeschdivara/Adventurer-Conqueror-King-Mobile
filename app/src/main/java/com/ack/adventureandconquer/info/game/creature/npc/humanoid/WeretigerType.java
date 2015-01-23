package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WeretigerType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 15;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Weretiger.getTroop();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Troop";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Weretiger.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
