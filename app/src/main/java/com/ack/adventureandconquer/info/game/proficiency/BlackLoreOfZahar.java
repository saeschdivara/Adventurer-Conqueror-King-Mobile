package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class BlackLoreOfZahar extends Proficiency {
    @Override
    public String getName() {
        return BLACK_LORE_OF_ZAHAR;
    }

    @Override
    public String getDescription() {
        return "The character has studied the terrible necromancies of ancient Zahar. " +
                "He can control undead as a Chaotic cleric of one half his class level. If the " +
                "character casts spells that require a saving throw versus Death, his targets " +
                "suffer a -2 penalty on the save. When the character casts necromantic spells " +
                "(such as animate dead), the spell effects are calculated as if he were two " +
                "class levels higher than his actual level of experience. He may also conduct " +
                "necromantic research (see Necromancy in Chapter 7) as if he were two class " +
                "levels higher than actual.";
    }
}
