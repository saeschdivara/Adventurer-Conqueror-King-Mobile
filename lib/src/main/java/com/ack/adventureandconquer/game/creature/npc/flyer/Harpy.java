package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Harpy extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role()+d4.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Harpy monster = new Harpy();
            monster.setExtraInformation("Hearing her song works like a charm person spell! On successful SvS no further saves required for the encounter");
            monster.addToAttackRoutine("Claw 1D4,Claw 1D4,Weapon 1D6, Song");
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
        return 3;
    }

    @Override
    public int getDefaultMovement(){return 60;}

    @Override
    public int getDefaultExtraMovement(){return 150;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -1;
    }

    @Override
    public String getDefaultSaves() {
        return "F6";
    }

    @Override
    public String getDefaultAlignment() {return "Chaotic";}
}
