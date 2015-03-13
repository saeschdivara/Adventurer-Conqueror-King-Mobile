package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class MilitaryStrategy extends Proficiency {
    @Override
    public String getName() {
        return MILITARY_STRATEGY;
    }

    @Override
    public String getDescription() {
        return "The character has studied the art of war and the methods of the great " +
                "captains. He can recognize famous historical battles, generals, and weapons " +
                "with a proficiency throw of 11+. Forces under his command receive a +1 bonus " +
                "to initiative rolls in mass combat. This proficiency may be selected multiple " +
                "times, each time adding an additional +1 bonus to mass combat initiative, " +
                "to a maximum of +3.";
    }
}
