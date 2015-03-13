package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 27/01/15.
 */
public class Hydra extends Npc {

    private int headsNumber;

    public Hydra() {
        headsNumber = d8.role() + 4;
        setHitDice(headsNumber);
    }

    @Override
    public String getExtraInformation() {
        return "Heads: " + String.valueOf(headsNumber);
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }
}
