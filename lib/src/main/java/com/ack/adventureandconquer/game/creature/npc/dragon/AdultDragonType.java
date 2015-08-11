package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.unusual.Template;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class AdultDragonType implements IsNpcType {


    public AdultDragonType(String type,String breathAttack) {
        AdultDragon.setDragonType(type,breathAttack);
    }



    @Override
    public boolean isLair(int number) {
        return number <= 40;
    }

    protected static IsDice d6 = new D6();
//    @Override
//    public List<Npc> getNormalWildnessEncounter() {
//        if (d6.role()<=4) {
//            return Template.getGroup();
//        }else {
//            return GiantTemplate.getGroup();
//        }
//    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return AdultDragon.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Blister ";
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
