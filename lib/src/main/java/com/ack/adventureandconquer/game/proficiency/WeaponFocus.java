package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class WeaponFocus extends Proficiency {
    @Override
    public String getName() {
        return WEAPON_FOCUS;
    }

    @Override
    public String getDescription() {
        return "When using a favored type of weapon, the character is capable of devastating " +
                "strikes. On an attack throw scoring an unmodified 20 when using his favored " +
                "weapon, the character inflicts double normal damage. A character may take " +
                "this proficiency multiple times, selecting an additional Weapon Focus each " +
                "time. The available Weapon Focuses are: axes; maces, flails and hammers; " +
                "swords and daggers; bows and crossbows; slings and thrown weapons; spears " +
                "and polearms. Weapon Focus does not allow a character to use weapons not " +
                "available to his class.";
    }
}
