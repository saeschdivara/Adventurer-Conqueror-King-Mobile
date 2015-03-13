package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Survival extends Proficiency {
    @Override
    public String getName() {
        return SURVIVAL;
    }

    @Override
    public String getDescription() {
        return "The character is an expert at hunting small game, gathering fruits and vegetables, " +
                "and finding water and shelter. The character forages enough food to feed himself " +
                "automatically, even when on the move, so long as he is in a fairly fertile area. " +
                "If he is trying to supply more than one person, he must make a proficiency " +
                "throw (as described in Wilderness Adventures), but gains a +4 bonus on the roll.";
    }
}
