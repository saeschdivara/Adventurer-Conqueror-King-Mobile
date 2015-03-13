package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Wakefulness extends Proficiency {
    @Override
    public String getName() {
        return WAKEFULNESS;
    }

    @Override
    public String getDescription() {
        return "The character requires only four hours of sleep to be rested each night.";
    }
}
