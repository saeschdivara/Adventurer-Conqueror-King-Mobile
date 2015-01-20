package com.ack.adventureandconquer.info.game.creature.npc.insect;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 18/01/15.
 */
public class RhagodessaType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 35;
    }
}
