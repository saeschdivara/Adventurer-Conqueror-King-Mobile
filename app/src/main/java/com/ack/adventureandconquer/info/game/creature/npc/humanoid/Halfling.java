package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Halfling extends Npc {

    public static List<Npc> getBand() {
        List<Npc> band = new ArrayList<>();
        int bandSize = d6.role() + d6.role() + d6.role();
        for (int index = 0; index < bandSize; index++) {
            Halfling halfling = new Halfling();
            halfling.roleHitPoints();

            band.add(halfling);
        }

        Halfling reeve = new Halfling();
        reeve.setHitDice(2);
        reeve.setAdditionalHitPoints(0);
        reeve.roleHitPoints();
        band.add(reeve);

        return band;
    }

    public static List<Npc> getMeet() {
        List<Npc> meet = new ArrayList<>();
        int meetSize = d4.role();

        for (int index = 0; index < meetSize; index++) {
            List<Npc> band = getBand();
            meet.addAll(band);
        }

        return meet;
    }

    public static List<Npc> getShire() {
        List<Npc> shire = new ArrayList<>();
        int shireSize = d10.role();

        for (int index = 0; index < shireSize; index++) {
            List<Npc> meet = getMeet();
            shire.addAll(meet);
        }

        Halfling sheriff = new Halfling();
        sheriff.setHitDice(d6.role());
        sheriff.setAdditionalHitPoints(1);
        shire.add(sheriff);

        int militiaSize = d4.role() + d4.role() + d4.role() + d4.role() + d4.role();
        for (int index = 0; index < militiaSize; index++) {
            Halfling soldier = new Halfling();
            soldier.setAdditionalHitPoints(0);
            soldier.setHitDice(2);
            soldier.roleHitPoints();

            shire.add(soldier);
        }

        return shire;
    }

    @Override
    public int getAdditionalHitPoints() {
        return -1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }
}
