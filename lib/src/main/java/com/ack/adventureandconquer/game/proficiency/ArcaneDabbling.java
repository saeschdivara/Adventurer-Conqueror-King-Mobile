package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class ArcaneDabbling extends Proficiency {
    @Override
    public String getName() {
        return ARCANE_DABBLING;
    }

    @Override
    public String getDescription() {
        return "The character may attempt to use wands, staffs, and other magic items " +
                "only useable by mages. At level 1, the character must make a proficiency " +
                "throw of 18+ or the attempt backfires. The proficiency throw required " +
                "reduces by 2 per level, to a minimum of 3+. Note that bards automatically " +
                "begin play with this ability as part of their class.";
    }
}
