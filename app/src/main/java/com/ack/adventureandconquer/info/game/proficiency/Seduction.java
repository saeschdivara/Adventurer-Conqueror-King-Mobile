package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Seduction extends Proficiency {
    @Override
    public String getName() {
        return SEDUCTION;
    }

    @Override
    public String getDescription() {
        return "The character is either naturally alluring or a practiced seducer. He always " +
                "receives a +2 bonus on reaction rolls with the opposite sex of similar species.";
    }
}
