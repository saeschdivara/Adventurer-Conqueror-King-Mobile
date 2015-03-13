package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Gambling extends Proficiency {
    @Override
    public String getName() {
        return GAMBLING;
    }

    @Override
    public String getDescription() {
        return "The character has the ability to win money in games of skill (competitive card games) " +
                "and betting. He can earn 1d6gp per month as a professional gambler. The character " +
                "can select Gambling additional times if desired, increasing his monthly income " +
                "by 1d6gp with each selection. If multiple characters with Gambling proficiency " +
                "face each other in a game of skill and betting, they should each roll the " +
                "appropriate number of d6s as if measuring their monthly gambling income. " +
                "Whichever gambler rolls the higher total has won the first round (hand, trick, etc.) " +
                "Losers must either exit the game or increase their bet by rolling the dice again " +
                "and adding it to the total. This continues until no gambler is willing to " +
                "increase the bet, at which time the gambler with the highest cumulative total " +
                "wins the game. The losers must each pay the winner the total amount of their " +
                "rolls. If all gamblers agree, the game can be for higher stakes. This can be " +
                "as simple as multiplying the total rolled by 5, 10, or even 1,000+, or as " +
                "complex as requiring the loser to turn over domains and castles.";
    }
}
