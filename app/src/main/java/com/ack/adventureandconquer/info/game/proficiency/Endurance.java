package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Endurance extends Proficiency {
    @Override
    public String getName() {
        return ENDURANCE;
    }

    @Override
    public String getDescription() {
        return "The character is nearly tireless. He does not need to rest every 6 turns. " +
                "He can force march for one day without penalty, plus one additional day for " +
                "each point of Constitution bonus.";
    }
}
