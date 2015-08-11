package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.unusual.Template;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class AncientDragonType implements IsNpcType {

    public AncientDragonType(String type, String breathAttack) {
        AncientDragon.setDragonType(type,breathAttack);
    }

    @Override
    public boolean isLair(int number) {
        return number <= 70;
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
        return AncientDragon.getGroup();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Blister";
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
