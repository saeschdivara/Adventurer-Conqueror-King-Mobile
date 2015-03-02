package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class SiegeEngineering extends Proficiency {
    @Override
    public String getName() {
        return SIEGE_ENGINEERING;
    }

    @Override
    public String getDescription() {
        return "The character is highly skilled in the construction and placement of temporary " +
                "defensive works such as ditches, pits, fields of stakes, and simple wooden and " +
                "earthen barricades. He also knows how to operate heavy war machines and siege " +
                "engines such as ballistae, catapults, rams, bores, and siege towers. If the " +
                "proficiency is taken a second time, then the character has the knowledge to " +
                "construct heavy war machines, siege engines, and siege towers as well as use them.";
    }
}
