package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D8;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class CrocodileType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }
    protected static IsDice d8 = new D8();

    public List<Npc> getNormalWildnessEncounter() {
        if (d8.role()<=4) {
            return Crocodile.getGroup();
        } if (d8.role()>7) {
            return GiantCrocodile.getGroup();
        }else {
            return LargeCrocodile.getGroup();
        }
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Bask";
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
