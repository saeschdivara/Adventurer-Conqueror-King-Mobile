package com.ack.adventureandconquer.info.game.creature.npc;

import com.ack.adventureandconquer.info.game.dice.D10;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.D12;
import com.ack.adventureandconquer.info.game.dice.D2;
import com.ack.adventureandconquer.info.game.dice.D20;
import com.ack.adventureandconquer.info.game.dice.D3;
import com.ack.adventureandconquer.info.game.dice.D4;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.D8;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 02/02/15.
 */
abstract public class NpcFactory<NpcClass extends Npc> {

    protected static IsDice d2 = new D2();
    protected static IsDice d3 = new D3();
    protected static IsDice d4 = new D4();
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();
    protected static IsDice d10 = new D10();
    protected static IsDice d12 = new D12();
    protected static IsDice d20 = new D20();
    protected static IsDice d100 = new D100();

    public List<Npc> getMonsterList(int size) {
        List<Npc> monsters = new ArrayList<>();

        for (int index = 0; index < size; index++) {
            NpcClass monster = createMonster();
            monsters.add(monster);
        }

        return monsters;
    }

    abstract protected NpcClass createMonster();
}
