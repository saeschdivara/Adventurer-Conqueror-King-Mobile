package com.ack.adventureandconquer.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Troll extends HumanoidMonster {

    private boolean isGuard = false;

    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+2 bonus to damage rolls with their natural attacks";
        }
        if (isGuard) {
            return "Guard\n+2 bonus to damage rolls with their natural attacks";
        }
        if (isChieftain()) {
            return "Chieftain";
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
        if (getType() == Type.YOUNG) {
            return "Young";
        }

        return "";
    }

    @Override
    public int getAdditionalHitPoints() {
        return 3;
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 6;
    }

    public void setGuard(boolean isGuard) {
        this.isGuard = isGuard;
    }
}
