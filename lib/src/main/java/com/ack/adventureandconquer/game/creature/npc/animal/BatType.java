package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class BatType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 35;
    }
    protected static IsDice d6 = new D6();

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        int chance = d6.role();
        if (chance<=2) {
            return Bat.getFlock();
        }else if (chance<=4) {
            return BatSwarm.getGroup();
        }else {
            return GiantBat.getFlock();
        }
    }


    @Override
    public String getNormalWildnessEncounterName() {
        return "Flock";
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
