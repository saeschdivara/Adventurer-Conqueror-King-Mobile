package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Climbing extends Proficiency {
    @Override
    public String getName() {
        return CLIMBING;
    }

    @Override
    public String getDescription() {
        return "The character can climb cliffs, branchless trees, walls, and other sheer surfaces, " +
                "without climbing aids, as a thief of his class level.";
    }
}
