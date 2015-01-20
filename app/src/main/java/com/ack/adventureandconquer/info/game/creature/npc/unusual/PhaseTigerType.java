package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 18/01/15.
 */
public class PhaseTigerType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 25;
    }
}
