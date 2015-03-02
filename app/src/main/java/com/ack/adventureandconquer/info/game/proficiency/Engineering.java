package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Engineering extends Proficiency {
    @Override
    public String getName() {
        return ENGINEERING;
    }

    @Override
    public String getDescription() {
        return "The character is skilled in planning, designing, and constructing castles, " +
                "towers, roads, and so forth. Any character with this skill can evaluate " +
                "constructions the party is passing through to assess what shape they are in, " +
                "when and by whom they were built, etc., with a proficiency throw of 11+. Each " +
                "time this proficiency is taken, the character can supervise 25,000gp worth of " +
                "permanent construction. A character who has taken this proficiency four times " +
                "is the equivalent of the engineer specialist described in the Specialists section.";
    }
}
