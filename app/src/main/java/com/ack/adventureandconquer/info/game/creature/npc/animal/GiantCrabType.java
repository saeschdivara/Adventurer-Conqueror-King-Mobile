package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class GiantCrabType extends NpcFactory<GiantCrab> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 90;
    }

    @Override
    protected GiantCrab createMonster() {
        GiantCrab crab = new GiantCrab();
        crab.roleHitPoints();

        return crab;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d6.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Cluster";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d6.role() + d6.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Colony";
    }
}
