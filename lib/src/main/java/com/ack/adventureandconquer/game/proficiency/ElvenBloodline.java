package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class ElvenBloodline extends Proficiency {
    @Override
    public String getName() {
        return ELVEN_BLOODLINE;
    }

    @Override
    public String getDescription() {
        return "The character has the blood of the ageless elves in his ancestry. His lifespan " +
                "is three times longer than normal for his race, and he shows no signs of aging. " +
                "He also enjoys the elf’s immunity to paralysis. The character’s ancestry must " +
                "manifest somehow in his appearance (pointed ears, golden eyes, a strange " +
                "birthmark, or other unusual trait.)";
    }
}
