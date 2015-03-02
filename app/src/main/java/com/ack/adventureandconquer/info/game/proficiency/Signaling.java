package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Signaling extends Proficiency {
    @Override
    public String getName() {
        return SIGNALING;
    }

    @Override
    public String getDescription() {
        return "The character knows how to transmit messages to other signaling specialists of " +
                "the same military force, culture, trade guild, or other organization. This " +
                "is similar to learning an additional language. The character must specify " +
                "the style and culture of signals that he has learned when he takes this " +
                "proficiency. Examples of signals include naval flags, cavalry trumpets, or " +
                "smoke signals.";
    }
}
