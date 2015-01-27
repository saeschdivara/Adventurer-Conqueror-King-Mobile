package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.dice.D10;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.D2;
import com.ack.adventureandconquer.info.game.dice.D3;
import com.ack.adventureandconquer.info.game.dice.D4;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 27/01/15.
 */
abstract public class HumanoidFactory {

    protected static IsDice d2 = new D2();
    protected static IsDice d3 = new D3();
    protected static IsDice d4 = new D4();
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();
    protected static IsDice d10 = new D10();
    protected static IsDice d100 = new D100();
}
