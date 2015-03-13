package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Theology extends Proficiency {
    @Override
    public String getName() {
        return THEOLOGY;
    }

    @Override
    public String getDescription() {
        return "The character has received formal religious instruction at a seminary or " +
                "monastery, and is a member of the church hierarchy. He can automatically " +
                "identify religious symbols, spell signatures, trappings, and holy days of " +
                "his own faith, and can recognize those of other faiths with a proficiency " +
                "throw of 11+. Rare or occult cults may be harder to recognize " +
                "(Judge’s discretion). Note that dwarven craftpriests automatically " +
                "begin play with this ability as part of their class. This proficiency " +
                "can be selected multiple times.";
    }
}
