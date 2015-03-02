package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class RighteousTurning extends Proficiency {
    @Override
    public String getName() {
        return RIGHTEOUS_TURNING;
    }

    @Override
    public String getDescription() {
        return "When turning undead, the character adds his Wisdom bonus to both the turning throw " +
                "and to the number of HD turned on a successful throw.";
    }
}
