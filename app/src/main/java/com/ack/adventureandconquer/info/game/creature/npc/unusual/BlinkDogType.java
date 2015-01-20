package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class BlinkDogType implements IsNpcType {

    @Override
    public boolean isLair(int number) {
        return number >= 20;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return BlinkDog.getRoute();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Route";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return BlinkDog.getDen();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Den";
    }
}
