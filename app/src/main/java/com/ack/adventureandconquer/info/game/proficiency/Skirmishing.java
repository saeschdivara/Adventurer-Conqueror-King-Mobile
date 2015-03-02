package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Skirmishing extends Proficiency {
    @Override
    public String getName() {
        return SKIRMISHING;
    }

    @Override
    public String getDescription() {
        return "The character may withdraw or retreat from melee combat without declaring " +
                "the intention to do so at the start of the melee round. Characters without " +
                "this proficiency must declare defensive movement before initiative dice are " +
                "rolled. See Defensive Movement in Chapter 6.";
    }
}
