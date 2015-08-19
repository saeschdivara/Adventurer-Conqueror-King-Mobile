package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 17.04.2015.
 *
 */
public class Antelope extends Npc {


    public static List<Npc> getHerd() {
        int herdSize = d10.role()+d10.role()+d10.role();
        return createAntelope(herdSize);
    }


    private static List<Npc> createAntelope(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            Antelope ant = new Antelope();
            if (d10.role()<=2){
                ant.setAdditionalHitPoints(d4.role());
                ant.addToAttackRoutine("Butt 1D4");
            }else{
                ant.addToAttackRoutine("Doesn't Fight");
                if (d10.role()<=4){
                    ant.setExtraInformation("Young animal, reduce HP by 50%");
                }
            }
            ant.roleHitPoints();
            pack.add(ant);
        }

        return pack;
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return d2.role();
    }

    @Override
    public int getDefaultMorale() {
        return -3;
    }

    @Override
    public String getDefaultSaves() {
        return "F1";
    }

    @Override
    public int getDefaultMovement(){return 240;}


}
