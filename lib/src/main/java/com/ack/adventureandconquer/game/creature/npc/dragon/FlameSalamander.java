package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class FlameSalamander extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role()+d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            FlameSalamander monster = new FlameSalamander();
            monster.setExtraInformation("1D8 fire damage for all within 20ft. Immune against non-magial weapons and fire. Unaffected by sleep and charm spells!");
            monster.addToAttackRoutine("Claw D4,Claw D4,Bite 1D8,Aura");
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
        return 8;
    }

    @Override
    public int getDefaultMovement(){return 120;}

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
        return "F8";
    }
}
