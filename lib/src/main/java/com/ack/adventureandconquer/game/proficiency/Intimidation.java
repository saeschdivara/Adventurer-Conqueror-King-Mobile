package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Intimidation extends Proficiency {
    @Override
    public String getName() {
        return INTIMIDATION;
    }

    @Override
    public String getDescription() {
        return "The character knows how to bully others to get what he wants. He receives a " +
                "+2 bonus on all reaction rolls when implicitly or explicitly threatening " +
                "violence or dire consequences. The targets must be 5 HD or less, or the " +
                "character and his allies must outnumber or grossly outrank the targets.";
    }
}
