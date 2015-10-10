package com.ack.adventureandconquer.game.creature.npc;

import com.ack.adventureandconquer.game.creature.IsMonster;
import com.ack.adventureandconquer.game.dice.D10;
import com.ack.adventureandconquer.game.dice.D100;
import com.ack.adventureandconquer.game.dice.D2;
import com.ack.adventureandconquer.game.dice.D20;
import com.ack.adventureandconquer.game.dice.D3;
import com.ack.adventureandconquer.game.dice.D4;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.D8;
import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.dice.RangeDice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by saskyrar on 19/01/15.
 * Modified by Florian Hübner
 */
public abstract class Npc {

    private int armorClass = -1;
    private int hitDice = -1;
    private int hitPoints = -1;
    private int morale = -5;
    private int additionalHitPoints = 0;
    private String saves = "";
    ArrayList<String> attackRoutine = new ArrayList<String>();
    ArrayList<String> alternateAttackRoutine = new ArrayList<String>();
    private String extrainformation = "";
    private int movement = -1;
    private int extraMovement = -1;
    private String alignment = "";

    protected static IsDice d2 = new D2();
    protected static IsDice d3 = new D3();
    protected static IsDice d4 = new D4();
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();
    protected static IsDice d10 = new D10();
    protected static IsDice d12 = new D10();
    protected static IsDice d20 = new D20();
    protected static IsDice d100 = new D100();

    public String getExtraInformation() {
        return extrainformation;
    }

    public void setExtraInformation(String extrainformation) {
        this.extrainformation = extrainformation;
    }

    public void addExtraInformation(String extrainformation) {
        this.extrainformation += extrainformation;
    }

    public String getDefaultAlignment() {
        return "neutral";
    }

    public String getAlignment() {
        if (alignment == "") {
            return getDefaultAlignment();
        } else
            return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getDefaultHitPoints() {
        return 0;
    }

    public int getHitPoints() {
        if (hitPoints < 0)
            hitPoints = getDefaultHitPoints();

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
        if (armorClass < 0) {
            armorClass = getDefaultArmorClass();
        }

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
            hitDice = getDefaultHitDice();

        return hitDice;
    }


    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }


    public int getMorale() {
        if (morale < -4)
            morale = getDefaultMorale();
        return morale;
    }

    public int getDefaultMorale() {
        return 0;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public String getSaves() {
        if (saves.isEmpty()) {
            saves = getDefaultSaves();
        }
        return _findSaves(saves);
    }

    public String getDefaultSaves() {
        return "F1";
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    public int getDefaultMovement() {
        return 120;
    }

    public int getMovement() {
        if (movement < 0) {
            return getDefaultMovement();
        } else {
            return movement;
        }

    }

    public void setMovement(int mov) {
        movement = mov;
    }

    public String getMovementString() {
        int combat = getMovement() / 3;
        String move = getMovement() + "(" + combat + ")";
        return move;
    }

    public int getDefaultExtraMovement() {
        return 120;
    }

    public int getExtraMovement() {
        if (movement < 0) {
            return getDefaultExtraMovement();
        } else {
            return movement;
        }

    }

    public void setExtraMovement(int mov) {
        movement = mov;
    }

    public String getExtraMovementString() {
        int combat = getExtraMovement() / 3;
        String move = getExtraMovement() + "(" + combat + ")";
        return move;
    }

    public String getExtraMovementType() {
        return "";
    }

    public int getMinAttackThrowValue() {
        int minAttack = 0;

//        if (this instanceof IsMonster) {
        minAttack = _getMinMonsterAttackThrow();
//        }

        // TODO: Implement others

        return minAttack;
    }

    public ArrayList<String> getAttackRoutine() {
        return attackRoutine;
    }

    public void setAttackRoutine(ArrayList attackRoutine) {
        this.attackRoutine = attackRoutine;
    }

    public void addToAttackRoutine(String description) {
//        this.attackRoutine = new ArrayList<String>();
        attackRoutine.add(description);
    }

    private String _findSaves(String saveClass) {
        String saves = "";
        switch (saveClass) {
            case "F0":
                saves = "Paralysis 16+, Death 15+,  Breath 17+, Wands 17+, Spells 18+";
                break;
            case "F1":
                saves = "Paralysis 15+, Death 14+,  Breath 16+, Wands 16+, Spells 17+";
                break;
            case "F2":
            case "F3":
                saves = "Paralysis 14+, Death 13+,  Breath 15+, Wands 15+, Spells 16+";
                break;
            case "F4":
                saves = "Paralysis 13+, Death 12+,  Breath 14+, Wands 14+, Spells 15+";
                break;
            case "F5":
            case "F6":
                saves = "Paralysis 12+, Death 11+,  Breath 13+, Wands 13+, Spells 14+";
                break;
            case "F7":
                saves = "Paralysis 11+, Death 10+,  Breath 12+, Wands 12+, Spells 13+";
                break;
            case "F8":
            case "F9":
                saves = "Paralysis 10+, Death 9+,  Breath 11+, Wands 11+, Spells 12+";
                break;
            case "F10":
                saves = "Paralysis 9+, Death 8+,  Breath 10+, Wands 10+, Spells 11+";
                break;
            case "F11":
            case "F12":
                saves = "Paralysis 8+, Death 7+,  Breath 9+, Wands 9+, Spells 10+";
                break;
            case "F13":
                saves = "Paralysis 7+, Death 6+,  Breath 8+, Wands 8+, Spells 9+";
                break;
            case "F14":
                saves = "Paralysis 6+, Death 5+,  Breath 7+, Wands 7+, Spells 8+";
                break;
            case "F15":
                saves = "Paralysis 5+, Death 4+,  Breath 6+, Wands 6+, Spells 7+";
                break;
            case "F16":
                saves = "Paralysis 4+, Death 3+,  Breath 5+, Wands 5+, Spells 6+";
                break;
            case "F17":
                saves = "Paralysis 3+, Death 2+,  Breath 4+, Wands 4+, Spells 5+";
                break;
            case "F18":
                saves = "Paralysis 2+, Death 4+,  Breath 3+, Wands 3+, Spells 4+";
                break;
            case "F19":
                saves = "Paralysis 2+, Death 3+,  Breath 2+, Wands 2+, Spells 3+";
                break;
            case "F20":
                saves = "Paralysis 2+, Death 2+,  Breath 2+, Wands 2+, Spells 2+";
                break;
        }


        return saves;
    }

    private int _getMinMonsterAttackThrow() {
        int minAttack = 12;
        int hitDice = getHitDice();

        if (hitDice < 1) {
            minAttack = 10;
        }

        if (additionalHitPoints > 0) {
            hitDice += 1;
        }

        switch (hitDice) {
            case 1:
                minAttack = 10;
                break;
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
