package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class TrapFinding extends Proficiency {
    @Override
    public String getName() {
        return TRAP_FINDING;
    }

    @Override
    public String getDescription() {
        return "The character is an expert trap finder, receiving a +2 bonus on proficiency " +
                "throws to find and remove traps. He may find a trap in one round " +
                "(rather than one turn) by making a successful proficiency throw with a -4 penalty.";
    }
}
