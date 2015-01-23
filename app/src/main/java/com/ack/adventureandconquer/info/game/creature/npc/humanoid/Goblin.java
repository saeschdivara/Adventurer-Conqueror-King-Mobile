package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.creature.npc.animal.DireWolf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Goblin extends Npc {

    private boolean isRidingDireWolf = false;
    private boolean isChampion = false;
    private boolean isSubChieftain = false;
    private boolean isChieftain = false;
    private boolean isShaman = false;
    private boolean isWitchDoctor = false;

    private int clericalLevel = 0;
    private int mageLevel = 0;

    public static List<Npc> getGang() {
        boolean hasWolfs = d100.role() <= 5;
        List<Npc> gang = getMountedGang(hasWolfs);

        return gang;
    }

    private static List<Npc> getMountedGang(boolean hasWolfs) {
        List<Npc> gang = new ArrayList<>();
        int gangSize = d4.role() + d4.role();

        for (int index = 0; index < gangSize; index++) {
            Goblin goblin = new Goblin();
            goblin.roleHitPoints();

            gang.add(goblin);

            if (hasWolfs) {
                goblin.setRidingDireWolf(true);

                DireWolf wolf = new DireWolf();
                wolf.roleHitPoints();

                gang.add(wolf);
            }
        }

        Goblin champion = createChampion();
        gang.add(champion);

        if (hasWolfs) {
            champion.setRidingDireWolf(true);

            DireWolf wolf = new DireWolf();
            wolf.roleHitPoints();

            gang.add(wolf);
        }

        return gang;
    }

    public static List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warbandSize = d6.role() + d6.role();

        boolean hasWolfs = d100.role() <= 20;
        int fourthPartOfWarbandSize = warbandSize / 4;

        for (int index = 0; index < warbandSize; index++) {
            List<Npc> gang;

            if (hasWolfs && index < fourthPartOfWarbandSize) {
                gang = getMountedGang(true);
            }
            else {
                gang = getMountedGang(false);
            }

            warband.addAll(gang);
        }

        Goblin subChieftain = createSubChieftain();
        warband.add(subChieftain);

        if (hasWolfs) {
            subChieftain.setRidingDireWolf(true);

            DireWolf wolf = new DireWolf();
            wolf.roleHitPoints();

            warband.add(wolf);
        }

        return warband;
    }

    public static List<Npc> getVillage() {
        List<Npc> village = new ArrayList<>();
        int villageSize = d10.role();

        for (int index = 0; index < villageSize; index++) {
            List<Npc> warband = getWarband();
            village.addAll(warband);
        }

        Goblin chieftain = new Goblin();
        chieftain.setChieftain(true);
        chieftain.setArmorClass(6);
        chieftain.setHitDice(3);
        chieftain.setHitPoints(16);

        village.add(chieftain);

        boolean isGuardedByDireWolves = d10.role() <= 6;
        if (isGuardedByDireWolves) {
            int wolfNumber = d6.role() + d6.role() + d6.role() + d6.role() + d6.role();
            for (int index = 0; index < wolfNumber; index++) {
                DireWolf wolf = new DireWolf();
                wolf.roleHitPoints();

                village.add(wolf);
            }
        }

        boolean hasBugBears = d10.role() <= 2;
        if (hasBugBears) {
            int bugBearsNumber = d6.role() + d6.role();
            for (int index = 0; index < bugBearsNumber; index++) {
                Bugbear bear = new Bugbear();
                bear.roleHitPoints();

                village.add(bear);
            }
        }

        boolean hasShaman = d100.role() <= 75;
        if (hasShaman) {
            Goblin shaman = createSubChieftain();
            shaman.setSubChieftain(false);
            shaman.setClericalLevel(d4.role() + d4.role());
            shaman.setShaman(true);

            village.add(shaman);
        }

        boolean hasWitchDoctor = d100.role() <= 50;
        if (hasWitchDoctor) {
            Goblin witchDoctor = createChampion();
            witchDoctor.setChampion(false);
            witchDoctor.setMageLevel(d6.role());
            witchDoctor.setWitchDoctor(true);

            village.add(witchDoctor);
        }

        return village;
    }

    private static Goblin createChampion() {
        Goblin champion = new Goblin();
        champion.setChampion(true);
        champion.setArmorClass(4);
        champion.setHitDice(1);
        champion.setHitPoints(7);

        return champion;
    }

    private static Goblin createSubChieftain() {
        Goblin subChieftain = new Goblin();
        subChieftain.setSubChieftain(true);
        subChieftain.setArmorClass(5);
        subChieftain.setHitDice(1);
        subChieftain.setHitPoints(9);

        return subChieftain;
    }

    @Override
    public String getExtraInformation() {

        String ridingText = "";
        if (isRidingDireWolf) {
            ridingText = "\nIs riding Dire Wolf";
        }

        if (isChampion) {
            return "Champion" + ridingText;
        }
        else if (isSubChieftain) {
            return "Sub Chieftain\n+1 bonus to damage rolls" + ridingText;
        }
        else if (isChieftain) {
            return "Chieftain\n+2 bonus to damage rolls" + ridingText;
        }
        else if (isShaman) {
            return "Shaman\n+1 bonus to damage rolls\nCleric Level: " + String.valueOf(clericalLevel);
        }
        else if (isWitchDoctor) {
            return "Witch Doctor\nMage Level: " + String.valueOf(mageLevel);
        }

        return "";
    }

    @Override
    public int getAdditionalHitPoints() {
        if (isChampion || isChieftain) {
            return 0;
        }
        else if (isSubChieftain) {
            return 1;
        }

        return -1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    public void setRidingDireWolf(boolean isRidingDireWolf) {
        this.isRidingDireWolf = isRidingDireWolf;
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

    public void setWitchDoctor(boolean isWitchDoctor) {
        this.isWitchDoctor = isWitchDoctor;
    }

    public void setClericalLevel(int clericalLevel) {
        this.clericalLevel = clericalLevel;
    }

    public void setMageLevel(int mageLevel) {
        this.mageLevel = mageLevel;
    }
}
