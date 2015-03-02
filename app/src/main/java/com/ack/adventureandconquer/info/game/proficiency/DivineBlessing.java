package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class DivineBlessing extends Proficiency {
    @Override
    public String getName() {
        return DIVINE_BLESSING;
    }

    @Override
    public String getDescription() {
        return "The character knows how to propitiate the gods and gain their favor. " +
                "He gains a +2 bonus to all saving throws.";
    }
}
