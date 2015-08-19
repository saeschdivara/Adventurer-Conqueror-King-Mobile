package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class TuataraLizard extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d2.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            TuataraLizard monster = new TuataraLizard();
            monster.setExtraInformation("Infravision 90ft!");
            monster.addToAttackRoutine("Claw 1D4,Claw 1D4,Bite 2D6");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }

    @Override
    public int getDefaultMovement(){return 90;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -2;
    }

    @Override
    public String getDefaultSaves() {
        return "F4";
    }
}
