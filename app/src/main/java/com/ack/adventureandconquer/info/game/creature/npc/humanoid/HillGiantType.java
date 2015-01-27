package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class HillGiantType extends HumanoidGiantFactory<HillGiant> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected int getGangSize() {
        return d4.role();
    }

    @Override
    protected int getWarBandSize() {
        return d4.role() + d4.role();
    }

    @Override
    protected int getVillageSize() {
        return d4.role() + d4.role();
    }

    @Override
    protected HillGiant createMonster() {
        HillGiant giant = new HillGiant();
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
