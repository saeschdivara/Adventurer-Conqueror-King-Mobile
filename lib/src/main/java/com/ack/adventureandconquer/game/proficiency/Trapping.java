package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Trapping extends Proficiency {
    @Override
    public String getName() {
        return TRAPPING;
    }

    @Override
    public String getDescription() {
        return "The character can build simple pits, snares, and deadfalls capable of capturing " +
                "creatures up to the size of an elephant (such as giants, ogres, wyverns, etc). " +
                "With a proficiency throw of 11+ the snare is built properly. The character " +
                "can also detect and disable simple wilderness pits, snares, deadfalls, etc., " +
                "as a thief of his class level. This proficiency provides no abilities with " +
                "regard to mechanical traps in a dungeon, or magical traps of any sort.";
    }
}
