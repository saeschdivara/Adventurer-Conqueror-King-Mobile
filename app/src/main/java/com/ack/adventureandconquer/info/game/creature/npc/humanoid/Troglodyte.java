package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 29/01/15.
 */
public class Troglodyte extends HumanoidMonster {

    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+2 bonus to damage rolls from strength";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+2 bonus to damage rolls from strength";
        }
        if (isChieftain()) {
            return "Chieftain\n+3 bonus to damage rolls from strength";
        }

        return "";
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 2;
    }
}
