package com.ack.adventureandconquer.info.game.dice;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by saskyrar on 27/01/15.
 */
abstract public class AbstractDice implements IsDice {

    private static Random _random = new SecureRandom();

    @Override
    public int role() {

        final int diceNumber = getDiceNumber();
        final int randomRoundCounter = _random.nextInt(4) + 1;

        for (int i = 0; i < randomRoundCounter; i++) {
            _random.nextInt(diceNumber);
        }

        return _random.nextInt(diceNumber) + 1;
    }

    abstract protected int getDiceNumber();
}
