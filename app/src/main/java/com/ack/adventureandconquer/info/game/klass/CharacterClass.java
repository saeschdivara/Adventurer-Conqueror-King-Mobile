package com.ack.adventureandconquer.info.game.klass;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/03/15.
 */
public abstract class CharacterClass extends Npc implements IsClass {
    private long experience;
    private int level;

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
