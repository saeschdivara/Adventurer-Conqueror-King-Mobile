package com.ack.adventureandconquer.info.game.creature.npc.men;

import com.ack.adventureandconquer.info.game.creature.IsHuman;
import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 13/02/15.
 */
public class Berserker extends Npc implements IsHuman {

    private int level;

    @Override
    public String getExtraInformation() {
        return "";
    }

    @Override
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getDefaultArmorClass() {
        return 2;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }
}
