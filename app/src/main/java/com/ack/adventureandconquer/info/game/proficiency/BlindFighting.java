package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class BlindFighting extends Proficiency {
    @Override
    public String getName() {
        return BLIND_FIGHTING;
    }

    @Override
    public String getDescription() {
        return "The character can fight a target without being able to see it. " +
                "Blind Fighting is typically used when the character is in darkness or " +
                "when the target is outside the range of his sight. A character with this " +
                "proficiency suffers only a -2 penalty on attack throws when blinded or " +
                "fighting invisible enemies instead of the base -4 penalty.";
    }
}
