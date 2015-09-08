package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Gargoyle extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role()+ d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Gargoyle monster = new Gargoyle();
//            monster.setExtraInformation("Extra!");
            monster.addToAttackRoutine("Claw D3,Claw D3,Bite 1D6,Horn 1D4");
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
        return 4;
    }

    @Override
    public int getDefaultMovement(){return 90;}

    @Override
    public int getDefaultExtraMovement(){return 150;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +3;
    }

    @Override
    public String getDefaultSaves() {
        return "F8";
    }

    @Override
    public String getDefaultAlignment() {return "chaotic";}
}
