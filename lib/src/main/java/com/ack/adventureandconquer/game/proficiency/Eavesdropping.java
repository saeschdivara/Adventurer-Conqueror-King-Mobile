package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Eavesdropping extends Proficiency {
    @Override
    public String getName() {
        return EAVES_DROPPING;
    }

    @Override
    public String getDescription() {
        return "The character can hear noises as a thief of his class level.";
    }
}
