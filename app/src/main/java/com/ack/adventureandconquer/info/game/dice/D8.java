package com.ack.adventureandconquer.info.game.dice;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by saskyrar on 16/01/15.
 */
public class D8 implements IsDice {

    private static Random _random = new SecureRandom();

    @Override
    public int role() {

        return _random.nextInt(8) + 1;
    }
}
