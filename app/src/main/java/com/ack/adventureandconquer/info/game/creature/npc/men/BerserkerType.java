package com.ack.adventureandconquer.info.game.creature.npc.men;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.NpcFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class BerserkerType extends NpcFactory<Berserker> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 20;
    }

    @Override
    protected Berserker createMonster() {
        Berserker berserker = new Berserker();
        berserker.roleHitPoints();

        return berserker;
    }

    private List<Npc> createWarband() {
        List<Npc> warband = new ArrayList<>();
        int warbandSize = d8.role();

        for (int i = 0; i < warbandSize; i++) {
            warband.addAll(getMonsterList( d6.role() ));
        }

        // add 4th level fighter

        return warband;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return createWarband();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Warband";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return createWarband();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
