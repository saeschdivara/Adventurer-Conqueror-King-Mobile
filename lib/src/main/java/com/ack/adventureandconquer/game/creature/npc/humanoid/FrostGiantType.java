package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.animal.DireWolf;
import com.ack.adventureandconquer.game.creature.npc.animal.PolarBear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class FrostGiantType extends HumanoidGiantFactory<FrostGiant> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 30;
    }

    @Override
    protected int getGangSize() {
        return d2.role();
    }

    @Override
    protected int getWarBandSize() {
        return d4.role();
    }

    @Override
    protected int getVillageSize() {
        return d6.role();
    }

    @Override
    protected FrostGiant createMonster() {
        FrostGiant giant = new FrostGiant();
        giant.roleHitPoints();

        return giant;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {

        List<Npc> monsters = new ArrayList<>();

        int animalDiceNumber = d10.role();
        if (animalDiceNumber <= 8) {
            int direWolfNumber = d6.role() + d6.role() + d6.role() + d6.role() + d6.role() + d6.role();

            for (int index = 0; index < direWolfNumber; index++) {
                DireWolf wolf = new DireWolf();
                wolf.roleHitPoints();

                monsters.add(wolf);
            }
        }
        else {
            int polarBearNumber = d6.role() + d6.role() + d6.role();

            for (int index = 0; index < polarBearNumber; index++) {
                PolarBear bear = new PolarBear();
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
