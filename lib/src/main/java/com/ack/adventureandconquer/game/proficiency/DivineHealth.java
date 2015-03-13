package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class DivineHealth extends Proficiency {
    @Override
    public String getName() {
        return DIVINE_HEALTH;
    }

    @Override
    public String getDescription() {
        return "The character knows how to purify his body and soul. He is immune to all forms " +
                "of disease, including magical diseases caused by spells, mummies, or lycanthropes.";
    }
}
