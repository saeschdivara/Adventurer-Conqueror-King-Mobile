package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Wererat extends Npc {

    public static List<Npc> getPlague() {
        List<Npc> plague = new ArrayList<>();
        int plagueSize = d6.role() + d6.role();

        for (int index = 0; index < plagueSize; index++) {
            Wererat rat = new Wererat();
            rat.roleHitPoints();

            plague.add(rat);
        }

        return plague;
    }

    public static List<Npc> getLair() {
        return getPlague();
    }

    @Override
    public String getExtraInformation() {
        return "Characters encountering them suffer a -2 penalty to surprise rolls.";
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
