package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class QuietMagic extends Proficiency {
    @Override
    public String getName() {
        return QUIET_MAGIC;
    }

    @Override
    public String getDescription() {
        return "The character can cast spells with minimal words and gestures. " +
                "A successful proficiency throw to hear noise is required to hear the character " +
                "cast spells. Full gagging is necessary to prevent the character from " +
                "working magic.";
    }
}
