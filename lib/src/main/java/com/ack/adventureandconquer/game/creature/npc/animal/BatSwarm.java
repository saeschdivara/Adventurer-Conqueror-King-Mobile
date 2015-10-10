package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class BatSwarm extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d3.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            BatSwarm monster = new BatSwarm();
            monster.setExtraInformation("Characters engulfed need SvS or be confused as the spell. 2D6-> 2-5:Attack caster,6-8:Do Nothing, 9-12:Attack friends");
            monster.addToAttackRoutine("Confusion");
//            monster.setAdditionalHitPoints(0);
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
        return d3.role()+1;
    }

    @Override
    public int getDefaultMovement(){return 9;}

    @Override
    public int getDefaultExtraMovement(){return 120;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -2;
    }

    @Override
    public String getDefaultSaves() {
        return "F0";
    }
}
