package com.ack.adventureandconquer.info.game.creature.npc.swimmer;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class SeaSnakeType extends NpcFactory<SeaSnake> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }

    @Override
    protected SeaSnake createMonster() {
        SeaSnake monster = new SeaSnake();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getMonsterList( d8.role() );
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Den";
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
