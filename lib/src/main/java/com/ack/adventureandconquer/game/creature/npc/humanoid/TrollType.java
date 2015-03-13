package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class TrollType extends HumanoidMonsterFactory<Troll> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 40;
    }

    @Override
    protected int getGangSize() {
        return d8.role();
    }

    @Override
    protected int getWarBandSize() {
        return 0;
    }

    @Override
    protected int getVillageSize() {
        return d10.role();
    }

    @Override
    protected int getClericLevel() {
        return d4.role();
    }

    @Override
    protected int getMageLevel() {
        return d2.role();
    }

    @Override
    protected int getShamanChance() {
        return 50;
    }

    @Override
    protected int getWitchDoctorChance() {
        return 25;
    }

    @Override
    protected int getFemaleMonstersNumber(int maleNumbers) {
        return maleNumbers;
    }

    @Override
    protected int getYoungMonstersNumber(int maleNumbers) {
        return maleNumbers;
    }

    @Override
    protected Troll createMonster() {
        Troll monster = new Troll();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    protected Troll createChampion() {
        Troll champion = new Troll();
        champion.setChampion(true);
        champion.setArmorClass(6);
        champion.setHitDice(7);
        champion.setAdditionalHitPoints(3);
        champion.setHitPoints(51);

        return champion;
    }

    @Override
    protected Troll createSubChieftain() {
        Troll subChieftain = new Troll();
        subChieftain.setSubChieftain(true);
        subChieftain.setArmorClass(7);
        subChieftain.setHitDice(8);
        subChieftain.setAdditionalHitPoints(3);
        subChieftain.setHitPoints(45);

        return subChieftain;
    }

    @Override
    protected Troll createChieftain() {
        Troll chieftain = new Troll();
        chieftain.setChieftain(true);
        chieftain.setArmorClass(8);
        chieftain.setHitDice(10);
        chieftain.setAdditionalHitPoints(6);
        chieftain.setHitPoints(63);

        return chieftain;
    }

    @Override
    protected Troll createFemale() {
        Troll female = new Troll();
        female.setType(HumanoidMonster.Type.FEMALE);

        Ogre ogre = new Ogre();
        ogre.roleHitPoints();

        female.setArmorClass(ogre.getArmorClass());
        female.setHitDice(ogre.getHitDice());
        female.setAdditionalHitPoints(ogre.getAdditionalHitPoints());
        female.setHitPoints(ogre.getHitPoints());

        return female;
    }

    @Override
    protected Troll createYoung() {
        Troll young = new Troll();
        young.setType(HumanoidMonster.Type.YOUNG);

        Orc orc = new Orc();
        orc.roleHitPoints();

        young.setArmorClass(orc.getArmorClass());
        young.setHitDice(orc.getHitDice());
        young.setAdditionalHitPoints(orc.getAdditionalHitPoints());
        young.setHitPoints(orc.getHitPoints());

        return young;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();

        Troll subChieftain = createSubChieftain();
        monsters.add(subChieftain);

        int guardSize = d4.role();
        for (int index = 0; index < guardSize; index++) {
            Troll guard = createSubChieftain();
            guard.setSubChieftain(false);
            guard.setGuard(true);
            monsters.add(guard);
        }

        return monsters;
    }

    @Override
    protected boolean hasWarband() {
        return false;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return getGang();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Gang";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}
