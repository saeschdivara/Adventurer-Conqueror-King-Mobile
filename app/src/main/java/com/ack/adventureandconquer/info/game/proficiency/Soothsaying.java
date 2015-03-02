package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Soothsaying extends Proficiency {
    @Override
    public String getName() {
        return SOOTHSAYING;
    }

    @Override
    public String getDescription() {
        return "The character is subject to premonitions and dreams of the past and future. " +
                "The Judge will make these visions both cryptic and useful. Once per week, " +
                "the character can contact higher plane (as the spell).";
    }
}
