package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Manticore extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Manticore monster = new Manticore();
            monster.setExtraInformation("Has 24 tail-spikes and can throw 6 per round up to 180' each dealing 1D6 damage!");
            monster.addToAttackRoutine("Claw 1D4,Claw 1D4,Bite 2D4 or Spikes");
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
    public int getDefaultMovement(){return 120;}

    @Override
    public int getDefaultExtraMovement(){return 180;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +1;
    }

    @Override
    public String getDefaultSaves() {
        return "F6";
    }

    @Override
    public String getDefaultAlignment() {return "Chaotic";}
}
