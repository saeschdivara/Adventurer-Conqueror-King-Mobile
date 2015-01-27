package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Hobgoblin extends HumanoidMonster {
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
