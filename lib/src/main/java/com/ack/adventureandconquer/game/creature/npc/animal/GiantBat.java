package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class GiantBat extends Npc {


    public static List<Npc> getFlock() {
        int flockSize = d10.role();
        return createGiantBat(flockSize);
    }


    private static List<Npc> createGiantBat(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            GiantBat bat = new GiantBat();
            if (d100.role() > 95){
                bat.setExtraInformation("Vampiric Bat! Save vs Paralysis or paralyzed for 1D10 Rounds while bat drinks for 1D4hp each round. If killed Save vs Spell or become a Vampire");
            }
            bat.setAttackRoutine("Bite 1D4");
            bat.roleHitPoints();
            pack.add(bat);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }

    @Override
    public int getDefaultMovement(){return 30;}

    @Override
    public int getDefaultExtraMovement(){return 180;}
}
