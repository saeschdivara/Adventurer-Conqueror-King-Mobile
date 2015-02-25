package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Adventuring extends Proficiency {
    @Override
    public String getName() {
        return ADVENTURING;
    }

    @Override
    public String getDescription() {
        return "The character is well-equipped for a life of adventure. He knows how to clean and " +
                "sharpen weapons, saddle and ride a horse, set up a camp, and search for a secret " +
                "door. He has a rough idea of the value of common coins, trade goods, gems, and " +
                "jewelry. All player characters are assumed to have Adventuring for purposes of " +
                "the proficiency throws of standard adventuring tasks.";
    }
}
