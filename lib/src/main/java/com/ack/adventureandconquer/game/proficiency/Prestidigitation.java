package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Prestidigitation extends Proficiency {
    @Override
    public String getName() {
        return PRESTIDIGITATION;
    }

    @Override
    public String getDescription() {
        return "The character can magically accomplish simple illusions and sleight of hand " +
                "tricks suitable for impressing peasants, such as lighting a candle or " +
                "shuffling cards, at will. The character must be able to perform the task " +
                "physically, and be free to speak and gesture. He may use magical sleight-of-hand " +
                "to pick pockets as a thief of one half his class level.";
    }
}
