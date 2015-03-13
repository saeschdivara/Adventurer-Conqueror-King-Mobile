package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class BugbearType extends HumanoidMonsterFactory<Bugbear> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected int getGangSize() {
        return d4.role() + d4.role();
    }

    @Override
    protected int getWarBandSize() {
        return d4.role();
    }

    @Override
    protected int getVillageSize() {
        return d10.role();
    }

    @Override
    protected int getClericLevel() {
        return d6.role();
    }

    @Override
    protected int getMageLevel() {
        return d4.role();
    }

    @Override
    protected int getShamanChance() {
        return 75;
    }

    @Override
    protected int getWitchDoctorChance() {
        return 50;
    }

    @Override
    protected int getFemaleMonstersNumber(int maleNumbers) {
        return maleNumbers / 2;
    }

    @Override
    protected int getYoungMonstersNumber(int maleNumbers) {
        return maleNumbers / 2;
    }

    @Override
    protected Bugbear createMonster() {
        Bugbear monster = new Bugbear();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    protected Bugbear createChampion() {
        Bugbear champion = new Bugbear();
        champion.setChampion(true);

        champion.setArmorClass(5);
        champion.setHitDice(4);
        champion.setAdditionalHitPoints(1);
        champion.setHitPoints(25);

        return champion;
    }

    @Override
    protected Bugbear createSubChieftain() {
        Bugbear subChieftain = new Bugbear();
        subChieftain.setSubChieftain(true);

        subChieftain.setArmorClass(6);
        subChieftain.setHitDice(5);
        subChieftain.setAdditionalHitPoints(1);
        subChieftain.setHitPoints(29);

        return subChieftain;
    }

    @Override
    protected Bugbear createChieftain() {
        Bugbear chieftain = new Bugbear();
        chieftain.setChieftain(true);

        chieftain.setArmorClass(7);
        chieftain.setHitDice(7);
        chieftain.setAdditionalHitPoints(2);
        chieftain.setHitPoints(37);

        return chieftain;
    }

    @Override
    protected Bugbear createFemale() {
        Bugbear female = new Bugbear();
        female.setType(HumanoidMonster.Type.FEMALE);

        Hobgoblin hobgoblin = new Hobgoblin();
        hobgoblin.roleHitPoints();

        female.setArmorClass(hobgoblin.getArmorClass());
        female.setHitDice(hobgoblin.getHitDice());
        female.setAdditionalHitPoints(hobgoblin.getAdditionalHitPoints());
        female.setHitPoints(hobgoblin.getHitPoints());

        return female;
    }

    @Override
    protected Bugbear createYoung() {
        Bugbear young = new Bugbear();
        young.setType(HumanoidMonster.Type.YOUNG);

        Kobold kobold = new Kobold();
        kobold.roleHitPoints();

        young.setArmorClass(kobold.getArmorClass());
        young.setHitDice(kobold.getHitDice());
        young.setAdditionalHitPoints(kobold.getAdditionalHitPoints());
        young.setHitPoints(kobold.getHitPoints());

        return young;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        return new ArrayList<>();
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
        return getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}
