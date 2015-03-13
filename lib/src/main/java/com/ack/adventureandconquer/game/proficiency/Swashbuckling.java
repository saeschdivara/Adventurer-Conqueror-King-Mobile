package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Swashbuckling extends Proficiency {
    @Override
    public String getName() {
        return SWASHBUCKLING;
    }

    @Override
    public String getDescription() {
        return "The character gains a +1 bonus to Armor Class if wearing leather armor or less " +
                "and able to move freely. At level 7, this bonus increases to +2, and at " +
                "level 13 the bonus increases to +3.";
    }
}
