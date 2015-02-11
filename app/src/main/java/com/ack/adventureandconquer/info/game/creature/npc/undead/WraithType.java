package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class WraithType extends NpcFactory<Wraith> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected Wraith createMonster() {
        Wraith monster = new Wraith();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d6.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Horde";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d6.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Haunt";
    }
}
