package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class PixieType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 5;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Pixie.getWing();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Wing";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Pixie.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
