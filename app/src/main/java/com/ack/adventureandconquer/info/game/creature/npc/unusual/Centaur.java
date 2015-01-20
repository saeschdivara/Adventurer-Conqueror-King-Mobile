package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.D10;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 19/01/15.
 */
public class Centaur extends Npc {

    private static IsDice d10 = new D10();

    public static List<Npc> getPack() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d10.role() + d10.role();

        for (int i = 1; i <= packSize; i++) {
            Centaur centaur = new Centaur();
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        Centaur chieftain = new Centaur();
        chieftain.setArmorClass(6);
        chieftain.setHitDice(5);
        chieftain.setHitPoints(29);

        pack.add(chieftain);

        return pack;
    }

    @Override
    public int getDefaultHitPoints() {
        return 4;
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
