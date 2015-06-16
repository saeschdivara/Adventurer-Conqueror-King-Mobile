package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class HornedLizard extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            HornedLizard monster = new HornedLizard();
            monster.setExtraInformation("-3 to surprise due to skin color, 5ft tongue pulls in and bites after attack, tail sweep knocks down on attack and opponent cant attack this round");
            monster.setAttackRoutine("Bite 2D4, Horn 1D6,Tongue,Tail");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return 5;
    }

    @Override
    public int getDefaultMovement(){return 120;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -1;
    }

    @Override
    public String getDefaultSaves() {
        return "F3";
    }
}
