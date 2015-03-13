package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Diplomacy extends Proficiency {
    @Override
    public String getName() {
        return DIPLOMACY;
    }

    @Override
    public String getDescription() {
        return "The character is smooth tongued and familiar with protocol. " +
                "He receives a +2 bonus on all reaction rolls when he attempts to parley.";
    }
}
