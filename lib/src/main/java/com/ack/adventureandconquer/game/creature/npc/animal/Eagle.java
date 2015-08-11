package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Eagle extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d6.role();
        return createMonster(groupSize);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Eagle monster = new Eagle();
            monster.setExtraInformation("Can make a dive attack for double damage");
            monster.addToAttackRoutine("Claw D6");
            monster.setAdditionalHitPoints(d4.role());
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 1;
    }

    @Override
    public int getDefaultHitDice() {
        return 0;
    }

    @Override
    public int getDefaultMovement(){return 1;}

    @Override
    public int getDefaultExtraMovement(){return 480;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return -1;
    }

    @Override
    public String getDefaultSaves() {
        return "F0";
    }
}
