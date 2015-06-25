package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class RatType implements IsNpcType {

    @Override
    public boolean isLair(int number) {
        return number <= 10;
    }

    protected static IsDice d6 = new D6();
    @Override
    public List<Npc> getNormalWildnessEncounter() {
        if (d6.role()<=4) {
            return Rat.getGroup();
        }else {
            return GiantRat.getGroup();
        }
    }

//    @Override
//    public List<Npc> getNormalWildnessEncounter() {
//        return Template.getGroup();
//    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Group";
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
