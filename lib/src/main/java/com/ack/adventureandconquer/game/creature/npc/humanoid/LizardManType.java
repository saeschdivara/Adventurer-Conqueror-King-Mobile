package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class LizardManType extends HumanoidMonsterFactory<LizardMan> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 30;
    }

    @Override
    protected int getGangSize() {
        return d4.role() + d4.role();
    }

    @Override
    protected int getWarBandSize() {
        return d8.role();
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
        int femaleRounds = (maleNumbers / 20);
        int femaleNumber = 0;

        for (int index = 0; index < femaleRounds; index++) {
            int additionalFemales = d4.role() * 10;
            femaleNumber += additionalFemales;
        }

        return femaleNumber;
    }

    @Override
    protected int getYoungMonstersNumber(int maleNumbers) {
        return 0;
    }

    @Override
    protected LizardMan createMonster() {
        LizardMan lizardMan = new LizardMan();
        lizardMan.roleHitPoints();

        return lizardMan;
    }

    @Override
    protected LizardMan createChampion() {
        LizardMan champion = new LizardMan();
        champion.setChampion(true);

        champion.setArmorClass(5);
        champion.setHitDice(3);
        champion.setAdditionalHitPoints(1);
        champion.setHitPoints(17);

        return champion;
    }

    @Override
    protected LizardMan createSubChieftain() {
        LizardMan subChieftain = new LizardMan();
        subChieftain.setSubChieftain(true);

        subChieftain.setArmorClass(6);
        subChieftain.setHitDice(4);
        subChieftain.setAdditionalHitPoints(1);
        subChieftain.setHitPoints(21);

        return subChieftain;
    }

    @Override
    protected LizardMan createChieftain() {
        LizardMan chieftain = new LizardMan();
        chieftain.setChieftain(true);

        chieftain.setArmorClass(7);
        chieftain.setHitDice(6);
        chieftain.setAdditionalHitPoints(2);
        chieftain.setHitPoints(30);

        return chieftain;
    }

    @Override
    protected LizardMan createFemale() {
        LizardMan female = new LizardMan();
        female.setType(HumanoidMonster.Type.FEMALE);

        Gnoll gnoll = new Gnoll();
        gnoll.roleHitPoints();

        female.setArmorClass(gnoll.getArmorClass());
        female.setHitDice(gnoll.getHitDice());
        female.setAdditionalHitPoints(gnoll.getAdditionalHitPoints());
        female.setHitPoints(gnoll.getHitPoints());

        return female;
    }

    @Override
    protected LizardMan createYoung() {
        return null;
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
