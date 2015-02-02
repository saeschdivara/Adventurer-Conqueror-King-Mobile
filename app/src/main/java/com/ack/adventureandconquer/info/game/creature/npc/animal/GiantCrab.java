package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 02/02/15.
 */
public class GiantCrab extends Npc {

    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
