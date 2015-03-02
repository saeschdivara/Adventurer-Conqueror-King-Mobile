package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Berserkergang extends Proficiency {
    @Override
    public String getName() {
        return BERSERKERGANG;
    }

    @Override
    public String getDescription() {
        return "The character may enter a berserker rage. While enraged, he gains a " +
                "+2 bonus to attack throws and becomes immune to fear. However, the character " +
                "has a -2 penalty to AC and cannot retreat from combat. Once it has begun, a " +
                "berserker rage cannot be ended until combat ends.";
    }
}
