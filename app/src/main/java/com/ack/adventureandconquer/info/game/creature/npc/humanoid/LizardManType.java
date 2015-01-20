package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 17/01/15.
 */
public class LizardManType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number >= 30;
    }
}
