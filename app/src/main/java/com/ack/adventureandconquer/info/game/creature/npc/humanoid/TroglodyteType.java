package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class TroglodyteType extends HumanoidMonsterFactory<Troglodyte> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 15;
    }

    @Override
    protected int getGangSize() {
        return d8.role();
    }

    @Override
    protected int getWarBandSize() {
        return d10.role();
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
        return 33;
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
        return 0;
    }

    @Override
    protected Troglodyte createMonster() {
        Troglodyte monster = new Troglodyte();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    protected Troglodyte createChampion() {
        Troglodyte champion = new Troglodyte();
        champion.setChampion(true);

        champion.setArmorClass(5);
        champion.setHitDice(3);
        champion.setHitPoints(16);

        return champion;
    }

    @Override
    protected Troglodyte createSubChieftain() {
        Troglodyte subChieftain = new Troglodyte();
        subChieftain.setSubChieftain(true);

        subChieftain.setArmorClass(6);
        subChieftain.setHitDice(4);
        subChieftain.setHitPoints(20);

        return subChieftain;
    }

    @Override
    protected Troglodyte createChieftain() {
        Troglodyte chieftain = new Troglodyte();
        chieftain.setSubChieftain(true);

        chieftain.setArmorClass(7);
        chieftain.setHitDice(6);
        chieftain.setHitPoints(28);

        return chieftain;
    }

    @Override
    protected Troglodyte createFemale() {
        Troglodyte female = new Troglodyte();
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
    protected Troglodyte createYoung() {
        return null;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();
        int monsterNumber = d4.role() + d4.role();

        for (int index = 0; index < monsterNumber; index++) {
            Troglodyte champion = createChampion();
            monsters.add(champion);
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
        return getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}
