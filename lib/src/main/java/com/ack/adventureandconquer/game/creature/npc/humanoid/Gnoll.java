package com.ack.adventureandconquer.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Gnoll extends HumanoidMonster {
    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+2 bonus to damage rolls from strength";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+2 bonus to damage rolls";
        }
        if (isChieftain()) {
            return "Chieftain\n+3 bonus to damage rolls";
        }

        return "+1 bonus to damage rolls due to their high strength";
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
