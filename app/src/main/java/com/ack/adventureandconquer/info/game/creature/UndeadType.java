package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;
import com.ack.adventureandconquer.info.game.creature.npc.undead.GhoulType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.MummyType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.SkeletonType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.SpectreType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.VampireType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.WightType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.WraithType;
import com.ack.adventureandconquer.info.game.creature.npc.undead.ZombieType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class UndeadType implements IsCreatureType {
    @Override
    public IsNpc getNpcType(IsTerrain terrain, int number) {

        IsNpc npc = null;

        switch (number) {
            case 1:
                npc = new GhoulType();
                break;
            case 2:
                npc = new GhoulType();
                break;
            case 3:
                npc = new MummyType();
                break;
            case 4:
                npc = new MummyType();
                break;
            case 5:
                npc = new SkeletonType();
                break;
            case 6:
                npc = new SkeletonType();
                break;
            case 7:
                npc = new SpectreType();
                break;
            case 8:
                npc = new WightType();
                break;
            case 9:
                npc = new WraithType();
                break;
            case 10:
                npc = new VampireType();
                break;
            case 11:
                npc = new ZombieType();
                break;
            case 12:
                npc = new ZombieType();
                break;
        }

        return npc;
    }
}
