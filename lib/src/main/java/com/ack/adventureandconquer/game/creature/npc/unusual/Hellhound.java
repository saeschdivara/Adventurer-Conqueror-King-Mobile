package com.ack.adventureandconquer.game.creature.npc.unusual;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Hellhound extends Npc {
    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
