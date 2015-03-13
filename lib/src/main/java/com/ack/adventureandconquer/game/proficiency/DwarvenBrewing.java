package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class DwarvenBrewing extends Proficiency {
    @Override
    public String getName() {
        return DWARVEN_BREWING;
    }

    @Override
    public String getDescription() {
        return "The character knows the secrets of the famed beer and ale of the dwarves. " +
                "Because of his familiarity with mixology, he may make a proficiency " +
                "throw of 11+ to determine the magical properties of a potion or oil on taste. " +
                "He gains a +4 bonus to proficiency throws to craft alcoholic beverages.";
    }
}
