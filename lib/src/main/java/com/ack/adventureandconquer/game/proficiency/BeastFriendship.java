package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class BeastFriendship extends Proficiency {
    @Override
    public String getName() {
        return BEAST_FRIENDSHIP;
    }

    @Override
    public String getDescription() {
        return "The character is well-schooled in the natural world. He can identify plants " +
                "and fauna with a proficiency throw of 11+, and understands the subtle body " +
                "language and moods of birds and beasts " +
                "(though they may not understand the character). He gains +2 to " +
                "all reaction rolls when encountering normal animals, and can take animals " +
                "as henchmen.";
    }
}
