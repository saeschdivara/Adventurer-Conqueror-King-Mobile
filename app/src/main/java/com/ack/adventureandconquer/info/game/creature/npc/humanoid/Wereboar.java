package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Wereboar extends Npc {

    public static List<Npc> getHerd() {
        List<Npc> herd = new ArrayList<>();
        int herdSize = d4.role() + d4.role();

        for (int index = 0; index < herdSize; index++) {
            Wereboar wereboar = new Wereboar();
            wereboar.roleHitPoints();

            herd.add(wereboar);
        }

        return herd;
    }

    public static List<Npc> getLair() {
        return getHerd();
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }
}
