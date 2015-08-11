package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.unusual.Template;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class OldDragonType implements IsNpcType {

    public OldDragonType(String type,String breathAttack) {
        OldDragon.setDragonType(type,breathAttack);
    }

    @Override
    public boolean isLair(int number) {
        return number <= 20;
    }

//    protected static IsDice d6 = new D6();
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
        return OldDragon.getGroup();
    }

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
