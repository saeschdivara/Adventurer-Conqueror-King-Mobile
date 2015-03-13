package com.ack.adventureandconquer.game.creature.npc.undead;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class SpectreType extends NpcFactory<Spectre> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 20;
    }

    @Override
    protected Spectre createMonster() {
        Spectre monster = new Spectre();
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
        return "Haunt";
    }
}
