package com.ack.adventureandconquer.game.dice;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by saskyrar on 11/02/15.
 */
public class RangeDice implements IsDice {

    private static Random _random = new SecureRandom();
    private int start;
    private int end;

    public RangeDice(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int role() {
        final int diceNumber = start;
        final int randomRoundCounter = _random.nextInt(2) + 1;

        for (int i = 0; i < randomRoundCounter; i++) {
            _random.nextInt(diceNumber);
        }

        return _random.nextInt(diceNumber) + 1 + end;
    }
}
