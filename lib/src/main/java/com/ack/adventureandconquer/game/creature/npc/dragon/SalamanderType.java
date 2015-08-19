package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.adventure.IsTerrain;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.List;

/**
 * Created by saskyrar on 18/01/15.
 */
public class SalamanderType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 25;
    }
    protected static IsDice d6 = new D6();

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        if (d6.role() > 3 ){
            return FlameSalamander.getGroup();
        }else{
            return FrostSalamander.getGroup();
        }
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return null;
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
