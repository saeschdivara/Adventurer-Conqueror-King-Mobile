package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.animal.Boar;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantWeasel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Kobold extends Npc {

    private boolean isChampion = false;
    private boolean isSubChieftain = false;
    private boolean isChieftain = false;
    private boolean isShaman = false;
    private boolean isWitchDoctor = false;

    private int clericLevel = 0;
    private int mageLevel = 0;

    public static List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = d4.role() + d4.role() + d4.role() + d4.role();

        for (int index = 0; index < gangSize; index++) {
            Kobold kobold = new Kobold();
            kobold.roleHitPoints();

            gang.add(kobold);
        }

        Kobold champion = createChampion();
        gang.add(champion);

        return gang;
    }

    public static List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warbandSize = d6.role();

        for (int index = 0; index < warbandSize; index++) {
            List<Npc> gang = getGang();

            warband.addAll(gang);
        }

        Kobold subChieftain = createSubChieftain();

        warband.add(subChieftain);

        return warband;
    }

    public static List<Npc> getVillage() {
        List<Npc> village = new ArrayList<>();
        int warbandSize = d10.role();

        for (int index = 0; index < warbandSize; index++) {
            List<Npc> gang = getGang();

            village.addAll(gang);
        }

        Kobold chieftain = new Kobold();
        chieftain.setChieftain(true);
        chieftain.setArmorClass(5);
        chieftain.setHitDice(2);
        chieftain.setHitPoints(12);

        village.add(chieftain);

        int guardsNumber = d4.role() + d4.role() + d4.role() + d4.role() + d4.role();
        for (int index = 0; index < guardsNumber; index++) {
            Kobold guard = createSubChieftain();
            village.add(guard);
        }

        int boarNumber = d4.role() + 1;
        for (int index = 0; index < boarNumber; index++) {
            Boar boar = new Boar();
            boar.roleHitPoints();

            village.add(boar);
        }

        int weaselNumber = d4.role();
        for (int index = 0; index < weaselNumber; index++) {
            GiantWeasel weasel = new GiantWeasel();
            weasel.roleHitPoints();

            village.add(weasel);
        }

        boolean hasShaman = d100.role() <= 75;
        if (hasShaman) {
            Kobold shaman = createShaman();
            village.add(shaman);
        }

        boolean hasWitchDoctor = d100.role() <= 50;
        if (hasWitchDoctor) {
            Kobold witchDoctor = createWitchDoctor();
            village.add(witchDoctor);
        }

        return village;
    }

    private static Kobold createSubChieftain() {
        Kobold subChieftain = new Kobold();
        subChieftain.setSubChieftain(true);
        subChieftain.setHitDice(1);
        subChieftain.setHitPoints(8);

        return subChieftain;
    }

    private static Kobold createChampion() {
        Kobold champion = new Kobold();
        champion.setChampion(true);

        champion.setArmorClass(3);
        champion.setHitDice(1);
        champion.setHitPoints(4);
        champion.setAdditionalHitPoints(-1);

        return champion;
    }

    private static Kobold createShaman() {
        Kobold shaman = createSubChieftain();
        shaman.setSubChieftain(false);
        shaman.setShaman(true);
        shaman.setClericLevel(d6.role());

        return shaman;
    }

    private static Kobold createWitchDoctor() {
        Kobold witchDoctor = createChampion();
        witchDoctor.setChampion(false);
        witchDoctor.setWitchDoctor(true);
        witchDoctor.setMageLevel(d4.role());

        return witchDoctor;
    }

    @Override
    public String getExtraInformation() {
        if (isChampion) {
            return "Champion";
        }
        else if (isSubChieftain) {
            return "Sub Chieftain";
        }
        else if (isChieftain) {
            return "Chieftain\n+1 bonus to damage rolls";
        }
        else if (isShaman) {
            return "Shaman\nCleric Level: " + String.valueOf(clericLevel);
        }
        else if (isWitchDoctor) {
            return "Witch Doctor\nMage Level: " + String.valueOf(mageLevel);
        }

        return "";
    }

    @Override
    public void roleHitPoints() {

        if (isChampion) {
            super.roleHitPoints();
        }
        else {
            setHitPoints(d4.role());
        }
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    public void setChampion(boolean isChampion) {
        this.isChampion = isChampion;
    }

    public void setSubChieftain(boolean isSubChieftain) {
        this.isSubChieftain = isSubChieftain;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }

    public void setShaman(boolean isShaman) {
        this.isShaman = isShaman;
    }

    public void setClericLevel(int clericLevel) {
        this.clericLevel = clericLevel;
    }

    public void setWitchDoctor(boolean isWitchDoctor) {
        this.isWitchDoctor = isWitchDoctor;
    }

    public void setMageLevel(int mageLevel) {
        this.mageLevel = mageLevel;
    }
}
