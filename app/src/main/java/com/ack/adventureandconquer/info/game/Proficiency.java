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

    static final String ACROBATICS = "acrobatics";
    static final String ALERTNESS = "alertness";
    static final String ARCANE_DABBLING = "arcane dabbling";
    static final String BLIND_FIGHTING = "blind fighting";
    static final String BRIBERY = "bribery";
    static final String CAT_BURGLARY = "cat burglary";
    static final String CLIMBING = "climbing";
    static final String COMBAT_REFLEXES = "combat reflexes";
    static final String COMBAT_TRICKERY = "combat trickery";
    static final String CONTORTIONISM = "contortionism";
    static final String EAVES_DROPPING = "eavesdropping";
    static final String FIGHTING_STYLE = "fighting style";
    static final String PRECISE_SHOOTING = "precise shooting";
    static final String RUNNING = "running";
    static final String SKIRMISHING = "skirmishing";
    static final String SKULKING = "skulking";
    static final String SNIPING = "sniping";
    static final String SWASHBUCKLING = "swashbuckling";
    static final String TRAP_FINDING = "trap finding";
    static final String WEAPON_FINESSE = "weapon finesse";
    static final String WEAPON_FOCUS = "weapon focus";

    static final ArrayList<String> GENERAL;
    static final ArrayList<String> ASSASSIN;

    static {
        // ALL GENERAL PROFICIENCIES
        GENERAL = new ArrayList<>();
        GENERAL.add(ADVENTURING);
        GENERAL.add(ALCHEMY);
        GENERAL.add(ANIMAL_HUSBANDRY);
        GENERAL.add(ANIMAL_TRAINING);
        GENERAL.add(BARGAINING);
        GENERAL.add(CAVING);
        GENERAL.add(COLLEGIATE_WIZARDRY);
        GENERAL.add(CRAFT);
        GENERAL.add(DIPLOMACY);
        GENERAL.add(DISGUISE);
        GENERAL.add(ENDURANCE);
        GENERAL.add(ENGINEERING);
        GENERAL.add(GAMBLING);
        GENERAL.add(HEALING);
        GENERAL.add(INTIMIDATION);
        GENERAL.add(KNOWLEDGE);
        GENERAL.add(LABOR);
        GENERAL.add(LANGUAGE);
        GENERAL.add(LEADERSHIP);
        GENERAL.add(LIP_READING);
        GENERAL.add(MANUAL_OF_ARMS);
        GENERAL.add(MAPPING);
        GENERAL.add(MILITARY_STRATEGY);
        GENERAL.add(MIMICRY);
        GENERAL.add(NATURALISM);
        GENERAL.add(NAVIGATION);
        GENERAL.add(PERFORMANCE);
        GENERAL.add(PROFESSION);
        GENERAL.add(RIDING);
        GENERAL.add(SEAFARING);
        GENERAL.add(SEDUCTION);
        GENERAL.add(SIEGE_ENGINEERING);
        GENERAL.add(SIGNALING);
        GENERAL.add(SURVIVAL);
        GENERAL.add(THEOLOGY);
        GENERAL.add(TRACKING);
        GENERAL.add(TRAPPING);

        // ALL ASSASSIN PROFICIENCIES
        ASSASSIN = new ArrayList<>();
        ASSASSIN.add(ACROBATICS);
        ASSASSIN.add(ALCHEMY);
        ASSASSIN.add(ALERTNESS);
        ASSASSIN.add(ARCANE_DABBLING);
        ASSASSIN.add(BLIND_FIGHTING);
        ASSASSIN.add(BRIBERY);
        ASSASSIN.add(CAT_BURGLARY);
        ASSASSIN.add(CLIMBING);
        ASSASSIN.add(COMBAT_REFLEXES);
        ASSASSIN.add(COMBAT_TRICKERY);
        ASSASSIN.add(CONTORTIONISM);
        ASSASSIN.add(DISGUISE);
        ASSASSIN.add(EAVES_DROPPING);
        ASSASSIN.add(FIGHTING_STYLE);
        ASSASSIN.add(GAMBLING);
        ASSASSIN.add(INTIMIDATION);
        ASSASSIN.add(MIMICRY);
        ASSASSIN.add(PRECISE_SHOOTING);
        ASSASSIN.add(RUNNING);
        ASSASSIN.add(SEDUCTION);
        ASSASSIN.add(SKIRMISHING);
        ASSASSIN.add(SKULKING);
        ASSASSIN.add(SNIPING);
        ASSASSIN.add(SWASHBUCKLING);
        ASSASSIN.add(TRAP_FINDING);
        ASSASSIN.add(WEAPON_FINESSE);
        ASSASSIN.add(WEAPON_FOCUS);
    }
}
