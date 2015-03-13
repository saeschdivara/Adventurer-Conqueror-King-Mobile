package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class MysticAura extends Proficiency {
    @Override
    public String getName() {
        return MYSTIC_AURA;
    }

    @Override
    public String getDescription() {
        return "The character has learned to project his magical powers in a way that causes " +
                "awe in those that share the character’s presence. He gains a +2 bonus to " +
                "reaction rolls to impress and intimidate people he encounters. If this bonus " +
                "results in a total of 12 or more, the subjects act as if charmed while in " +
                "his presence.";
    }
}
