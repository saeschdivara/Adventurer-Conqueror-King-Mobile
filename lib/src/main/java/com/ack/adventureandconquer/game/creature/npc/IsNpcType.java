package com.ack.adventureandconquer.game.creature.npc;

import java.util.List;

/**
 * Created by saskyrar on 15/01/15.
 */
public interface IsNpcType {
    /**
     *
     * @param number
     * @return
     */
    public boolean isLair(int number);

    public List<Npc> getNormalWildnessEncounter();
    public String getNormalWildnessEncounterName();

    public List<Npc> getLairWildnessEncounter();
    public String getLairWildnessEncounterName();
}
