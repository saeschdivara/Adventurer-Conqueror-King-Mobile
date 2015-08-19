package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Bat extends Npc {


    public static List<Npc> getFlock() {
        int flockSize = d10.role();
        return createBat(flockSize);
    }


    private static List<Npc> createBat(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            Bat bat = new Bat();
            bat.addToAttackRoutine("Bite 1hp");
            bat.getAdditionalHitPoints();
            bat.roleHitPoints();
            pack.add(bat);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 0;
    }

    @Override
    public int getDefaultMorale() {
        return -2;
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public String getDefaultSaves() {
        return "F0";
    }

    @Override
    public int getDefaultMovement(){return 9;}

    @Override
    public int getDefaultExtraMovement(){return 120;}

    @Override
    public String getExtraMovementType(){return "Fly";}
}
