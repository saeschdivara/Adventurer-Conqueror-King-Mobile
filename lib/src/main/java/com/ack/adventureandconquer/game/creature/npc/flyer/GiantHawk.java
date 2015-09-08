package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantHawk extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d3.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantHawk monster = new GiantHawk();
            monster.setExtraInformation("Dive attacks deal 2x damage! Grabs if both attacks hit, SvP to prevent getting carried off");
            monster.addToAttackRoutine("Talon D4,Talon D4");
            monster.setAdditionalHitPoints(3);
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
        return 3;
    }

    @Override
    public int getDefaultMovement(){return 3;}

    @Override
    public int getDefaultExtraMovement(){return 450;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F2";
    }

    @Override
    public String getDefaultAlignment() {return "neutral";}
}
