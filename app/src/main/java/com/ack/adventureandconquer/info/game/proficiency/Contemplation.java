package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Contemplation extends Proficiency {
    @Override
    public String getName() {
        return CONTEMPLATION;
    }

    @Override
    public String getDescription() {
        return "The character may enter a meditative trance and re-gain the ability to cast a " +
                "spell of a level he had previously expended. Contemplation requires one hour " +
                "(6 turns) of undisturbed meditation. A character may not regain the same level " +
                "of spell more than once per day through contemplation.";
    }
}
