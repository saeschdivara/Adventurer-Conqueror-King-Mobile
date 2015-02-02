package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 02/02/15.
 */
public class Throghrin extends Npc {

    public static List<Npc> getPack() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d10.role();

        for (int index = 0; index < packSize; index++) {
            Throghrin throghrin = new Throghrin();
            throghrin.roleHitPoints();

            pack.add(throghrin);
        }

        return pack;
    }

    public static List<Npc> getLair() {
        return getPack();
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
