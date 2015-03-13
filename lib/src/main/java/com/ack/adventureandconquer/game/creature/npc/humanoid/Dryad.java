package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 02/02/15.
 */
public class Dryad extends Npc {

    public static List<Npc> getSolitary() {
        List<Npc> solitary = new ArrayList<>();

        Dryad dryad = new Dryad();
        dryad.roleHitPoints();

        solitary.add(dryad);

        return solitary;
    }

    public static List<Npc> getGrove() {
        List<Npc> grove = new ArrayList<>();
        int groveSize = d6.role();

        for (int index = 0; index < groveSize; index++) {
            Dryad dryad = new Dryad();
            dryad.roleHitPoints();

            grove.add(dryad);
        }

        return grove;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
