package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Sprite extends Npc {


    public static List<Npc> getWing() {
        List<Npc> wing = new ArrayList<>();
        int wingSize = d6.role() + d6.role() + d6.role();

        for (int index = 0; index < wingSize; index++) {
            Sprite sprite = new Sprite();
            sprite.roleHitPoints();

            wing.add(sprite);
        }

        return wing;
    }

    public static List<Npc> getLair() {
        List<Npc> lair = new ArrayList<>();
        int lairSize = d6.role() + d6.role() + d6.role();

        for (int index = 0; index < lairSize; index++) {
            Sprite sprite = new Sprite();
            sprite.roleHitPoints();

            lair.add(sprite);
        }

        return lair;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getHitPoints() {
        return d4.role();
    }
}
