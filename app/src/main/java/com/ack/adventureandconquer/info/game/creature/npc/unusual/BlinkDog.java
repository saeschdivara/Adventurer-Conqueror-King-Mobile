package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 19/01/15.
 */
public class BlinkDog extends Npc {

    public static List<Npc> getPack() {
        int packSize = d6.role();
        return createDogs(packSize);
    }

    public static List<Npc> getRoute() {
        int packSize = d6.role() + d6.role();
        return createDogs(packSize);
    }

    public static List<Npc> getDen() {
        return getRoute();
    }

    private static List<Npc> createDogs(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            BlinkDog dog = new BlinkDog();
            dog.roleHitPoints();

            pack.add(dog);
        }

        return pack;
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
