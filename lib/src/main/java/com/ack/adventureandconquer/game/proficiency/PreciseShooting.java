package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class PreciseShooting extends Proficiency {
    @Override
    public String getName() {
        return PRECISE_SHOOTING;
    }

    @Override
    public String getDescription() {
        return "The character may conduct missile attacks against opponents engaged in melee " +
                "at a -4 penalty to his attack throw. A character may take this proficiency " +
                "multiple times. Each time the proficiency is taken, the penalty to attack " +
                "opponents in melee is reduced by 2. Characters without this proficiency " +
                "cannot attack opponents engaged in melee with missile attacks.";
    }
}
