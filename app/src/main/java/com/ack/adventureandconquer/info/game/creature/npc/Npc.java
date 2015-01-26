package com.ack.adventureandconquer.info.game.creature.npc;

import com.ack.adventureandconquer.info.game.creature.IsMonster;
import com.ack.adventureandconquer.info.game.dice.D10;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.D2;
import com.ack.adventureandconquer.info.game.dice.D3;
import com.ack.adventureandconquer.info.game.dice.D4;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 19/01/15.
 */
public abstract class Npc {

    private int armorClass = -1;
    private int hitDice = -1;
    private int hitPoints = -1;
    private int additionalHitPoints = 0;

    protected static IsDice d2 = new D2();
    protected static IsDice d3 = new D3();
    protected static IsDice d4 = new D4();
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();
    protected static IsDice d10 = new D10();
    protected static IsDice d100 = new D100();

    public String getExtraInformation() {
        return "";
    }

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

        for (int index = 1; index <= getHitDice(); index++) {
            hitPoints += d8.role();
        }

        hitPoints += getAdditionalHitPoints();

        if (hitPoints <= 0) {
            hitPoints = 1;
        }
    }

    public int getAdditionalHitPoints() {
        return additionalHitPoints;
    }

    public void setAdditionalHitPoints(int additionalHitPoints) {
        this.additionalHitPoints = additionalHitPoints;
    }

    public int getDefaultArmorClass() {
        return 0;
    }

    public int getArmorClass() {
        if (armorClass < 0)
            return getDefaultArmorClass();

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
            return getDefaultHitDice();

        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    public int getMinAttackThrowValue() {
        int minAttack = 0;

        if (this instanceof IsMonster) {
            minAttack = _getMinMonsterAttackThrow();
        }

        // TODO: Implement others

        return minAttack;
    }

    private int _getMinMonsterAttackThrow() {
        int minAttack = 0;
        int hitDice = getHitDice();

        if (hitDice <= 1) {
            minAttack = 10;
        }

        switch (hitDice) {
            case 2:
                minAttack = 9;
                break;
            case 3:
                minAttack = 8;
                break;
            case 4:
                minAttack = 7;
                break;
            case 5:
                minAttack = 6;
                break;
            case 6:
                minAttack = 5;
                break;
            case 7:
                minAttack = 4;
                break;
            case 8:
            case 9:
                minAttack = 3;
                break;
            case 10:
            case 11:
                minAttack = 2;
                break;
            case 12:
            case 13:
                minAttack = 1;
                break;
            case 14:
            case 15:
                minAttack = 0;
                break;
            case 16:
            case 17:
                minAttack = -1;
                break;
            case 18:
            case 19:
                minAttack = -2;
                break;
            case 20:
            case 21:
                minAttack = -3;
                break;
        }

        if (hitDice > 21) {
            minAttack = -4;
        }

        return minAttack;
    }
}
