package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Command extends Proficiency {
    @Override
    public String getName() {
        return COMMAND;
    }

    @Override
    public String getDescription() {
        return "The character has mastered the art of command. His authority inspires men to " +
                "follow him into danger. The character’s henchmen and mercenaries receive " +
                "a +2 bonus to morale. Morale is explained in Hirelings, Henchmen, Mercenaries, " +
                "and Specialists.";
    }
}
