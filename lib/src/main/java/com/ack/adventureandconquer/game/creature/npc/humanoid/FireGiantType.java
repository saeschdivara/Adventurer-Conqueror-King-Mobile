package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.dragon.Hydra;
import com.ack.adventureandconquer.game.creature.npc.unusual.Hellhound;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class FireGiantType extends HumanoidGiantFactory<FireGiant> implements IsNpcType {

    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }

    @Override
    protected int getGangSize() {
        return d2.role();
    }

    @Override
    protected int getWarBandSize() {
        return d3.role();
    }

    @Override
    protected int getVillageSize() {
        return d3.role();
    }

    @Override
    protected FireGiant createMonster() {
        FireGiant giant = new FireGiant();
        giant.roleHitPoints();

        return giant;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();
        int additionalMonsterNumber = d10.role();

        // See if they have hell hounds
        if (additionalMonsterNumber <= 8) {
            int hellHoundNumber = d6.role() + d6.role() + d6.role();
            for (int index = 0; index < hellHoundNumber; index++) {
                Hellhound hellhound = new Hellhound();
                hellhound.roleHitPoints();

                monsters.add(hellhound);
            }
        }
        // otherwise hydras
        else {
            int hydraNumber = d3.role();
            for (int index = 0; index < hydraNumber; index++) {
                Hydra hydra = new Hydra();
                hydra.roleHitPoints();

                monsters.add(hydra);
            }
        }

        return monsters;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getWarband();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Warband";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}
