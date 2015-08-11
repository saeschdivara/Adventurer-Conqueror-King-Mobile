package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantCrocodile extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d3.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantCrocodile monster = new GiantCrocodile();
            monster.setExtraInformation("When submerged -2 to surprise");
            monster.addToAttackRoutine("Bite 3D8");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 8;
    }

    @Override
    public int getDefaultHitDice() {
        return 15;
    }

    @Override
    public int getDefaultMovement(){return 90;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +1;
    }

    @Override
    public String getDefaultSaves() {
        return "F8";
    }
}
