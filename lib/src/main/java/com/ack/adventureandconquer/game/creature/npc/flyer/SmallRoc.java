package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class SmallRoc extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d12.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            SmallRoc monster = new SmallRoc();
            monster.setExtraInformation("Dive attacks deal 2x damage. If both talons hit victim is grabbed and carried if smaller without save! SvP -4 to get free in later rounds. Neutals suffer -1 reaction, chaotics -2 ");
            monster.addToAttackRoutine("Talon 1D4+1, Talon 1D4+1, Bite 2D6");
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
    public int getDefaultMovement(){return 60;}

    @Override
    public int getDefaultExtraMovement(){return 480;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F3";
    }

    @Override
    public String getDefaultAlignment() {return "Lawful";}
}
