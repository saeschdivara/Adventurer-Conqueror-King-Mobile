package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class MagicalEngineering extends Proficiency {
    @Override
    public String getName() {
        return MAGICAL_ENGINEERING;
    }

    @Override
    public String getDescription() {
        return "The character has specialized knowledge of magical items. He gains a +1 to " +
                "magical research throws. He can recognize most common magical items after " +
                "careful investigation with a proficiency throw of 11+, but is unable to recognize " +
                "uncommon or unique magical items, to divine command words, to distinguish trapped " +
                "or cursed items from safe ones, or to assess the specific bonus or number of " +
                "charges remaining in an item. This proficiency can be selected multiple times, " +
                "each time adding an additional +1 bonus to magical research throws and " +
                "reducing the proficiency throw required to recognize common items by 4.";
    }
}
