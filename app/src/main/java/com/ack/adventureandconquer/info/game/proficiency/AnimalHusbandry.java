package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 27/02/15.
 */
public class AnimalHusbandry extends Proficiency {
    @Override
    public String getName() {
        return ANIMAL_HUSBANDRY;
    }

    @Override
    public String getDescription() {
        return "The character has the ability to treat wounds and diagnose illnesses in animals. " +
                "A proficiency throw of 11+ enables the character to identify whether a disease " +
                "is magical or mundane, and if mundane, diagnose it. With clean, sanitary " +
                "conditions and bed rest, an animal under treatment of the character automatically " +
                "regains an extra 1d3 hit points per day. If the character selects Animal Husbandry " +
                "twice, he can neutralize poison or cure disease, or cure light wounds with a " +
                "proficiency throw of 18+, attempting once per day per animal. If the character " +
                "selects Animal Husbandry three times, he can neutralize poison, cure disease, " +
                "or cure serious wounds with a proficiency throw of 14+, once per day per animal, " +
                "and can cure mortal wounds with a proficiency throw of 18+, once per day per " +
                "animal. At any one time, a character can treat three animals, plus an additional " +
                "one each time Animal Husbandry is selected.";
    }
}
