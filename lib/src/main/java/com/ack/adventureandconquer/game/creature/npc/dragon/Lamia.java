package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Lamia extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = 1;
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Lamia monster = new Lamia();
            monster.setExtraInformation("Uses illusions, can cast Charm Person and mirror image once per day and command word at will!");
            monster.addToAttackRoutine("Hoof D6 + 1 point Wis Drain, or weapon");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return 9;
    }

    @Override
    public int getDefaultMovement(){return 240;}

//    @Override
//    public int getDefaultExtraMovement(){return 240;}

//    @Override
//    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +1;
    }

    @Override
    public String getDefaultSaves() {
        return "F9";
    }
}
