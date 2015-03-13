package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Werebear extends Npc {

    public static List<Npc> getSloth() {
        List<Npc> sloth = new ArrayList<>();
        int slothSize = d4.role();

        for (int index = 0; index < slothSize; index++) {
            Werebear bear = new Werebear();
            bear.roleHitPoints();

            sloth.add(bear);
        }

        return sloth;
    }

    public static List<Npc> getLair() {
        return getSloth();
    }

    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }
}
