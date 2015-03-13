package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class StormGiantType extends HumanoidGiantFactory<StormGiant> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 45;
    }

    @Override
    protected int getGangSize() {
        return 1;
    }

    @Override
    protected int getWarBandSize() {
        return d3.role();
    }

    @Override
    protected int getVillageSize() {
        return d3.role();
    }

    @Override
    protected StormGiant createMonster() {
        StormGiant giant = new StormGiant();
        giant.roleHitPoints();

        return giant;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        return new ArrayList<>();
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getWarband();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Warband";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
