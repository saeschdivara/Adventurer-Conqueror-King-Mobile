package com.ack.adventureandconquer.game.creature.npc.undead;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class WightType extends NpcFactory<Wight> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 70;
    }

    @Override
    protected Wight createMonster() {
        Wight monster = new Wight();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d8.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Horde";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d8.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Barrow";
    }
}
