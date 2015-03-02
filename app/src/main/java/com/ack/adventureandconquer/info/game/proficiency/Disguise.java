package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Disguise extends Proficiency {
    @Override
    public String getName() {
        return DISGUISE;
    }

    @Override
    public String getDescription() {
        return "The character can make someone look like someone else through make-up and clothing. " +
                "A successful Disguise requires a proficiency throw of 11+. Someone who is " +
                "intimately familiar with the subject of the disguise may throw 14+ to see through " +
                "it, adding their Wisdom modifier to their die roll.";
    }
}
