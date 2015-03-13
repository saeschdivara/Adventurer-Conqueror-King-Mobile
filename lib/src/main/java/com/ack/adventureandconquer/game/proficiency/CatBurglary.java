package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class CatBurglary extends Proficiency {
    @Override
    public String getName() {
        return CAT_BURGLARY;
    }

    @Override
    public String getDescription() {
        return "The thief knows how to deftly move across narrow and precarious surfaces. " +
                "He may balance on thin ledges or tight ropes by making a proficiency throw " +
                "to climb walls. If the thief falls while climbing, the player may make a " +
                "second proficiency throw with a -4 penalty in order to catch himself and " +
                "prevent any damage.";
    }
}
