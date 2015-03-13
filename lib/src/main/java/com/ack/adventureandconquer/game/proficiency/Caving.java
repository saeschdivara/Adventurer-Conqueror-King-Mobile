package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Caving extends Proficiency {
    @Override
    public String getName() {
        return CAVING;
    }

    @Override
    public String getDescription() {
        return "The character has learned to keep a map in his head of where he is when exploring " +
                "underground caves, cavern complexes, and rivers. On a proficiency throw of 11+, " +
                "the character with this proficiency will be able to automatically know the route " +
                "he has taken to get where he is, if he was conscious at the time.";
    }
}
