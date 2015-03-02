package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class DungeonBashing extends Proficiency {
    @Override
    public String getName() {
        return DUNGEON_BASHING;
    }

    @Override
    public String getDescription() {
        return "The character is hardened to the heavy lifting and physical labor involved in " +
                "dungeon exploration. The character receives a +4 bonus on throws to open doors " +
                "and similar acts of brute strength.";
    }
}
