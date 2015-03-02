package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Profession extends Proficiency {
    @Override
    public String getName() {
        return PROFESSION;
    }

    @Override
    public String getDescription() {
        return "The character is highly skilled at a civil profession, such as actuary, banker, " +
                "chamberlain, judge, lawyer, librarian, merchant, restaurateur, scribe, or " +
                "seneschal. The character is considered an apprentice in his profession. " +
                "He can earn 25gp per month for his services, and can make expert commentary " +
                "on subjects pertaining to his profession with a proficiency throw of 11+. " +
                "The character must choose the profession at the time he chooses the proficiency. " +
                "He can spend more proficiency selections to have several types of profession " +
                "proficiencies. If a character selects the same profession twice, he is " +
                "considered a licensed practitioner of his profession. He can earn 50gp per " +
                "month for his services, and supervise up to 3 apprentices, increasing their " +
                "productivity by 50%. If he selects the same profession three times, he is " +
                "considered a master of his profession. He can earn 100gp per month, and " +
                "supervise up to 2 practitioners and 4 apprentices, increasing their " +
                "productivity by 50%.";
    }
}
