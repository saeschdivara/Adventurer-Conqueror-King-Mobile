package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class SensingEvil extends Proficiency {
    @Override
    public String getName() {
        return SENSING_EVIL;
    }

    @Override
    public String getDescription() {
        return "At will, the character can detect evil (as the spell) up to 60' away by " +
                "concentrating. Each use takes a turn.";
    }
}
