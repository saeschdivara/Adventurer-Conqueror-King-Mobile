package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Cyclops extends Npc {


    public static List<Npc> getGang() {
        List<Npc> gang = new ArrayList<>();
        int gangSize = d4.role();

        for (int index = 0; index < gangSize; index++) {
            gang.add(createMonster());
        }

        return gang;
    }

    public static List<Npc> getLair() {
        return getGang();
    }

    public static Cyclops createMonster() {
        Cyclops monster = new Cyclops();
        monster.roleHitPoints();

        return monster;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 13;
    }
}
