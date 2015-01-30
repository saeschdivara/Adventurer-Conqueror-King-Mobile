package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 30/01/15.
 */
public class StoneGiant extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 9;
    }
}
