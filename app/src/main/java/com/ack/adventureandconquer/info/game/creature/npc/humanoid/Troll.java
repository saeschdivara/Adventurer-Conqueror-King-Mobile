package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Troll extends HumanoidMonster {
    @Override
    public String getExtraInformation() {
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
}
