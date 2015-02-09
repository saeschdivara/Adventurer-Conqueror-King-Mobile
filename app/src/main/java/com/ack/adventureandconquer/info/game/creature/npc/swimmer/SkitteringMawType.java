package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class SkitteringMawType extends NpcFactory<SkitteringMaw> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    @Override
    protected SkitteringMaw createMonster() {
        SkitteringMaw monster = new SkitteringMaw();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d4.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Shiver";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList( d4.role() );
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Den";
    }
}
