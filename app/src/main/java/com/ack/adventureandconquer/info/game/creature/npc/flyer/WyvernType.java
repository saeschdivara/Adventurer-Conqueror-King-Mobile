package com.ack.adventureandconquer.info.game.creature.npc.flyer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class WyvernType extends NpcFactory<Wyvern> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 30;
    }

    @Override
    protected Wyvern createMonster() {
        Wyvern monster = new Wyvern();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d6.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Wing";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d6.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Aerie";
    }
}
