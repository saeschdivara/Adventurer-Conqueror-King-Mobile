package com.ack.adventureandconquer.info.game.creature.npc;

import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 19/01/15.
 */
public abstract class Npc {

    private int armorClass = -1;
    private int hitDice = -1;
    private int hitPoints = -1;

    public int getDefaultHitPoints() {
        return 0;
    }

    public int getHitPoints() {
        if (hitPoints < 0)
            return getDefaultHitPoints();

        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void roleHitPoints() {
        hitPoints = 0;
        IsDice d8 = new D8();

        for (int index = 0; index < getHitDice(); index++) {
            hitPoints += d8.role();
        }
    }

    public int getDefaultArmorClass() {
        return 0;
    }

    public int getArmorClass() {
        if (armorClass < 0)
            return getDefaultHitPoints();

        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getDefaultHitDice() {
        return 0;
    }

    public int getHitDice() {
        if (hitDice < 0)
            return getDefaultHitPoints();

        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }
}
