package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class SpitCobraSnakeType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return SpitCobraSnake.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Quiver";
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
