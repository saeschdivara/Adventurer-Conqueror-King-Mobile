package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class CombatReflexes extends Proficiency {
    @Override
    public String getName() {
        return COMBAT_REFLEXES;
    }

    @Override
    public String getDescription() {
        return "True warriors never hesitate in combat. The character gains a +1 bonus on surprise " +
                "rolls and initiative rolls. This bonus does not apply when casting spells.";
    }
}
