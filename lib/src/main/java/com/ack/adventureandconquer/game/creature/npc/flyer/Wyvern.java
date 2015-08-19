package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Wyvern extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Wyvern monster = new Wyvern();
            monster.setExtraInformation("The poisonous sting kills unless a SvP is made. Can make dive attack with talons for double damage!");
            monster.addToAttackRoutine("Bite 2D8,Sting 2D8, poison or Talon 2D8, Talon 2D8");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 7;
    }

    @Override
    public int getDefaultMovement(){return 90;}

    @Override
    public int getDefaultExtraMovement(){return 240;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +1;
    }

    @Override
    public String getDefaultSaves() {
        return "F4";
    }
}
