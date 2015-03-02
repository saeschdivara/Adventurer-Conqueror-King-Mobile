package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class CombatTrickery extends Proficiency {
    @Override
    public String getName() {
        return COMBAT_TRICKERY;
    }

    @Override
    public String getDescription() {
        return "The character is a cunning and tricky fighter. Pick a special maneuver from " +
                "any one of the following: Disarm, Force Back, Incapacitate, Knock Down, " +
                "Overrun, Sunder, or Wrestle. When the character attempts this special maneuver " +
                "in combat, the normal penalty for attempting the maneuver is reduced by " +
                "2 (e.g. from -4 to -2), and his opponent suffers a -2 penalty to his saving " +
                "throw to resist the special maneuver. See Special Maneuvers in Chapter 6 for " +
                "more details. A character may take Combat Trickery multiple times, selecting an " +
                "additional special maneuver to learn each time.";
    }
}
