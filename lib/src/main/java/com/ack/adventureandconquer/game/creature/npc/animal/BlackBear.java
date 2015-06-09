package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 30/01/15.
 */
public class BlackBear extends Npc {
    public static List<Npc> getSloth() {
        int flockSize = d4.role();
        return createBear(flockSize);
    }


    private static List<Npc> createBear(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            BlackBear bear = new BlackBear();
            bear.setAttackRoutine("Claw 1d3, Claw 1d3, Bite 1D6");
            bear.setExtraInformation("If both claws hit do a +2D8 damage Bear Hug!");

            bear.roleHitPoints();
            pack.add(bear);
        }

        return pack;
    }




    @Override
    public int getDefaultMorale() {
        return -1;
    }

    @Override
    public String getDefaultSaves() {
        return "F2";
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 4 ;
    }
}
