package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 26/01/15.
 */
public class GiantWeasel extends Npc {
    @Override
    public int getAdditionalHitPoints() {
        return 4;
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 4;
    }
}
