package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Hobgoblin extends HumanoidMonster {

    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+1 bonus to damage rolls from strength";
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
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }
}
