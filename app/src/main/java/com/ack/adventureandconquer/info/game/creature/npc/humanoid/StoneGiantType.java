package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.animal.CaveBear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class StoneGiantType extends HumanoidGiantFactory<StoneGiant> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected int getGangSize() {
        return d2.role();
    }

    @Override
    protected int getWarBandSize() {
        return d6.role();
    }

    @Override
    protected int getVillageSize() {
        return d6.role();
    }

    @Override
    protected StoneGiant createMonster() {
        StoneGiant giant = new StoneGiant();
        giant.roleHitPoints();

        return giant;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();

        boolean hasGuards = d100.role() <= 50;
        if (hasGuards) {
            int caveBearNumber = d4.role();

            for (int index = 0; index < caveBearNumber; index++) {
                CaveBear bear = new CaveBear();
                bear.roleHitPoints();

                monsters.add(bear);
            }
        }

        return monsters;
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
