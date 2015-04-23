package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.Arrays;
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
            ant.roleHitPoints();
            ant.getAttackRoutine();

            if (d4.role()==1){
                ant.getAdditionalHitPoints();
                ant.getAlternateAttackRoutine();
//                ant.getMinAttackThrowValue();
            }

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
        return 1;
    }

    @Override
    public int getAdditionalHitPoints(){return d4.role();}

    public ArrayList getAttackRoutine() {
        return new ArrayList<>(Arrays.asList(""));
    }

    public ArrayList getAlternateAttackRoutine() {
        return new ArrayList<>(Arrays.asList("Butt 1D6"));

    }

//    public int getMinAttackThrowValue(){return }
}
