package com.ack.adventureandconquer.info.game.creature.npc.dragon;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 21/01/15.
 */
public class Basilisk extends Npc {

    public static List<Npc> getBask() {
        List<Npc> basilisks = new ArrayList<>();
        int baskSize = d6.role();

        for (int index = 0; index < baskSize; index++) {
            Basilisk basilisk = new Basilisk();
            basilisk.roleHitPoints();

            basilisks.add(basilisk);
        }

        return basilisks;
    }

    public static List<Npc> getNest() {
        return getBask();
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }
}
