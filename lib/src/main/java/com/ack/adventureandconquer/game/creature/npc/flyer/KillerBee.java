package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class KillerBee extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role()+d6.role()+d6.role()+d6.role()+d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            KillerBee monster = new KillerBee();
            monster.setExtraInformation("Poison: Save or Die! Stinger breaks off, killing bee next round, dealing 1 damage per round until removed which takes also one round.");
            monster.addToAttackRoutine("Sting 1D3");
            monster.setAdditionalHitPoints(d4.role());
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
        return 0;
    }

    @Override
    public int getDefaultMovement(){return 150;}

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
        return "F1";
    }

    @Override
    public String getDefaultAlignment() {return "Neutral";}
}
