package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Craft extends Proficiency {
    @Override
    public String getName() {
        return CRAFT;
    }

    @Override
    public String getDescription() {
        return "The character has studied under a guild craftsman, such as an armorer, bowyer, " +
                "jeweler, leatherworker, smith, shipwright, or weaponsmith. The character is " +
                "considered an apprentice in his trade. He can manufacture 10gp per month of " +
                "goods, and can identify masterwork items, rare materials, and famous artisans " +
                "with a proficiency throw of 11+. The character must choose the craft at the " +
                "time he chooses the proficiency. He can spend more proficiency selections to " +
                "have several types of craft proficiencies. If a character selects the same " +
                "craft twice, he is considered a journeyman in his trade. He can manufacture " +
                "20gp per month of goods, and supervise up to 3 apprentices, increasing their " +
                "productivity by 50%. If he selects the same craft three times, he is considered " +
                "a master craftsman. He can manufacture 40gp per month, and supervise up to " +
                "2 journeymen and 4 apprentices, increasing their productivity by 50%. He could " +
                "work as a specialist in this craft (as described in the Hiring Specialists section). " +
                "Note that dwarven craftpriests automatically begin play with this proficiency at " +
                "the “journeyman” rank as part of their class.";
    }
}
