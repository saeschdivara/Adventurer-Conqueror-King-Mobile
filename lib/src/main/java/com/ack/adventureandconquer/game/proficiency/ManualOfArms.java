package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class ManualOfArms extends Proficiency {
    @Override
    public String getName() {
        return MANUAL_OF_ARMS;
    }

    @Override
    public String getDescription() {
        return "The character has the ability to train soldiers in military discipline, physical " +
                "fitness, and weapon drill. If the character selects Manual of Arms once, he can " +
                "earn 25gp per month training light infantry. It takes 1 month to turn raw " +
                "recruits into light infantry. If the character also selects Riding, he can " +
                "also train light cavalry (taking 3 months). If he also selects Weapon Focus " +
                "(bows & crossbows), he can train crossbowmen (1 month), bowmen (2 months), or " +
                "longbowmen (3 months). Manual of Arms combined with Riding and Weapon Focus " +
                "(bows & crossbows) allows the character to train horse archers (6 months). " +
                "If the character selects Manual of Arms twice, he earns 50gp per month and " +
                "can train heavy infantry (1 month). Two ranks of Manual of Arms combined with " +
                "Riding allow the character to train heavy cavalry (6 months). Two ranks of " +
                "Manual of Arms combined with Riding and Weapon Focus (bows & crossbows) allows " +
                "the character to train cataphract cavalry (12 months). The character can train " +
                "up to 50 soldiers during each training period.";
    }
}
