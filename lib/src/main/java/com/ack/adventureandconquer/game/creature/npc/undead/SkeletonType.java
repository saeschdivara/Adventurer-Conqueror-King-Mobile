package com.ack.adventureandconquer.game.creature.npc.undead;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class SkeletonType extends NpcFactory<Skeleton> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }

    @Override
    protected Skeleton createMonster() {
        Skeleton monster = new Skeleton();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d10.role() + d10.role() + d10.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Horde";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d10.role() + d10.role() + d10.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Boneyard";
    }
}
