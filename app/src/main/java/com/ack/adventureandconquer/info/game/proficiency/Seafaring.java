package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Seafaring extends Proficiency {
    @Override
    public String getName() {
        return SEAFARING;
    }

    @Override
    public String getDescription() {
        return "The character can crew large sailing ships or galleys. If a character selects " +
                "this proficiency twice, he can serve as a captain on a seagoing vessel, as " +
                "described in Specialists. If he selects this proficiency three times, he is " +
                "a master mariner. When tacking, a master mariner’s ship has its movement " +
                "rate reduced by only one category rather than by two (as described in the " +
                "Wilderness Adventures section), and his ship’s chance to evade is increased by +5.";
    }
}
