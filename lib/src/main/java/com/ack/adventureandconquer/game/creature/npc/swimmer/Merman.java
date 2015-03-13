package com.ack.adventureandconquer.game.creature.npc.swimmer;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/02/15.
 */
public class Merman extends Npc {

    private boolean isLeader = false;

    @Override
    public String getExtraInformation() {
        if (isLeader) {
            return "Leader";
        }

        return "";
    }

    @Override
    public int getDefaultArmorClass() {
        return 1;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    public void setLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }
}
