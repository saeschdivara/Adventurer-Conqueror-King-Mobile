package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class WeaponFinesse extends Proficiency {
    @Override
    public String getName() {
        return WEAPON_FINESSE;
    }

    @Override
    public String getDescription() {
        return "When attacking with one-handed melee weapons, the character may use " +
                "his Dexterity modifier instead of his Strength modifier on his attack throw.";
    }
}
