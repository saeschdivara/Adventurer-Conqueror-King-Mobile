package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Tracking extends Proficiency {
    @Override
    public String getName() {
        return TRACKING;
    }

    @Override
    public String getDescription() {
        return "The character can follow tracks with a proficiency throw of 11+. The Judge " +
                "should increase or decrease the chance of success depending on the " +
                "circumstances: +2 if tracking 2-4 creatures; +4 if tracking 4-8 creatures; " +
                "+6 if tracking 8-16 creatures; +8 if tracking 17+ creatures; +4 if trail is " +
                "through soft/ muddy ground; -8 if the trail is through hard/rocky ground; " +
                "-4 for bad lighting; -1 per 12 hours of good weather since trail was made; " +
                "-4 per hour of rain/snow since trail was made. Characters move at half " +
                "speed while tracking.";
    }
}
