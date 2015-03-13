package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Acrobatics extends Proficiency {

    @Override
    public String getName() {
        return ACROBATICS;
    }

    @Override
    public String getDescription() {
        return "The character is trained to jump, tumble, somersault, and free-run around obstacles. " +
                "The character gains +2 to saving throws where agility would help avoid the situation, " +
                "such as tilting floors and pit traps. In lieu of moving during a round, the " +
                "character may attempt a proficiency throw of 20+ to tumble behind an opponent in " +
                "melee. The proficiency throw required for the tumble is reduced by 1 per level " +
                "of experience the character possesses. If successful, the character is behind his " +
                "opponent. The opponent can now be attacked with a +2 bonus to the attack throw, " +
                "and gains no benefit from his shield. Thieves and others eligible to backstab " +
                "an opponent gain their usual +4 on the attack throw and bonus to damage. " +
                "Characters with an encumbrance of 6 stone or more may not tumble. Note " +
                "that elven nightblades automatically begin play with this ability as part of " +
                "their class.";
    }
}
