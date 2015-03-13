package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Knowledge extends Proficiency {
    @Override
    public String getName() {
        return KNOWLEDGE;
    }

    @Override
    public String getDescription() {
        return "The character has made a specialized study of a particular field, such as " +
                "architecture, astrology, geography, history, mathematics, metaphysics, natural " +
                "history, natural philosophy, or political economy. The character can usually " +
                "make his living by acting as an expert on the subject. With a proficiency throw " +
                "of 11+, the character can recall expert commentary or information relating to " +
                "his area of knowledge. The character must choose his area of knowledge at the " +
                "time he chooses the proficiency. He can spend more proficiency selections to " +
                "have several different areas of knowledge. If a character selects the same " +
                "knowledge twice, he is an expert in the subject and can train students and " +
                "write books on the topic. If he selects the same subject three times, he could " +
                "work as a sage of the subject (as described in Specialists in Chapter 3).";
    }
}
