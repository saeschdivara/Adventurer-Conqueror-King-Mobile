package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.BlackWidowSpiderType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.CrabSpiderType;
import com.ack.adventureandconquer.info.game.creature.npc.flyer.GiantCarnivFlyType;
import com.ack.adventureandconquer.info.game.creature.npc.flyer.KillerBeeType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.CarcassScavengerType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.DriverAntType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.FireBeetleType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.GiantCentipedeType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.GiantScorpionType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.OilBeetleType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.RhagodessaType;
import com.ack.adventureandconquer.info.game.creature.npc.insect.TigerBeetleType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class InsectType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        switch (number) {
            case 1:
                npc = new FireBeetleType();
                break;
            case 2:
                npc = new OilBeetleType();
                break;
            case 3:
                npc = new TigerBeetleType();
                break;
            case 4:
                npc = new CarcassScavengerType();
                break;
            case 5:
                npc = new GiantCentipedeType();
                break;
            case 6:
                npc = new DriverAntType();
                break;
            case 7:
                npc = new GiantCarnivFlyType();
                break;
            case 8:
                npc = new KillerBeeType();
                break;
            case 9:
                npc = new RhagodessaType();
                break;
            case 10:
                npc = new GiantScorpionType();
                break;
            case 11:
                npc = new BlackWidowSpiderType();
                break;
            case 12:
                npc = new CrabSpiderType();
                break;
        }

        return npc;
    }
}
