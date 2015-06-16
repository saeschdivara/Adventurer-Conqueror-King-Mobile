package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantToad extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantToad monster = new GiantToad();
            monster.setExtraInformation("Stealthy Hide, -1 to surprise, swallows dwarves and smaller on a 20");
            monster.setAttackRoutine("Bite 1D4");
            monster.setAdditionalHitPoints(2);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }

    @Override
    public int getDefaultMovement(){return 90;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -2;
    }

    @Override
    public String getDefaultSaves() {
        return "F1";
    }
}
