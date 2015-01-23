package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Goblin extends Npc {

    private boolean isChampion = false;
    private boolean isSubChieftain = false;
    private boolean isChieftain = false;

    public static List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = d4.role() + d4.role();

        for (int index = 0; index < gangSize; index++) {
            Goblin goblin = new Goblin();
            goblin.roleHitPoints();

            gang.add(goblin);
        }

        Goblin champion = new Goblin();
        champion.setChampion(true);
        champion.setArmorClass(4);
        champion.setHitDice(1);
        champion.setHitPoints(7);

        gang.add(champion);

        return gang;
    }

    public static List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warbandSize = d6.role() + d6.role();

        for (int index = 0; index < warbandSize; index++) {
            List<Npc> gang = getGang();

            warband.addAll(gang);
        }

        Goblin subChieftain = new Goblin();
        subChieftain.setSubChieftain(true);
        subChieftain.setArmorClass(5);
        subChieftain.setHitDice(1);
        subChieftain.setHitPoints(9);

        warband.add(subChieftain);

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

        return village;
    }

    @Override
    public String getExtraInformation() {
        if (isChampion) {
            return "Champion";
        }
        else if (isSubChieftain) {
            return "Sub Chieftain\n+1 bonus to damage rolls";
        }
        else if (isChieftain) {
            return "Chieftain\n+2 bonus to damage rolls";
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

    public void setChampion(boolean isChampion) {
        this.isChampion = isChampion;
    }

    public void setSubChieftain(boolean isSubChieftain) {
        this.isSubChieftain = isSubChieftain;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }
}
