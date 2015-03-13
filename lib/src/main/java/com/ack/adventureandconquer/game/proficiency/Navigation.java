package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Navigation extends Proficiency {
    @Override
    public String getName() {
        return NAVIGATION;
    }

    @Override
    public String getDescription() {
        return "The character can take the position of the sun and stars to determine roughly " +
                "where he is. He gains a +4 bonus on proficiency throws to avoid getting " +
                "lost in the wilderness. He can serve as a navigator on a seagoing vessel as " +
                "described in Specialists.";
    }
}
