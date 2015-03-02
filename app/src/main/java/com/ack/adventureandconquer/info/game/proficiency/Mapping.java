package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Mapping extends Proficiency {
    @Override
    public String getName() {
        return MAPPING;
    }

    @Override
    public String getDescription() {
        return "The character can understand and make maps, even if he cannot read or write. " +
                "With a proficiency throw of 11+, the character can interpret or draft " +
                "complicated layouts or map an area by memory. This proficiency can be " +
                "selected multiple times.";
    }
}
