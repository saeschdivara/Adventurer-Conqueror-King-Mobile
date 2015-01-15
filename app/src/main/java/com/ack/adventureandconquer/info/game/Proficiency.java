package com.ack.adventureandconquer.info.game;

import java.util.ArrayList;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Proficiency {
    static final String ADVENTURING = "adventuring";
    static final String ALCHEMY = "alchemy";
    static final String ANIMAL_HUSBANDRY = "animal husbandry";
    static final String ANIMAL_TRAINING = "animal training";
    static final String BARGAINING = "bargaining";
    static final String CAVING = "caving";
    static final String COLLEGIATE_WIZARDRY = "collegiate wizardry";
    static final String CRAFT = "craft";
    static final String DIPLOMACY = "diplomacy";
    static final String DISGUISE = "disguise";
    static final String ENDURANCE = "endurance";
    static final String ENGINEERING = "engineering";
    static final String GAMBLING = "gambling";
    static final String HEALING = "healing";
    static final String INTIMIDATION = "intimidation";
    static final String KNOWLEDGE = "knowledge";
    static final String LABOR = "labor";
    static final String LANGUAGE = "language";
    static final String LEADERSHIP = "leadership";
    static final String LIP_READING = "lip reading";
    static final String MANUAL_OF_ARMS = "manual of arms";
    static final String MAPPING = "mapping";
    static final String MILITARY_STRATEGY = "military strategy";
    static final String MIMICRY = "mimicry";
    static final String NATURALISM = "naturalism";
    static final String NAVIGATION = "navigation";
    static final String PERFORMANCE = "performance";
    static final String PROFESSION = "profession";
    static final String RIDING = "riding";
    static final String SEAFARING = "seafaring";
    static final String SEDUCTION = "seduction";
    static final String SIEGE_ENGINEERING = "siege engineering";
    static final String SIGNALING = "signaling";
    static final String SURVIVAL = "survival";
    static final String THEOLOGY = "theology";
    static final String TRACKING = "tracking";
    static final String TRAPPING = "trapping";

    static final ArrayList<String> GENERAL;

    static {
        // ALL GENERAL PROFICIENCIES
        GENERAL = new ArrayList<>();
        GENERAL.add(ADVENTURING);
        GENERAL.add(ALCHEMY);
        GENERAL.add(ANIMAL_HUSBANDRY);
        GENERAL.add(ANIMAL_TRAINING);
    }
}
