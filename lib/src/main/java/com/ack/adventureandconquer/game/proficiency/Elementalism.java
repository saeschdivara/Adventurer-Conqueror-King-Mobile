package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Elementalism extends Proficiency {
    @Override
    public String getName() {
        return ELEMENTALISM;
    }

    @Override
    public String getDescription() {
        return "Choose an element (air, earth, fire, water). Spells using this element do +1 damage " +
                "per die and impose a -2 saving throw penalty on the target. Elementals summoned " +
                "from this element gain +1 hp per Hit Die. The character’s magic missiles can be " +
                "considered to be of this element, if he desires.";
    }
}
