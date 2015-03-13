package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class BattleMagic extends Proficiency {
    @Override
    public String getName() {
        return BATTLE_MAGIC;
    }

    @Override
    public String getDescription() {
        return "The character gains a +1 initiative bonus when casting spells. He is considered " +
                "2 class levels higher than his actual level of experience for purposes of " +
                "dispelling magic or penetrating a target’s magic resistance.";
    }
}
