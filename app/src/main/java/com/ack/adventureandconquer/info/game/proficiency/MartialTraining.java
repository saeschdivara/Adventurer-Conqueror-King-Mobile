package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class MartialTraining extends Proficiency {
    @Override
    public String getName() {
        return MARTIAL_TRAINING;
    }

    @Override
    public String getDescription() {
        return "As a crusader of the faith, the character has had training that supersedes " +
                "the normal religious strictures of his order. Select one of the following " +
                "types of weapons and add these to the list of weapons permitted to the " +
                "character: (1) axes; (2) bows/crossbows; (3) flails/hammers/maces; " +
                "(4) swords/ daggers; (5) spears/pole arms; (6) bolas/nets/slings/saps/staffs.";
    }
}
