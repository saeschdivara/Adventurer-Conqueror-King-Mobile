package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class UnflappableCasting extends Proficiency {
    @Override
    public String getName() {
        return UNFLAPPABLE_CASTING;
    }

    @Override
    public String getDescription() {
        return "When the character loses a spell by being interrupted or taking damage during " +
                "the round, he does not lose his action for the round. While he still loses " +
                "the spell, he may now move and attack normally. Characters without this " +
                "proficiency lose the opportunity to act at all if they are interrupted " +
                "while casting a spell. See Casting Spells in Chapter 5 and Chapter 6.";
    }
}
