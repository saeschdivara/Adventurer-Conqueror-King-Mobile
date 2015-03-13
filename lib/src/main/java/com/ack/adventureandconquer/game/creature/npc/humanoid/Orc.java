package com.ack.adventureandconquer.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 26/01/15.
 */
public class Orc extends HumanoidMonster {

    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+1 bonus to damage rolls from strength";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+1 bonus to damage rolls from strength";
        }
        if (isChieftain()) {
            return "Chieftain\n+2 bonus to damage rolls from strength";
        }
        if (isShaman()) {
            return "Shaman\nCleric Level: " + String.valueOf(getClericalLevel());
        }
        if (isWitchDoctor()) {
            return "Witch Doctor\nMage Level: " + String.valueOf(getMageLevel());
        }
        if (getType() == Type.FEMALE) {
            return "Female";
        }

        return "";
    }

    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }
}
