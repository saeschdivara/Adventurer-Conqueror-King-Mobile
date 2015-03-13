package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class CatfishType extends NpcFactory<Catfish> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    protected Catfish createMonster() {
        Catfish monster = new Catfish();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d2.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "School";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return null;
    }

    @Override
    public String getLairWildnessEncounterName() {
        return null;
    }
}
