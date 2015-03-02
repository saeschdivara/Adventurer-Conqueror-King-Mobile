package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class MagicalMusic extends Proficiency {
    @Override
    public String getName() {
        return MAGICAL_MUSIC;
    }

    @Override
    public String getDescription() {
        return "The character can perform music that can serenade members of the opposite " +
                "gender (as a charm person spell) or tame savage beasts (as a sleep spell). " +
                "The character must succeed on an appropriate Performance proficiency throw to " +
                "use Magical Music. If successful, the charm or sleep effect begins immediately " +
                "and lasts until the character stops performing. If the character performs for " +
                "a full turn (10 minutes), the effect has the duration of the spell. Magical " +
                "music has no effect if used against creatures that are already in combat.";
    }
}
