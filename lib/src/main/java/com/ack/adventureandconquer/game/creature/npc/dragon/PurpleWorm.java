package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class PurpleWorm extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d2.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            PurpleWorm monster = new PurpleWorm();
            monster.setExtraInformation("Swallows creatures up to horse size on attack roll > X+4 or 20. Attacks from inside -4, 3d6 damage per round and digested in 6 rounds!");
            monster.addToAttackRoutine("Bite 2D8,Sting 1D8 + poison");
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
        return 15;
    }

    @Override
    public int getDefaultMovement(){return 60;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 2;
    }

    @Override
    public String getDefaultSaves() {
        return "F8";
    }
}
