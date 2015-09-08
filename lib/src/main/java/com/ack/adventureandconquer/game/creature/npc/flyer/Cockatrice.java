package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Cockatrice extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d8.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Cockatrice monster = new Cockatrice();
            monster.setExtraInformation("A successful attack or touching the Cockatrice requires a SvP or getting turned to Stone!");
            monster.addToAttackRoutine("Beak D6, Beak D6");
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
    public int getDefaultMovement(){return 90;}

    @Override
    public int getDefaultExtraMovement(){return 180;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -1;
    }

    @Override
    public String getDefaultSaves() {
        return "F5";
    }
}
