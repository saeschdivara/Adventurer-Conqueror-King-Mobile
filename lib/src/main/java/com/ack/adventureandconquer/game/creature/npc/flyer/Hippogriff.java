package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Hippogriff extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d8.role()+d8.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Hippogriff monster = new Hippogriff();
//            monster.setExtraInformation("Extra!");
            monster.addToAttackRoutine("Talon 1D6,Talon 1D6, Bite 1D10");
            monster.setAdditionalHitPoints(1);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }

    @Override
    public int getDefaultMovement(){return 180;}

    @Override
    public int getDefaultExtraMovement(){return 360;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F2";
    }

    @Override
    public String getDefaultAlignment() {return "Neutral";}
}
