package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class GnollType extends HumanoidMonsterFactory<Gnoll> implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 20;
    }

    @Override
    protected int getGangSize() {
        return d6.role();
    }

    @Override
    protected int getWarBandSize() {
        return d6.role();
    }

    @Override
    protected int getVillageSize() {
        return d10.role();
    }

    @Override
    protected int getClericLevel() {
        return d4.role() + 1;
    }

    @Override
    protected int getMageLevel() {
        return d4.role();
    }

    @Override
    protected int getShamanChance() {
        return 60;
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
        return 0;
    }

    @Override
    protected Gnoll createMonster() {
        Gnoll gnoll = new Gnoll();
        gnoll.roleHitPoints();

        return gnoll;
    }

    @Override
    protected Gnoll createChampion() {
        Gnoll champion = new Gnoll();
        champion.setChampion(true);

        champion.setArmorClass(5);
        champion.setHitDice(3);
        champion.setHitPoints(16);

        return champion;
    }

    @Override
    protected Gnoll createSubChieftain() {
        Gnoll subChieftain = new Gnoll();
        subChieftain.setSubChieftain(true);

        subChieftain.setArmorClass(6);
        subChieftain.setHitDice(4);
        subChieftain.setHitPoints(20);

        return subChieftain;
    }

    @Override
    protected Gnoll createChieftain() {
        Gnoll chieftain = new Gnoll();
        chieftain.setChieftain(true);

        chieftain.setArmorClass(7);
        chieftain.setHitDice(6);
        chieftain.setHitPoints(28);

        return chieftain;
    }

    @Override
    protected Gnoll createFemale() {
        Gnoll female = new Gnoll();
        female.setType(HumanoidMonster.Type.FEMALE);

        Orc orc = new Orc();
        orc.roleHitPoints();

        female.setArmorClass(orc.getArmorClass());
        female.setHitDice(orc.getHitDice());
        female.setAdditionalHitPoints(orc.getAdditionalHitPoints());
        female.setHitPoints(orc.getHitPoints());

        return female;
    }

    @Override
    protected Gnoll createYoung() {
        return null;
    }

    @Override
    protected List<Npc> getAdditionalMonsters() {
        List<Npc> monsters = new ArrayList<>();

        boolean hasTrolls = d100.role() <= 33;
        if (hasTrolls) {
            int trollsNumber = d3.role();
            for (int index = 0; index < trollsNumber; index++) {
                Troll troll = new Troll();
                troll.roleHitPoints();

                monsters.add(troll);
            }
        }

        boolean hasHyenas = d100.role() <= 66;
        if (hasHyenas) {
            int hyenasNumber = d4.role() + d4.role() + d4.role() + d4.role();
            for (int index = 0; index < hyenasNumber; index++) {
                // TODO: Find stats for hyenas
//                Hye
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
        return getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}
