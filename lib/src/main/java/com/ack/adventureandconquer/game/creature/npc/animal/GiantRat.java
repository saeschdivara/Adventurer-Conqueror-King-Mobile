package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantRat extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d10.role()+d10.role()+d10.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            GiantRat monster = new GiantRat();
            monster.setExtraInformation("5% chance per bite to get a disease, Save or die 1D6 days later. 30 day bedrest otherwise");
            monster.setAttackRoutine("Claw 1D4");
            monster.setAdditionalHitPoints(d4.role());
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
        return 0;
    }

    @Override
    public int getDefaultMovement(){return 120;}

    @Override
    public int getDefaultExtraMovement(){return 60;}

    @Override
    public String getExtraMovementType(){return "Swim";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F1";
    }
}
