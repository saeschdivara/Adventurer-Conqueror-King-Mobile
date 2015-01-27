package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 26/01/15.
 */
abstract class HumanoidMonsterFactory<MonsterClass extends HumanoidMonster> extends HumanoidFactory {

    public List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = getGangSize();

        for (int index = 0; index < gangSize; index++) {
            MonsterClass monster = createMonster();
            monster.roleHitPoints();

            gang.add(monster);
        }

        MonsterClass champion = createChampion();
        gang.add(champion);

        return gang;
    }

    public List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warBandSize = getWarBandSize();

        for (int index = 0; index < warBandSize; index++) {
            List<Npc> gang = getGang();

            warband.addAll(gang);
        }

        MonsterClass subChieftain = createSubChieftain();
        warband.add(subChieftain);

        return warband;
    }

    public List<Npc> getVillage() {
        List<Npc> village = new ArrayList<>();
        int villageSize = getVillageSize();

        for (int index = 0; index < villageSize; index++) {
            if (hasWarband()) {
                List<Npc> warband = getWarband();
                village.addAll(warband);
            }
            else {
                List<Npc> gang = getGang();
                village.addAll(gang);
            }
        }

        MonsterClass chieftain = createChieftain();
        village.add(chieftain);

        int maleNumber = village.size();
        int femaleNumber = getFemaleMonstersNumber(maleNumber);
        int youngNumber = getYoungMonstersNumber(maleNumber);

        for (int index = 0; index < femaleNumber; index++) {
            MonsterClass female = createFemale();
            village.add(female);
        }

        for (int index = 0; index < youngNumber; index++) {
            MonsterClass young = createYoung();
            village.add(young);
        }

        List<Npc> additionalMonsters = getAdditionalMonsters();
        village.addAll(additionalMonsters);

        boolean hasShaman = d100.role() <= getShamanChance();
        if (hasShaman) {
            MonsterClass shaman = createSubChieftain(); // TODO: Check for Orc
            shaman.setSubChieftain(false);
            shaman.setClericalLevel(getClericLevel());
            shaman.setShaman(true);

            village.add(shaman);
        }

        boolean hasWitchDoctor = d100.role() <= getWitchDoctorChance();
        if (hasWitchDoctor) {
            MonsterClass witchDoctor = createChampion();
            witchDoctor.setChampion(false);
            witchDoctor.setMageLevel(getMageLevel());
            witchDoctor.setWitchDoctor(true);

            village.add(witchDoctor);
        }

        return village;
    }

    protected boolean hasWarband() {
        return true;
    }

    abstract protected int getGangSize();
    abstract protected int getWarBandSize();
    abstract protected int getVillageSize();

    abstract protected int getClericLevel();
    abstract protected int getMageLevel();

    abstract protected int getShamanChance();
    abstract protected int getWitchDoctorChance();

    abstract protected int getFemaleMonstersNumber(int maleNumbers);
    abstract protected int getYoungMonstersNumber(int maleNumbers);

    abstract protected MonsterClass createMonster();

    abstract protected MonsterClass createChampion();

    abstract protected MonsterClass createSubChieftain();

    abstract protected MonsterClass createChieftain();

    abstract protected MonsterClass createFemale();

    abstract protected MonsterClass createYoung();

    abstract protected List<Npc> getAdditionalMonsters();
}
