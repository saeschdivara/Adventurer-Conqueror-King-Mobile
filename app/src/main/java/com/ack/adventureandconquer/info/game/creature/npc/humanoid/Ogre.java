package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 26/01/15.
 */
public class Ogre extends Npc {

    private boolean isChampion = false;
    private boolean isSubChieftain = false;
    private boolean isChieftain = false;
    private boolean isShaman = false;
    private boolean isWitchDoctor = false;

    private int clericalLevel = 0;
    private int mageLevel = 0;

    private Type type = Type.MALE;

    public static List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = d6.role();

        for (int index = 0; index < gangSize; index++) {
            Ogre ogre = new Ogre();
            ogre.roleHitPoints();

            gang.add(ogre);
        }

        Ogre champion = createChampion();
        gang.add(champion);

        return gang;
    }

    public static List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int gangSize = d3.role();

        for (int index = 0; index < gangSize; index++) {
            List<Npc> gang = getGang();

            gang.addAll(gang);
        }

        Ogre subChieftain = createSubChieftain();
        warband.add(subChieftain);

        return warband;
    }

    public static List<Npc> getVillage() {
        List<Npc> village = new ArrayList<>();
        int gangSize = d3.role();

        for (int index = 0; index < gangSize; index++) {
            List<Npc> gang = getGang();

            gang.addAll(gang);
        }

        Ogre chieftain = createChieftain();
        village.add(chieftain);

        int maleNumber = village.size();
        int everyTenthMale = maleNumber / 10;
        int femaleNumber = (d6.role() + d6.role()) * everyTenthMale;
        int youngNumber = (d4.role() + d4.role()) * everyTenthMale;

        for (int index = 0; index < femaleNumber; index++) {
            Ogre female = createFemale();
            village.add(female);
        }

        for (int index = 0; index < youngNumber; index++) {
            Ogre young = createYoung();
            village.add(young);
        }

        boolean hasShaman = d100.role() <= 50;
        if (hasShaman) {
            Ogre shaman = createSubChieftain();
            shaman.setSubChieftain(false);
            shaman.setClericalLevel(d4.role());
            shaman.setShaman(true);

            village.add(shaman);
        }

        boolean hasWitchDoctor = d100.role() <= 25;
        if (hasWitchDoctor) {
            Ogre witchDoctor = createChampion();
            witchDoctor.setChampion(false);
            witchDoctor.setMageLevel(d2.role());
            witchDoctor.setWitchDoctor(true);

            village.add(witchDoctor);
        }

        return village;
    }

    public static Ogre createChampion() {
        Ogre champion = new Ogre();
        champion.setChampion(true);
        champion.setArmorClass(5);
        champion.setHitDice(5);
        champion.setHitPoints(33);

        return champion;
    }

    public static Ogre createSubChieftain() {
        Ogre subChieftain = new Ogre();
        subChieftain.setSubChieftain(true);
        subChieftain.setArmorClass(5);
        subChieftain.setHitDice(5);
        subChieftain.setHitPoints(33);

        return subChieftain;
    }

    public static Ogre createChieftain() {
        Ogre chieftain = new Ogre();
        chieftain.setChieftain(true);
        chieftain.setArmorClass(7);
        chieftain.setHitDice(8);
        chieftain.setAdditionalHitPoints(2);
        chieftain.setHitPoints(45);

        return chieftain;
    }

    public static Ogre createFemale() {
        Ogre female = new Ogre();
        female.setType(Type.FEMALE);

        Bugbear bear = new Bugbear();
        bear.roleHitPoints();

        female.setArmorClass(bear.getArmorClass());
        female.setHitDice(bear.getHitDice());
        female.setHitPoints(bear.getHitPoints());
        female.setAdditionalHitPoints(bear.getAdditionalHitPoints());

        return female;
    }

    public static Ogre createYoung() {
        Ogre young = new Ogre();
        young.setType(Type.YOUNG);

        Goblin goblin = new Goblin();
        goblin.roleHitPoints();

        young.setArmorClass(goblin.getArmorClass());
        young.setHitDice(goblin.getHitDice());
        young.setHitPoints(goblin.getHitPoints());
        young.setAdditionalHitPoints(goblin.getAdditionalHitPoints());

        return young;
    }

    @Override
    public String getExtraInformation() {
        String powerBonus = "+3 bonus to damage rolls due to their great strength";

        if (isChampion) {
            return "Champion\n" + powerBonus;
        }
        else if (isSubChieftain) {
            return "Sub Chieftain\n" + powerBonus;
        }
        else if (isShaman) {
            return "Shaman\n" + powerBonus;
        }
        else if (isWitchDoctor) {
            return "Witch Doctor\n" + powerBonus;
        }
        else if (isChieftain) {
            return "Chieftain\n+4 bonus to damage rolls due to their great strength";
        }
        else if (type == Type.FEMALE) {
            return "Female";
        }
        else if (type == Type.YOUNG) {
            return "Female";
        }

        return powerBonus;
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }

    public void setSubChieftain(boolean isSubChieftain) {
        this.isSubChieftain = isSubChieftain;
    }

    public void setChampion(boolean isChampion) {
        this.isChampion = isChampion;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setShaman(boolean isShaman) {
        this.isShaman = isShaman;
    }

    public void setWitchDoctor(boolean isWitchDoctor) {
        this.isWitchDoctor = isWitchDoctor;
    }

    public void setClericalLevel(int clericalLevel) {
        this.clericalLevel = clericalLevel;
    }

    public void setMageLevel(int mageLevel) {
        this.mageLevel = mageLevel;
    }

    public enum Type  {
        MALE,
        FEMALE,
        YOUNG
    }
}
