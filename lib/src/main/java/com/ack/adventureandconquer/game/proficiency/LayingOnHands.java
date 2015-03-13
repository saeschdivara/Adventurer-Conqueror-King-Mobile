package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class LayingOnHands extends Proficiency {
    @Override
    public String getName() {
        return LAYING_ON_HANDS;
    }

    @Override
    public String getDescription() {
        return "The character can heal himself or another by laying on hands once per day. " +
                "The character can restore 2 hit points per experience level. A character may " +
                "take this proficiency multiple times. Each time it is taken, the character may " +
                "lay on hands an additional time per day.";
    }
}
