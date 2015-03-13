package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Naturalism extends Proficiency {
    @Override
    public String getName() {
        return NATURALISM;
    }

    @Override
    public String getDescription() {
        return "The character is knowledgeable of common plant and animal life forms in terrain " +
                "typical to his background. The character is familiar with edible and poison " +
                "foods, healing herbs, and signs of unnatural danger (such as unusual quiet, " +
                "atypical animal behavior, etc.) in his known terrain with a proficiency throw " +
                "of 11+. This proficiency can be selected multiple times.";
    }
}
