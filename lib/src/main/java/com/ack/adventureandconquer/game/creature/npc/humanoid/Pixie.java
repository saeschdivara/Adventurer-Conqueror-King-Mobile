package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Pixie extends Npc {

    public static List<Npc> getWing() {
        List<Npc> wing = new ArrayList<>();
        int wingSize = d4.role() * 10;

        for (int index = 0; index < wingSize; index++) {
            Pixie pixie = new Pixie();
            pixie.roleHitPoints();

            wing.add(pixie);
        }

        return wing;
    }

    public static List<Npc> getLair() {
        List<Npc> lair = new ArrayList<>();
        int lairSize = d4.role() * 10;

        for (int index = 0; index < lairSize; index++) {
            Pixie pixie = new Pixie();
            pixie.roleHitPoints();

            lair.add(pixie);
        }

        return lair;
    }

    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }
}
