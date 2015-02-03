package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class PiranhaFishType extends NpcFactory<PiranhaFish> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    protected PiranhaFish createMonster() {
        PiranhaFish monster = new PiranhaFish();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d4.role() + d4.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Pack";
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
