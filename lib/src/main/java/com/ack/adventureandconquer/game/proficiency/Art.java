package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class Art extends Proficiency {
    @Override
    public String getName() {
        return ART;
    }

    @Override
    public String getDescription() {
        return "The character can create a particular type of art " +
                "(e.g., painting, sculpture, mosaic). The character must choose the type of art " +
                "at the time he chooses the proficiency. He can spend more proficiency selections " +
                "to have several types of art proficiencies. The character is considered an " +
                "apprentice in his field. He can create 10gp per month of artwork, and can " +
                "identify masterwork items, rare materials, and famous artisans with a " +
                "proficiency throw of 11+. If a character selects the same field of art " +
                "twice, he is considered a journeyman in his trade. He can create 20gp per " +
                "month of artwork, and supervise up to 3 apprentices, increasing their " +
                "productivity by 50%. If he selects the same craft three times, he is " +
                "considered a master of his field. He can create 40gp per month of artwork, " +
                "and supervise up to 2 journeymen and 4 apprentices, increasing their " +
                "productivity by 50%. He could work as a specialist in this field of art " +
                "(as described in the Hiring Specialists section).";
    }
}
