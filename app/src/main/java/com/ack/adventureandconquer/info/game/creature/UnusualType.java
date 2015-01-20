package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.BasiliskType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SkitteringMawType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.BlinkDogType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.CentaurType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.GorgonType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.HellhoundType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.LycanthropeType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.MedusaType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.PhaseTigerType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.RustMonsterType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.TreantType;
import com.ack.adventureandconquer.info.game.creature.npc.unusual.WhiteApeType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class UnusualType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {

        IsNpcType npc = null;

        switch (number) {
            case 1:
                npc = new BasiliskType();
                break;
            case 2:
                npc = new BlinkDogType();
                break;
            case 3:
                npc = new CentaurType();
                break;
            case 4:
                npc = new GorgonType();
                break;
            case 5:
                npc = new HellhoundType();
                break;
            case 6:
                npc = new LycanthropeType();
                break;
            case 7:
                npc = new MedusaType();
                break;
            case 8:
                npc = new PhaseTigerType();
                break;
            case 9:
                npc = new RustMonsterType();
                break;
            case 10:
                npc = new SkitteringMawType();
                break;
            case 11:
                npc = new TreantType();
                break;
            case 12:
                npc = new WhiteApeType();
                break;
        }

        return npc;
    }
}
