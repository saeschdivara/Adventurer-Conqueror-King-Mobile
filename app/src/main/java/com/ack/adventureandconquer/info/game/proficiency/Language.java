package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Language extends Proficiency {
    @Override
    public String getName() {
        return LANGUAGE;
    }

    @Override
    public String getDescription() {
        return "This proficiency enables the character to learn to speak, read, and write an " +
                "additional language (pick one). The character’s level of literacy with the " +
                "new language is determined by his Intelligence. Characters with an Intelligence " +
                "of 8 or less are generally illiterate. However, this proficiency can be taken " +
                "by a character with a low Intelligence (8 or less) in order to become literate " +
                "in a language the character already speaks.";
    }
}
