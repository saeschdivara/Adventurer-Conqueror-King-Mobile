package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;

/**
 * Created by saskyrar on 18/01/15.
 */
public class GhoulType implements IsNpc {
    @Override
    public boolean isLair(int number) {
        return number >= 20;
    }
}
