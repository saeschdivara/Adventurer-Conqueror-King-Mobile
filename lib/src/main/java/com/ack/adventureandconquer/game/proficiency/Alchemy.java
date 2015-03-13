package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Alchemy extends Proficiency {
    @Override
    public String getName() {
        return ALCHEMY;
    }

    @Override
    public String getDescription() {
        return "The character can identify common alchemical substances, potions, and poisons " +
                "with a proficiency throw of 11+. If the character takes this proficiency " +
                "twice, he can work as an apothecary or alchemical assistant. If the character " +
                "takes this proficiency three times, he is an alchemist himself, as described " +
                "under Hiring Specialists.";
    }
}
