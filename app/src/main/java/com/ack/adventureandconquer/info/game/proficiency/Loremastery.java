package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Loremastery extends Proficiency {
    @Override
    public String getName() {
        return LOREMASTERY;
    }

    @Override
    public String getDescription() {
        return "The character is knowledgeable on a variety of esoteric subjects. At level 1, " +
                "the character may make a proficiency throw of 18+ to decipher occult runes, " +
                "remember ancient history, or identify a historic artifact. The proficiency " +
                "throw required reduces by 1 per level. Note that bards automatically begin " +
                "play with this proficiency as part of their class.";
    }
}
