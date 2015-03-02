package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Apostasy extends Proficiency {
    @Override
    public String getName() {
        return APOSTASY;
    }

    @Override
    public String getDescription() {
        return "The character has learned knowledge forbidden to his order. He may select 4 " +
                "divine spells not normally available to worshippers of his god and add " +
                "them to his repertoire.";
    }
}
