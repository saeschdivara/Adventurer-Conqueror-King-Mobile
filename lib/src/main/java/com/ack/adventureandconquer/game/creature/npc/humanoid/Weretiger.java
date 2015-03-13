package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Weretiger extends Npc {

    public static List<Npc> getTroop() {
        List<Npc> troup = new ArrayList<>();
        int troupSize = d4.role();

        for (int index = 0; index < troupSize; index++) {
            Weretiger weretiger = new Weretiger();
            weretiger.roleHitPoints();

            troup.add(weretiger);
        }

        return troup;
    }

    public static List<Npc> getLair() {
        return getTroop();
    }

    @Override
    public String getExtraInformation() {
        return "Characters encountering them suffer a -2 penalty to surprise rolls.";
    }

    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 5;
    }
}
