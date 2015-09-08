package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantCarnivFly extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role()+d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantCarnivFly monster = new GiantCarnivFly();
            monster.setExtraInformation("Stealthy: -2 to Surprise! Can jump up to 30ft.");
            monster.addToAttackRoutine("Bite D8");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }

    @Override
    public int getDefaultMovement(){return 90;}

    @Override
    public int getDefaultExtraMovement(){return 180;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F1";
    }
}
