package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Griffon extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d8.role()+d8.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Griffon monster = new Griffon();
            monster.setExtraInformation("Attacks Horses! Dive attack for 2x damage and grabs on double talon hit unless SvP. Dwarves or smaller will be carried off");
            monster.addToAttackRoutine("Talon 1D4, Talon 1D4, Bite 2D8");
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

    @Override
    public int getDefaultHitDice() {
        return 7;
    }

    @Override
    public int getDefaultMovement(){return 120;}

    @Override
    public int getDefaultExtraMovement(){return 360;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 1;
    }

    @Override
    public String getDefaultSaves() {
        return "F4";
    }

    @Override
    public String getDefaultAlignment() {return "neutral";}
}
