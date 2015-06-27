package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Rat extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role()+d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Rat monster = new Rat();
            monster.setExtraInformation("5% chance of catching a disease if character took damage.");
            monster.setAttackRoutine("Swarm D6, Disease");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 0;
    }

    @Override
    public int getDefaultHitDice() {
        return d3.role()+1;
    }

    @Override
    public int getDefaultMovement(){return 60;}

    @Override
    public int getDefaultExtraMovement(){return 30;}

    @Override
    public String getExtraMovementType(){return "Swim";}

    @Override
    public int getDefaultMorale() {
        return -3;
    }

    @Override
    public String getDefaultSaves() {
        return "F0";
    }
}
