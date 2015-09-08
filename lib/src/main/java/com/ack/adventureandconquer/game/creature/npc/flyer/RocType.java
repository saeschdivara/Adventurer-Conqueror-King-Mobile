package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class RocType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }
    protected static IsDice d6 = new D6();

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        int chance = d6.role();
        if (chance<=3) {
            return SmallRoc.getGroup();
        }else if (chance<=5) {
            return LargeRoc.getGroup();
        }else {
            return GiantRoc.getGroup();
        }
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Flight";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return null;
    }

    @Override
    public String getLairWildnessEncounterName() {
        return null;
    }
}
