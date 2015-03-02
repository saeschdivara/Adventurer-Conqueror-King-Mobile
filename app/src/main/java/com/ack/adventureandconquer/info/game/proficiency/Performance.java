package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Performance extends Proficiency {
    @Override
    public String getName() {
        return PERFORMANCE;
    }

    @Override
    public String getDescription() {
        return "The character can act, dance, sing, recite poetry, tell stories, or play musical " +
                "instruments in a skilled manner. The character chooses the type of performance " +
                "that his character knows, and the character can take the proficiency several " +
                "times in order to know multiple types of performance. The character is " +
                "considered an apprentice in his style. He can earn 10gp per month from his " +
                "performances, and can identify famous performers, masterpieces, and rare " +
                "instruments with a proficiency throw of 11+. If a character selects the same " +
                "type of performance twice, he is considered a journeyman in his trade. He can " +
                "earn 20gp per month from his performances, and lead a troupe of up to 3 " +
                "apprentices, increasing their productivity by 50%. If he selects the same " +
                "type of performance three times, he is considered a master of his field. " +
                "He can earn 40gp per month from his performances, and lead a troupe of up " +
                "to 2 journeymen and 4 apprentices, increasing their productivity by 50%. Note " +
                "that bards automatically begin play with this ability at the apprentice level " +
                "as part of their class.";
    }
}
