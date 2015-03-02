package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Alertness extends Proficiency {
    @Override
    public String getName() {
        return ALERTNESS;
    }

    @Override
    public String getDescription() {
        return "The character gains a +4 bonus on any proficiency throws to hear noises " +
                "and detect secret doors. With a proficiency throw of 18+ he can notice " +
                "secret doors with just casual observation. He gains a +1 bonus to avoid surprise.";
    }
}
