package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class MermanType extends NpcFactory<Merman> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected Merman createMonster() {
        Merman monster = new Merman();
        monster.roleHitPoints();

        return monster;
    }

    protected Merman createLeader() {
        Merman monster = new Merman();
        monster.setHitDice(2);
        monster.setLeader(true);
        monster.roleHitPoints();

        return monster;
    }

    protected Merman createExceptionalLeader() {
        Merman monster = new Merman();
        monster.setHitDice(4);
        monster.setLeader(true);
        monster.roleHitPoints();

        return monster;
    }

    public List<Npc> getBand(int size) {
        List<Npc> allBands = new ArrayList<>();

        for (int index = 0; index < size; index++) {
            List<Npc> band = super.getMonsterList( d20.role() );
            allBands.addAll(band);

            Merman leader = createLeader();
            allBands.add(leader);
        }

        return allBands;
    }

    public List<Npc> getVillage() {
        List<Npc> village = getBand( d20.role() + d20.role() );

        Merman leader = createExceptionalLeader();
        village.add(leader);

        // fish??

        // Create young and women
        int nonMaleNumber = village.size() * 2;
        for (int index = 0; index < nonMaleNumber; index++) {
            Merman someone = createMonster();
            village.add(someone);
        }

        // Rockfish

        return village;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getBand(1);
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Band";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}
