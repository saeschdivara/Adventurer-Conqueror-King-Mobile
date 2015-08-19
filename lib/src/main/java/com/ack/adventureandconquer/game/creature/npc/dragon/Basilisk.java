package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Basilisk extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Basilisk monster = new Basilisk();
            monster.setExtraInformation("Any creature bitten or meeting the gaze has to save or turn to stone!");
            monster.addToAttackRoutine("Bite 1D10, Gaze");
            monster.setAdditionalHitPoints(1);
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
    public int getDefaultMovement(){return 60;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 1;
    }

    @Override
    public String getDefaultSaves() {
        return "F6";
    }
}
