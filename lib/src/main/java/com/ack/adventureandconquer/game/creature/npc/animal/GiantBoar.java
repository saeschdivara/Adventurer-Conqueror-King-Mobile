package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 25/01/15.
 */
public class GiantBoar extends Npc {
    public static List<Npc> getGroup() {
        int groupSize = d4.role()+1;
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantBoar monster = new GiantBoar();
//            monster.setExtraInformation("Extra!");
            monster.setAttackRoutine("Tusk 3D4");
//            monster.setAdditionalHitPoints(0);
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
        return +2;
    }

    @Override
    public String getDefaultSaves() {
        return "F5";
    }
}
