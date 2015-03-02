package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Mountaineering extends Proficiency {
    @Override
    public String getName() {
        return MOUNTAINEERING;
    }

    @Override
    public String getDescription() {
        return "The character can use mountaineering gear to climb difficult mountains and " +
                "cliff faces, and to rig lines to enable non-climbers to tackle those faces " +
                "as well, as a thief of their class level. This proficiency does not allow " +
                "the character to climb sheer surfaces during combat or without extensive gear.";
    }
}
