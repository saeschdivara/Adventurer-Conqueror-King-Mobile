package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class SensingPower extends Proficiency {
    @Override
    public String getName() {
        return SENSING_POWER;
    }

    @Override
    public String getDescription() {
        return "The character can detect spellcasters within 60' and estimate their level of " +
                "power relative to his own. He can tell when arcane magic has been used " +
                "within the last 24 hours within the same vicinity. (The character cannot " +
                "necessarily sense whether an item is magic, unless it has been used in the " +
                "last 24 hours.) Each use takes a turn.";
    }
}
