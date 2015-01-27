package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 27/01/15.
 */
abstract public class HumanoidGiantFactory<GiantClass extends Npc> extends HumanoidFactory {

    public List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = getGangSize();

        for (int index = 0; index < gangSize; index++) {
            GiantClass monster = createMonster();
            gang.add(monster);
        }

        return gang;
    }

    public List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warBandSize = getWarBandSize();

        for (int index = 0; index < warBandSize; index++) {
            GiantClass monster = createMonster();
            warband.add(monster);
        }

        return warband;
    }

    public List<Npc> getLair() {
        List<Npc> village = new ArrayList<>();
        int villageSize = getVillageSize();

        for (int index = 0; index < villageSize; index++) {
            GiantClass monster = createMonster();
            village.add(monster);
        }

        List<Npc> additionalMonsters = getAdditionalMonsters();
        village.addAll(additionalMonsters);

        return village;
    }

    abstract protected int getGangSize();
    abstract protected int getWarBandSize();
    abstract protected int getVillageSize();

    abstract protected GiantClass createMonster();

    abstract protected List<Npc> getAdditionalMonsters();
}
