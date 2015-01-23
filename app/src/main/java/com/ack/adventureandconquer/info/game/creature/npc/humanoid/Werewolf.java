package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Werewolf extends Npc {

    public static List<Npc> getRoute() {
        List<Npc> route = new ArrayList<>();
        int routeSize = d6.role() + d6.role();

        for (int index = 0; index < routeSize; index++) {
            Werewolf werewolf = new Werewolf();
            werewolf.roleHitPoints();

            route.add(werewolf);
        }

        return route;
    }

    public static List<Npc> getLair() {
        return getRoute();
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }
}
