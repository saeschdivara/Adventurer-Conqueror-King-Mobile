package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Riding extends Proficiency {
    @Override
    public String getName() {
        return RIDING;
    }

    @Override
    public String getDescription() {
        return "The character knows not only the care and feeding of a riding animal, but " +
                "also how to handle it under difficult circumstances, such as using a " +
                "weapon from its back. For each type of animal, this proficiency must be " +
                "selected separately. This proficiency is not required to simply ride a " +
                "domesticated animal under non-combat conditions.";
    }
}
