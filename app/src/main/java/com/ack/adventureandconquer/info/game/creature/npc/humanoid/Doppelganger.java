package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Doppelganger extends Npc {

    public static List<Npc> getThrong() {
        List<Npc> throng = new ArrayList<>();
        int throngSize = d6.role();

        for (int i = 0; i < throngSize; i++) {
            Doppelganger doppelganger = new Doppelganger();
            doppelganger.roleHitPoints();

            throng.add(doppelganger);
        }

        return throng;
    }

    public static List<Npc> getLair() {
        return getThrong();
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }
}
