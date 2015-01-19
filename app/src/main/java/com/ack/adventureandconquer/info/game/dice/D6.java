package com.ack.adventureandconquer.info.game.dice;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by saskyrar on 16/01/15.
 */
public class D6 implements IsDice {

    private static Random _random = new SecureRandom();

    @Override
    public int role() {

        final int diceNumber = 6;

        for (int i = 0; i < 10; i++) {
            _random.nextInt(diceNumber);
        }

        return _random.nextInt(diceNumber) + 1;
    }
}
