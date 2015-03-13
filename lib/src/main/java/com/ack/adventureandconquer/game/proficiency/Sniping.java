package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Sniping extends Proficiency {
    @Override
    public String getName() {
        return SNIPING;
    }

    @Override
    public String getDescription() {
        return "If otherwise eligible to ambush or backstab his opponent, the character may do " +
                "so using ranged weapons at up to short range.";
    }
}
