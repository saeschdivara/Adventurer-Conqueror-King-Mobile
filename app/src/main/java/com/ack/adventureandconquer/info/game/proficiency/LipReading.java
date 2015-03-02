package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class LipReading extends Proficiency {
    @Override
    public String getName() {
        return LIP_READING;
    }

    @Override
    public String getDescription() {
        return "The character can “overhear” conversations spoken in a language he understands. " +
                "If the subject of his lip reading is not speaking clearly in bright light, " +
                "the character may need to make a successful proficiency throw to hear noise " +
                "in order to determine if he gleans the appropriate information. Characters with " +
                "Lip Reading proficiency receive a +1 bonus to carousing and spying hijinks. " +
                "See Hideouts and Hijinks in Chapter 7 for more information on carousing and spying.";
    }
}
