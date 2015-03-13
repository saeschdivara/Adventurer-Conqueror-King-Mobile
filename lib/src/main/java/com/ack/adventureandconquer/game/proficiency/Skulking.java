package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Skulking extends Proficiency {
    @Override
    public String getName() {
        return SKULKING;
    }

    @Override
    public String getDescription() {
        return "The character excels at moving furtively and finding concealment. He receives a " +
                "+2 bonus on proficiency throws to hide in shadows and move silently.";
    }
}
