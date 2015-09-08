package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Pegasus extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d12.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Pegasus monster = new Pegasus();
//            monster.setExtraInformation("Extra!");
            monster.addToAttackRoutine("Hoof 1D6,Hoof 1D6");
            monster.setAdditionalHitPoints(2);
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
        return 2;
    }

    @Override
    public int getDefaultMovement(){return 240;}

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
        return "F2";
    }

    @Override
    public String getDefaultAlignment() {return "Lawful";}
}
