package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 19/01/15.
 */
public class BlinkDog extends Npc {

    private static IsDice d6 = new D6();

    public static List<Npc> getPack() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d6.role();

        for (int i = 1; i <= packSize; i++) {
            pack.add(new BlinkDog());
        }

        return pack;
    }

    public static List<Npc> getRoute() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d6.role() + d6.role();

        for (int i = 1; i <= packSize; i++) {
            pack.add(new BlinkDog());
        }

        return pack;
    }

    public static List<Npc> getDen() {
        return getRoute();
    }
}
