package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class IllusionResistance extends Proficiency {
    @Override
    public String getName() {
        return ILLUSION_RESISTANCE;
    }

    @Override
    public String getDescription() {
        return "The character is as hard to fool as the most cynical dwarf. The character " +
                "receives +4 bonus on saving throws to disbelieve magical illusions.";
    }
}
