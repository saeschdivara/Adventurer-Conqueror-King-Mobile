package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class LandSurveying extends Proficiency {
    @Override
    public String getName() {
        return LAND_SURVEYING;
    }

    @Override
    public String getDescription() {
        return "The character is an expert at surveying the land around him. With a " +
                "proficiency throw of 11+, the character can predict dangerous sinkholes, " +
                "deadfalls, collapses, or rock slides when the character enters the area. In " +
                "dungeons, an explorer with Land Surveying gains a +4 bonus to his throws to " +
                "escape detection due to his ability to find the best cover.";
    }
}
