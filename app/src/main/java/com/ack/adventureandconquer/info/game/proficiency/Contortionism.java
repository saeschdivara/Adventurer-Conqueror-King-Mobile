package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Contortionism extends Proficiency {
    @Override
    public String getName() {
        return CONTORTIONISM;
    }

    @Override
    public String getDescription() {
        return "The character is extremely flexible, able to squeeze or fold his body in ways " +
                "that seem humanly impossible, including squeezing between bars and escaping chains " +
                "and restraints. He may make a proficiency throw of 18+ each round to escape from " +
                "bonds or to slip between the bars of a portcullis.";
    }
}
