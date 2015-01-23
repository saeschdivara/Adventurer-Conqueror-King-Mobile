package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 23/01/15.
 */
public class Bugbear extends Npc {
    @Override
    public String getExtraInformation() {
        return "receive a +1 to damage when they employ weapons";
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }
}
