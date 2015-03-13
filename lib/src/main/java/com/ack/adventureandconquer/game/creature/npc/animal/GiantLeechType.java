package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class GiantLeechType extends NpcFactory<GiantLeech> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    protected GiantLeech createMonster() {
        GiantLeech monster = new GiantLeech();
        monster.roleHitPoints();

        return  monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d4.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Brood";
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
