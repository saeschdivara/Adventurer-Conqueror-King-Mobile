package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Chimera extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Chimera monster = new Chimera();
            monster.setExtraInformation("Dragon head can breath 30ftx10ft cone of fire for 3D6 damage 50% of the time 3x a day!");
            monster.addToAttackRoutine("Claw D3,Claw D3,Bite 2D4,Gore 2D4,(Bite 3D4 or Breath)");
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
        return 9;
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
        return "F9";
    }
}
