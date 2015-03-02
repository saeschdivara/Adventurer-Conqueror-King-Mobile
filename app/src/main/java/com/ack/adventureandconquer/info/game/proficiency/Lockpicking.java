package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Lockpicking extends Proficiency {
    @Override
    public String getName() {
        return LOCKPICKING;
    }

    @Override
    public String getDescription() {
        return "The character is an expert with locks and receives a +2 bonus on proficiency " +
                "throws to open locks. He may open a lock in one round (rather than one turn) " +
                "by making a successful proficiency throw to open locks with a -4 penalty.";
    }
}
