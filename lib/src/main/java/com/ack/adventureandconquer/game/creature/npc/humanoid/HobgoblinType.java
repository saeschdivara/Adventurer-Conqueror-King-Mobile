package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class HobgoblinType extends HumanoidMonsterFactory<Hobgoblin> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }

    @Override
    protected int getGangSize() {
        return d6.role();
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
        return d8.role();
    }

    @Override
    protected int getMageLevel() {
        return d6.role();
    }

    @Override
    protected int getShamanChance() {
        return 90;
    }

    @Override
    protected int getWitchDoctorChance() {
        return 75;
    }

    @Override
    protected int getFemaleMonstersNumber(int maleNumbers) {
        return maleNumbers + (maleNumbers / 2);
    }

    @Override
    protected int getYoungMonstersNumber(int maleNumbers) {
        return 0;
    }

    @Override
    protected Hobgoblin createMonster() {
        Hobgoblin monster = new Hobgoblin();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    protected Hobgoblin createChampion() {
        Hobgoblin champion = new Hobgoblin();
        champion.setChampion(true);

        champion.setArmorClass(5);
        champion.setHitDice(2);
        champion.setAdditionalHitPoints(0);
        champion.setHitPoints(9);

        return champion;
    }

    @Override
    protected Hobgoblin createSubChieftain() {
        Hobgoblin subChieftain = new Hobgoblin();
        subChieftain.setSubChieftain(true);

        subChieftain.setArmorClass(6);
        subChieftain.setHitDice(3);
        subChieftain.setAdditionalHitPoints(0);
        subChieftain.setHitPoints(13);

        return subChieftain;
    }

    @Override
    protected Hobgoblin createChieftain() {
        Hobgoblin chieftain = new Hobgoblin();
        chieftain.setChieftain(true);

        chieftain.setArmorClass(7);
        chieftain.setHitDice(5);
        chieftain.setAdditionalHitPoints(0);
        chieftain.setHitPoints(21);

        return chieftain;
    }

    @Override
    protected Hobgoblin createFemale() {
        Hobgoblin female = new Hobgoblin();
        female.setType(HumanoidMonster.Type.FEMALE);

        Goblin goblin = new Goblin();
        goblin.roleHitPoints();

        female.setArmorClass(goblin.getArmorClass());
        female.setHitDice(goblin.getHitDice());
        female.setAdditionalHitPoints(goblin.getAdditionalHitPoints());
        female.setHitPoints(goblin.getHitPoints());

        return female;
    }

    @Override
    protected Hobgoblin createYoung() {
        return null;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        // TODO: Add missing albino apes
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
