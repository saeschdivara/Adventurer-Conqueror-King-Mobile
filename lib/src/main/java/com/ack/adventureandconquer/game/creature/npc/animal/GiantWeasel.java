package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantWeasel extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantWeasel monster = new GiantWeasel();
            monster.setExtraInformation("Latch on after successful attack to deal damage every round, 30' Infravision, Can track prey");
            monster.setAttackRoutine("Bite 2D4");
            monster.setAdditionalHitPoints(4);
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
        return 4;
    }

    @Override
    public int getDefaultMovement(){return 150;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F3";
    }
}
