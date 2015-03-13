package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Labor extends Proficiency {
    @Override
    public String getName() {
        return LABOR;
    }

    @Override
    public String getDescription() {
        return "The character is highly proficient at a particular type of physical labor, " +
                "such as bricklaying, farming, mining, or stonecutting. The character can make " +
                "his living off his labors, earning 3-12gp per month. With a proficiency throw " +
                "of 11+, the character can interpret information in light of his skill. A " +
                "character may learn other labor proficiencies by taking this proficiency " +
                "multiple times. Labor does not require enough skill to be able to be improved by " +
                "taking this proficiency multiple times.";
    }
}
