package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Hydra extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = 1;
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Hydra monster = new Hydra();
            int heads = d8.role()+4;
            monster.setHitDice(heads);
            monster.setSaves("F" + heads);
            monster.addExtraInformation(heads +" heads! Loses one head per 8 points of damage. ");
            if (d6.role()>5)
                monster.addExtraInformation("Regenerates 3hp per round and regrows 2 heads for every cut off one after 1D4 rounds for up to 12 heads.");
            monster.addToAttackRoutine(heads + "x Bite 1D10");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

//    @Override
//    public int getDefaultHitDice() {
//        return 1;
//    }

    @Override
    public int getDefaultMovement(){return 120;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 2;
    }

//    @Override
//    public String getDefaultSaves() {
//        return "F1";
//    }
}
