package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Bugbear extends HumanoidMonster {
    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+2 bonus to damage rolls from strength";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+3 bonus to damage rolls from strength";
        }
        if (isChieftain()) {
            return "Chieftain\n+4 bonus to damage rolls from strength";
        }
        if (getType() == Type.FEMALE) {
            return "Female";
        }
        if (getType() == Type.YOUNG) {
            return "Young";
        }

        return "receive a +1 to damage when they employ weapons";
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
