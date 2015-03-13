package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 29/01/15.
 */
public class Minotaur extends Npc {

    public static List<Npc> getWarband() {
        List<Npc> warband = new ArrayList<>();
        int warbandSize = d8.role();

        for (int index = 0; index < warbandSize; index++) {
            Minotaur minotaur = new Minotaur();
            minotaur.roleHitPoints();

            warband.add(minotaur);
        }

        return warband;
    }

    public static List<Npc> getLair() {
        return getWarband();
    }

    @Override
    public String getExtraInformation() {
        return "+2 bonus to damage rolls when using weapons";
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }
}
