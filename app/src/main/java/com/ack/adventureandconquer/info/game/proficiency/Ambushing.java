package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Ambushing extends Proficiency {
    @Override
    public String getName() {
        return AMBUSHING;
    }

    @Override
    public String getDescription() {
        return "When the character attacks with surprise, he gets a +4 bonus on his attack " +
                "throws and deals double damage on the attack. This proficiency does not stack " +
                "with the ability of thieves (or related classes) to backstab.";
    }
}
