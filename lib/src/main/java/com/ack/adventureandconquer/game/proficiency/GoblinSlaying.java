package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class GoblinSlaying extends Proficiency {
    @Override
    public String getName() {
        return GOBLIN_SLAYING;
    }

    @Override
    public String getDescription() {
        return "The character has been trained to ruthlessly cut down his race’s humanoid foes. " +
                "He receives +1 on attack throws against kobolds, goblins, orcs, gnolls, " +
                "hobgoblins, bugbears, ogres, trolls, and giants. At level 7, this bonus " +
                "increases to +2, and at level 13 it increases to +3.";
    }
}
