package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

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
    public String getExtraInformation() {
        return "If enraged, they will fight with a bonus of +2 to attack " +
                "throws, and continue fighting until there are no more enemies " +
                "or until they are killed.";
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
