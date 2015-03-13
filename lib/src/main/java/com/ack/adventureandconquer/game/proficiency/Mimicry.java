package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Mimicry extends Proficiency {
    @Override
    public String getName() {
        return MIMICRY;
    }

    @Override
    public String getDescription() {
        return "The character can imitate animal calls and foreign language accents. " +
                "With a proficiency throw of 11+, the character’s mimicry (e.g. imitating " +
                "the screech of a hoot owl or a noise from some other animal) is so authentic " +
                "as to fool listeners into believing they have heard the actual animal. This " +
                "proficiency can be selected multiple times.";
    }
}
