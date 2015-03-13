package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class CollegiateWizardry extends Proficiency {
    @Override
    public String getName() {
        return COLLEGIATE_WIZARDRY;
    }

    @Override
    public String getDescription() {
        return "The character has received formal magical education from a wizard’s guild. He can " +
                "automatically identify arcane symbols, spell signatures, trappings, and " +
                "grimoires of his own order, and can recognize those of other orders or " +
                "traditions with a proficiency throw of 11+. Rare or esoteric traditions may be " +
                "harder to recognize (Judge’s discretion). A character may select this proficiency " +
                "additional times.";
    }
}
