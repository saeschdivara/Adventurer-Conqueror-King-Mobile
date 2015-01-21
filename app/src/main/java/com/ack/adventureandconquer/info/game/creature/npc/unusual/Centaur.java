package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.D10;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 19/01/15.
 */
public class Centaur extends Npc {

    private static IsDice d6 = new D6();
    private static IsDice d10 = new D10();
    private static IsDice d100 = new D100();

    private boolean isChieftain = false;
    private boolean isCleric = false;
    private int clericLevel = 0;

    public static List<Npc> getPack() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d10.role() + d10.role();

        // Create pack
        for (int i = 1; i <= packSize; i++) {
            Centaur centaur = new Centaur();
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        // Create chieftain
        Centaur chieftain = new Centaur();
        chieftain.setArmorClass(6);
        chieftain.setHitDice(5);
        chieftain.setHitPoints(29);

        chieftain.setChieftain(true);
        chieftain.setCleric(d100.role());

        if (chieftain.isCleric()) {
            chieftain.setClericLevel(d6.role());
        }

        pack.add(chieftain);

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

    public boolean isChieftain() {
        return isChieftain;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }

    public boolean isCleric() {
        return isCleric;
    }

    public void setCleric(int number) {
        if (number < 50) {
            isCleric = false;
        }
        else {
            isCleric = true;
        }
    }

    public int getClericLevel() {
        return clericLevel;
    }

    public void setClericLevel(int clericLevel) {
        this.clericLevel = clericLevel;
    }
}
