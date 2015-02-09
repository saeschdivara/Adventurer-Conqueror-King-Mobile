package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class DragonTurtleType extends NpcFactory<DragonTurtle> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 5;
    }

    @Override
    protected DragonTurtle createMonster() {
        DragonTurtle monster = new DragonTurtle();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList(1);
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Solitary";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getMonsterList(1);
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
