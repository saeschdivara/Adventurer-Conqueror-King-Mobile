package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 30/01/15.
 */
public class Naiad extends Npc {

    public static List<Npc> getSolitary() {
        List<Npc> solitary = new ArrayList<>();

        Naiad naiad = new Naiad();
        naiad.roleHitPoints();

        solitary.add(naiad);

        return solitary;
    }

    public static List<Npc> getWateryLair() {
        List<Npc> wateryLair = new ArrayList<>();
        int naiadNumber = d20.role() + d20.role();

        for (int index = 0; index < naiadNumber; index++) {
            Naiad naiad = new Naiad();
            naiad.roleHitPoints();

            wateryLair.add(naiad);
        }


        return wateryLair;
    }

    @Override
    public int getDefaultArmorClass() {
        return 1;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }
}
