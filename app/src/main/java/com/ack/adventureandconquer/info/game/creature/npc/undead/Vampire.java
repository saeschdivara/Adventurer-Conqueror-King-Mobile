package com.ack.adventureandconquer.info.game.creature.npc.undead;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.RangeDice;

/**
 * Created by saskyrar on 11/02/15.
 */
public class Vampire extends Npc {

    private static RangeDice rangeDice = new RangeDice(7, 9);

    @Override
    public int getDefaultArmorClass() {
        return 7;
    }

    @Override
    public int getDefaultHitDice() {
        return rangeDice.role();
    }
}
