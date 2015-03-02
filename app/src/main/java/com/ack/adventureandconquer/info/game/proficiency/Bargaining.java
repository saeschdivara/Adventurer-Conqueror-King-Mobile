package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Bargaining extends Proficiency {
    @Override
    public String getName() {
        return BARGAINING;
    }

    @Override
    public String getDescription() {
        return "The character gets the best deals available for goods, services, and information. " +
                "Any items the character purchases costs 10% less than the listed price and any " +
                "items he sells go for 10% more than the listed price. If both the buyer and " +
                "seller have the Bargaining proficiency, the opposed Bargainers should make " +
                "reaction rolls. Whichever character scores the higher result gets the discount. " +
                "A character may select Bargaining multiple times if desired. Each time the " +
                "proficiency is selected, the character receives a +2 bonus on his reaction " +
                "roll when negotiating with other bargainers.";
    }
}
