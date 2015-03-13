package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class OrcType extends HumanoidMonsterFactory<Orc> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }

    @Override
    protected Orc createMonster() {
        Orc monster = new Orc();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    protected Orc createChampion() {
        Orc champion = new Orc();
        champion.setChampion(true);
        champion.setArmorClass(4);
        champion.setAdditionalHitPoints(1);
        champion.setHitDice(1);
        champion.setHitPoints(8);

        return champion;
    }

    @Override
    protected Orc createSubChieftain() {
        Orc subChieftain = new Orc();
        subChieftain.setSubChieftain(true);
        subChieftain.setArmorClass(5);
        subChieftain.setHitDice(2);
        subChieftain.setHitPoints(12);

        return subChieftain;
    }

    @Override
    protected Orc createChieftain() {
        Orc chieftain = new Orc();
        chieftain.setChieftain(true);
        chieftain.setArmorClass(6);
        chieftain.setHitDice(4);
        chieftain.setHitPoints(20);

        return chieftain;
    }

    @Override
    protected int getFemaleMonstersNumber(int maleNumbers) {
        return maleNumbers;
    }

    @Override
    protected int getYoungMonstersNumber(int maleNumbers) {
        return 0;
    }

    @Override
    protected Orc createFemale() {
        Orc female = new Orc();
        female.setType(HumanoidMonster.Type.FEMALE);

        Goblin goblin = new Goblin();
        goblin.roleHitPoints();

        female.setArmorClass(goblin.getArmorClass());
        female.setHitDice(goblin.getHitDice());
        female.setHitPoints(goblin.getHitPoints());

        return female;
    }

    @Override
    protected Orc createYoung() {
        return null;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();

        boolean hasOgres = d100.role() <= 50;
        if (hasOgres) {
            int ogreNumber = d4.role() + 1;
            for (int index = 0; index < ogreNumber; index++) {
                Ogre ogre = new Ogre();
                ogre.roleHitPoints();

                monsters.add(ogre);
            }
        }

        boolean hasTrolls = d100.role() <= 25;
        if (hasTrolls) {
            int trollNumber = d4.role();
            for (int index = 0; index < trollNumber; index++) {
                Troll troll = new Troll();
                troll.roleHitPoints();

                monsters.add(troll);
            }
        }

        return monsters;
    }

    @Override
    protected int getGangSize() {
        return d4.role() + d4.role();
    }

    @Override
    protected int getWarBandSize() {
        return d6.role() + d6.role();
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
