package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Healing extends Proficiency {
    @Override
    public String getName() {
        return HEALING;
    }

    @Override
    public String getDescription() {
        return "The character is especially skilled at treating wounds and diagnosing illnesses " +
                "among humans and demi- humans. A proficiency throw of 11+ enables the character " +
                "to identify whether a disease is magical or mundane, and if mundane, diagnose it. " +
                "A patient under treatment of Healing naturally heals an extra 1d3 hit points " +
                "each day. If the character selects Healing twice, he can neutralize poison, " +
                "cure disease, or cure light wounds with a proficiency throw of 18+, once per " +
                "day per patient. If the character selects Healing three times, he can neutralize " +
                "poison, cure disease, or cure serious wounds with a proficiency throw of 14+, " +
                "once per day per patient. A character with Healing proficiency can use the " +
                "healing herbs listed in the Equipment chapter (e.g. blackwort, comfrey, " +
                "goldenrod, and woundwort) to heal additional damage or gain a bonus on his " +
                "proficiency throws. In any one day, a character can supervise three different " +
                "patients, plus an additional one each time Healing is selected.";
    }
}
