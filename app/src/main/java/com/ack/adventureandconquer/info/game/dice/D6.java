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

        for (int i = 0; i < 10; i++) {
            _random.nextInt(6);
        }

        return _random.nextInt(6) + 1;
    }
}
