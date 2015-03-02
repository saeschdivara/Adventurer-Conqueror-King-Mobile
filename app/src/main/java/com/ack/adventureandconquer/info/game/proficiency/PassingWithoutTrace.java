package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class PassingWithoutTrace extends Proficiency {
    @Override
    public String getName() {
        return PASSING_WITHOUT_TRACE;
    }

    @Override
    public String getDescription() {
        return "The character leaves no sign of his passing over wilderness terrain, and may " +
                "not be tracked. For every 3 levels of experience, the character may cover " +
                "the tracks of an additional traveling companion.";
    }
}
