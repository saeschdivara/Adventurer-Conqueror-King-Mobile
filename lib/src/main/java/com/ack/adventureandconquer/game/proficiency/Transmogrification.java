package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Transmogrification extends Proficiency {
    @Override
    public String getName() {
        return TRANSMOGRIFICATION;
    }

    @Override
    public String getDescription() {
        return "The character has mastered grotesque arts of transformation. When the character " +
                "casts polymorph spells (such as polymorph other), the spell effects are " +
                "calculated as if he were two class levels higher than his actual level of " +
                "experience. He may also create magical crossbreeds (see Crossbreeds in Chapter 7) " +
                "as if he were two class levels higher than actual. Targets of his polymorph " +
                "other spells suffer a -2 penalty to their saving throw.";
    }
}
