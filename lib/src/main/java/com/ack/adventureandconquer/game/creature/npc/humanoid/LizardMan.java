package com.ack.adventureandconquer.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class LizardMan extends HumanoidMonster {
    @Override
    public String getExtraInformation() {

        if (isChampion()) {
            return "Champion\n+1 damage with its natural attacks, or +2 damage when using weapons";
        }
        if (isSubChieftain()) {
            return "Sub Chieftain\n+2 damage with its natural attacks, or +3 damage when using weapons";
        }
        if (isChieftain()) {
            return "Sub Chieftain\n+2 damage with its natural attacks, or +3 damage when using weapons";
        }

        return "+1 bonus to damage with weapons";
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
        return 2;
    }
}
