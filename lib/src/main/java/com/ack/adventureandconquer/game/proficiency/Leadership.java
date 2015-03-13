package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Leadership extends Proficiency {
    @Override
    public String getName() {
        return LEADERSHIP;
    }

    @Override
    public String getDescription() {
        return "The character is an inspirational authority figure who earns great loyalty. " +
                "The character may hire one more henchman than his Charisma would otherwise " +
                "permit, and the base morale score of any domain he rules is increased by 1. " +
                "Domain morale is explained in the Campaign chapter.";
    }
}
