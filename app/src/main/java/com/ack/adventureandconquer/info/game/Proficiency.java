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
    static final String COMBAT_TRICKERY_DISARM = "combat trickery (disarm)";
    static final String COMBAT_TRICKERY_INCAPACITATE = "combat trickery (incapacitate)";
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

    static final String ART = "art";
    static final String BEAST_FRIENDSHIP = "beast friendship";
    static final String COMMAND = "command";
    static final String ELVEN_BLOODLINE = "elven bloodline";
    static final String MAGICAL_ENGINEERING = "magical engineering";
    static final String MAGICAL_MUSIC = "magical music";
    static final String MYSTIC_AURA = "mystic aura";
    static final String PRESTIDIGITATION = "";

    static final String APOSTASY = "apostasy";
    static final String BATTLE_MAGIC = "battle magic";
    static final String COMBAT_TRICKERY_TRIP = "combat trickery (trip)";
    static final String CONTEMPLATION = "contemplation";
    static final String DIVINE_BLESSING = "divine blessing";
    static final String DIVINE_HEALTH = "divine health";
    static final String LAYING_ON_HANDS = "laying on hands";
    static final String MARTIAL_TRAINING = "martial training";
    static final String PROPHECY = "prophecy";
    static final String QUIET_MAGIC = "quiet magic";
    static final String RIGHTEOUS_TURNING = "righteous turning";
    static final String UNFLAPPABLE_CASTING = "unflappable casting";

    static final String COMBAT_TRICKERY_FORCE_BACK = "combat trickery (force back)";
    static final String COMBAT_TRICKERY_OVERRUN = "combat trickery (overrun)";
    static final String COMBAT_TRICKERY_SUNDER = "combat trickery (sunder)";
    static final String KNOWLEDGE_HISTORY = "knowledge (history)";
    static final String LOREMASTERY = "loremastery";
    static final String PROFESSION_JUDGE = "profession (judge)";
    static final String SENSING_EVIL = "sensing evil";
    static final String SENSING_POWER = "sensing power";

    static final String DWARVEN_BREWING = "dwarven brewing";
    static final String GOBLIN_SLAYING = "goblin-slaying";
    static final String ILLUSION_RESISTANCE = "illusion resistance";
    static final String PERFORMANCE_CHANTING = "performance (chanting)";

    static final String BERSERKERGANG = "berserkergang";
    static final String COMBAT_TRICKERY_KNOCK_DOWN = "combat trickery (knock down)";
    static final String COMBAT_TRICKERY_WRESTLE = "combat trickery (wrestle)";
    static final String DUNGEON_BASHING = "dungeon bashing";
    static final String LAND_SURVEYING = "land surveying";
    static final String MOUNTAINEERING = "mountaineering";

    static final String BLACK_LORE_OF_ZAHAR = "black lore of zahar";
    static final String ELEMENTALISM = "elementalism";
    static final String FAMILIAR = "familiar";
    static final String PASSING_WITHOUT_TRACE = "passing without trace";
    static final String WAKEFULNESS = "wakefulness";
    static final String SOOTHSAYING = "soothsaying";

    static final String AMBUSHING = "ambushing";

    static final String TRANSMOGRIFICATION = "transmogrification";

    static final String LOCKPICKING = "lockpicking";
//    static final String  = "";
//    static final String  = "";
//    static final String  = "";
//    static final String  = "";
//    static final String  = "";

    static final ArrayList<String> GENERAL;
    static final ArrayList<String> ASSASSIN;
    static final ArrayList<String> BARD;
    static final ArrayList<String> BLADEDANCER;
    static final ArrayList<String> CLERIC;
    static final ArrayList<String> DWARVEN_CRAFTPRIEST;
    static final ArrayList<String> DWARVEN_VAULTGUARD;
    static final ArrayList<String> ELVEN_NIGHTBLADE;
    static final ArrayList<String> ELVEN_SPELLSWORD;
    static final ArrayList<String> EXPLORER;
    static final ArrayList<String> FIGHTER;
    static final ArrayList<String> MAGE;
    static final ArrayList<String> THIEF;

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
        ASSASSIN.add(COMBAT_TRICKERY_DISARM);
        ASSASSIN.add(COMBAT_TRICKERY_INCAPACITATE);
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

        // ALL BARD PROFICIENCIES
        BARD = new ArrayList<>();
        BARD.add(ACROBATICS);
        BARD.add(ART);
        BARD.add(BARGAINING);
        BARD.add(BEAST_FRIENDSHIP);
        BARD.add(COMBAT_TRICKERY_DISARM);
        BARD.add(COMMAND);
        BARD.add(DIPLOMACY);
        BARD.add(EAVES_DROPPING);
        BARD.add(ELVEN_BLOODLINE);
        BARD.add(FIGHTING_STYLE);
        BARD.add(HEALING);
        BARD.add(KNOWLEDGE);
        BARD.add(LANGUAGE);
        BARD.add(LEADERSHIP);
        BARD.add(LIP_READING);
        BARD.add(MAGICAL_ENGINEERING);
        BARD.add(MAGICAL_MUSIC);
        BARD.add(MIMICRY);
        BARD.add(MYSTIC_AURA);
        BARD.add(PERFORMANCE);
        BARD.add(PRECISE_SHOOTING);
        BARD.add(PRESTIDIGITATION);
        BARD.add(RUNNING);
        BARD.add(SEDUCTION);
        BARD.add(SKIRMISHING);
        BARD.add(SWASHBUCKLING);
        BARD.add(WEAPON_FINESSE);
        BARD.add(WEAPON_FOCUS);

        // ALL BLADEDANCER PROFICIENCIES
        BLADEDANCER = new ArrayList<>();
        BLADEDANCER.add(ACROBATICS);
        BLADEDANCER.add(APOSTASY);
        BLADEDANCER.add(BATTLE_MAGIC);
        BLADEDANCER.add(BEAST_FRIENDSHIP);
        BLADEDANCER.add(COMBAT_REFLEXES);
        BLADEDANCER.add(COMBAT_TRICKERY_DISARM);
        BLADEDANCER.add(COMBAT_TRICKERY_TRIP);
        BLADEDANCER.add(CONTEMPLATION);
        BLADEDANCER.add(DIPLOMACY);
        BLADEDANCER.add(DIVINE_BLESSING);
        BLADEDANCER.add(DIVINE_HEALTH);
        BLADEDANCER.add(FIGHTING_STYLE);
        BLADEDANCER.add(LAYING_ON_HANDS);
        BLADEDANCER.add(MAGICAL_MUSIC);
        BLADEDANCER.add(MARTIAL_TRAINING);
        BLADEDANCER.add(PERFORMANCE);
        BLADEDANCER.add(PRESTIDIGITATION);
        BLADEDANCER.add(PROPHECY);
        BLADEDANCER.add(QUIET_MAGIC);
        BLADEDANCER.add(RIGHTEOUS_TURNING);
        BLADEDANCER.add(RUNNING);
        BLADEDANCER.add(SEDUCTION);
        BLADEDANCER.add(SKIRMISHING);
        BLADEDANCER.add(SWASHBUCKLING);
        BLADEDANCER.add(THEOLOGY);
        BLADEDANCER.add(UNFLAPPABLE_CASTING);
        BLADEDANCER.add(WEAPON_FINESSE);
        BLADEDANCER.add(WEAPON_FOCUS);

        // ALL CLERIC PROFICIENCIES
        CLERIC = new ArrayList<>();
        BLADEDANCER.add(APOSTASY);
        BLADEDANCER.add(BATTLE_MAGIC);
        BLADEDANCER.add(BEAST_FRIENDSHIP);
        BLADEDANCER.add(COMBAT_TRICKERY_FORCE_BACK);
        BLADEDANCER.add(COMBAT_TRICKERY_OVERRUN);
        BLADEDANCER.add(COMBAT_TRICKERY_SUNDER);
        BLADEDANCER.add(COMMAND);
        BLADEDANCER.add(CONTEMPLATION);
        BLADEDANCER.add(DIPLOMACY);
        BLADEDANCER.add(DIVINE_BLESSING);
        BLADEDANCER.add(DIVINE_HEALTH);
        BLADEDANCER.add(FIGHTING_STYLE);
        BLADEDANCER.add(HEALING);
        BLADEDANCER.add(KNOWLEDGE_HISTORY);
        BLADEDANCER.add(LAYING_ON_HANDS);
        BLADEDANCER.add(LEADERSHIP);
        BLADEDANCER.add(LOREMASTERY);
        BLADEDANCER.add(MAGICAL_ENGINEERING);
        BLADEDANCER.add(MARTIAL_TRAINING);
        BLADEDANCER.add(PRESTIDIGITATION);
        BLADEDANCER.add(PROFESSION_JUDGE);
        BLADEDANCER.add(PROPHECY);
        BLADEDANCER.add(QUIET_MAGIC);
        BLADEDANCER.add(RIGHTEOUS_TURNING);
        BLADEDANCER.add(SENSING_EVIL);
        BLADEDANCER.add(SENSING_POWER);
        BLADEDANCER.add(THEOLOGY);
        BLADEDANCER.add(UNFLAPPABLE_CASTING);
        BLADEDANCER.add(WEAPON_FOCUS);

        // ALL DWARVEN CRAFTPRIEST PROFICIENCIES
        DWARVEN_CRAFTPRIEST = new ArrayList<>();
        DWARVEN_CRAFTPRIEST.add(ALCHEMY);
        DWARVEN_CRAFTPRIEST.add(ART);
        DWARVEN_CRAFTPRIEST.add(BATTLE_MAGIC);
        DWARVEN_CRAFTPRIEST.add(CAVING);
        DWARVEN_CRAFTPRIEST.add(COLLEGIATE_WIZARDRY);
        DWARVEN_CRAFTPRIEST.add(CONTEMPLATION);
        DWARVEN_CRAFTPRIEST.add(CRAFT);
        DWARVEN_CRAFTPRIEST.add(DIPLOMACY);
        DWARVEN_CRAFTPRIEST.add(DIVINE_BLESSING);
        DWARVEN_CRAFTPRIEST.add(DIVINE_HEALTH);
        DWARVEN_CRAFTPRIEST.add(DWARVEN_BREWING);
        DWARVEN_CRAFTPRIEST.add(ENDURANCE);
        DWARVEN_CRAFTPRIEST.add(ENGINEERING);
        DWARVEN_CRAFTPRIEST.add(FIGHTING_STYLE);
        DWARVEN_CRAFTPRIEST.add(GOBLIN_SLAYING);
        DWARVEN_CRAFTPRIEST.add(HEALING);
        DWARVEN_CRAFTPRIEST.add(ILLUSION_RESISTANCE);
        DWARVEN_CRAFTPRIEST.add(KNOWLEDGE);
        DWARVEN_CRAFTPRIEST.add(LAYING_ON_HANDS);
        DWARVEN_CRAFTPRIEST.add(LOREMASTERY);
        DWARVEN_CRAFTPRIEST.add(MAGICAL_ENGINEERING);
        DWARVEN_CRAFTPRIEST.add(MAPPING);
        DWARVEN_CRAFTPRIEST.add(PERFORMANCE_CHANTING);
        DWARVEN_CRAFTPRIEST.add(PRESTIDIGITATION);
        DWARVEN_CRAFTPRIEST.add(PROFESSION_JUDGE);
        DWARVEN_CRAFTPRIEST.add(PROPHECY);
        DWARVEN_CRAFTPRIEST.add(QUIET_MAGIC);
        DWARVEN_CRAFTPRIEST.add(RIGHTEOUS_TURNING);
        DWARVEN_CRAFTPRIEST.add(SENSING_EVIL);
        DWARVEN_CRAFTPRIEST.add(SIEGE_ENGINEERING);
        DWARVEN_CRAFTPRIEST.add(THEOLOGY);
        DWARVEN_CRAFTPRIEST.add(UNFLAPPABLE_CASTING);
        DWARVEN_CRAFTPRIEST.add(WEAPON_FOCUS);

        // ALL DWARVEN VAULTGUARD PROFICIENCIES
        DWARVEN_VAULTGUARD = new ArrayList<>();
        DWARVEN_VAULTGUARD.add(ALERTNESS);
        DWARVEN_VAULTGUARD.add(BERSERKERGANG);
        DWARVEN_VAULTGUARD.add(BLIND_FIGHTING);
        DWARVEN_VAULTGUARD.add(CAVING);
        DWARVEN_VAULTGUARD.add(COMBAT_REFLEXES);
        DWARVEN_VAULTGUARD.add(COMBAT_TRICKERY_FORCE_BACK);
        DWARVEN_VAULTGUARD.add(COMBAT_TRICKERY_KNOCK_DOWN);
        DWARVEN_VAULTGUARD.add(COMBAT_TRICKERY_OVERRUN);
        DWARVEN_VAULTGUARD.add(COMBAT_TRICKERY_SUNDER);
        DWARVEN_VAULTGUARD.add(COMBAT_TRICKERY_WRESTLE);
        DWARVEN_VAULTGUARD.add(COMMAND);
        DWARVEN_VAULTGUARD.add(CRAFT);
        DWARVEN_VAULTGUARD.add(DUNGEON_BASHING);
        DWARVEN_VAULTGUARD.add(DWARVEN_BREWING);
        DWARVEN_VAULTGUARD.add(ENDURANCE);
        DWARVEN_VAULTGUARD.add(ENGINEERING);
        DWARVEN_VAULTGUARD.add(FIGHTING_STYLE);
        DWARVEN_VAULTGUARD.add(GAMBLING);
        DWARVEN_VAULTGUARD.add(GOBLIN_SLAYING);
        DWARVEN_VAULTGUARD.add(ILLUSION_RESISTANCE);
        DWARVEN_VAULTGUARD.add(INTIMIDATION);
        DWARVEN_VAULTGUARD.add(LAND_SURVEYING);
        DWARVEN_VAULTGUARD.add(LEADERSHIP);
        DWARVEN_VAULTGUARD.add(MAPPING);
        DWARVEN_VAULTGUARD.add(MANUAL_OF_ARMS);
        DWARVEN_VAULTGUARD.add(MILITARY_STRATEGY);
        DWARVEN_VAULTGUARD.add(MOUNTAINEERING);
        DWARVEN_VAULTGUARD.add(SIEGE_ENGINEERING);
        DWARVEN_VAULTGUARD.add(WEAPON_FOCUS);

        // ALL ELVEN NIGHTBLADE PROFICIENCIES
        ELVEN_NIGHTBLADE = new ArrayList<>();
        ELVEN_NIGHTBLADE.add(ALCHEMY);
        ELVEN_NIGHTBLADE.add(ALERTNESS);
        ELVEN_NIGHTBLADE.add(ARCANE_DABBLING);
        ELVEN_NIGHTBLADE.add(BATTLE_MAGIC);
        ELVEN_NIGHTBLADE.add(BEAST_FRIENDSHIP);
        ELVEN_NIGHTBLADE.add(BLACK_LORE_OF_ZAHAR);
        ELVEN_NIGHTBLADE.add(BLIND_FIGHTING);
        ELVEN_NIGHTBLADE.add(COMBAT_REFLEXES);
        ELVEN_NIGHTBLADE.add(COMBAT_TRICKERY_INCAPACITATE);
        ELVEN_NIGHTBLADE.add(CONTORTIONISM);
        ELVEN_NIGHTBLADE.add(ELEMENTALISM);
        ELVEN_NIGHTBLADE.add(FAMILIAR);
        ELVEN_NIGHTBLADE.add(FIGHTING_STYLE);
        ELVEN_NIGHTBLADE.add(INTIMIDATION);
        ELVEN_NIGHTBLADE.add(MAGICAL_ENGINEERING);
        ELVEN_NIGHTBLADE.add(MYSTIC_AURA);
        ELVEN_NIGHTBLADE.add(PASSING_WITHOUT_TRACE);
        ELVEN_NIGHTBLADE.add(PRECISE_SHOOTING);
        ELVEN_NIGHTBLADE.add(PRESTIDIGITATION);
        ELVEN_NIGHTBLADE.add(QUIET_MAGIC);
        ELVEN_NIGHTBLADE.add(RUNNING);
        ELVEN_NIGHTBLADE.add(SENSING_POWER);
        ELVEN_NIGHTBLADE.add(SKIRMISHING);
        ELVEN_NIGHTBLADE.add(SKULKING);
        ELVEN_NIGHTBLADE.add(SNIPING);
        ELVEN_NIGHTBLADE.add(SWASHBUCKLING);
        ELVEN_NIGHTBLADE.add(UNFLAPPABLE_CASTING);
        ELVEN_NIGHTBLADE.add(TRAP_FINDING);
        ELVEN_NIGHTBLADE.add(WAKEFULNESS);
        ELVEN_NIGHTBLADE.add(WEAPON_FOCUS);
        ELVEN_NIGHTBLADE.add(WEAPON_FINESSE);

        // ALL ELVEN SPELLSWORD PROFICIENCIES
        ELVEN_SPELLSWORD = new ArrayList<>();
        ELVEN_SPELLSWORD.add(ACROBATICS);
        ELVEN_SPELLSWORD.add(ALERTNESS);
        ELVEN_SPELLSWORD.add(BATTLE_MAGIC);
        ELVEN_SPELLSWORD.add(BEAST_FRIENDSHIP);
        ELVEN_SPELLSWORD.add(BLACK_LORE_OF_ZAHAR);
        ELVEN_SPELLSWORD.add(BLIND_FIGHTING);
        ELVEN_SPELLSWORD.add(COMBAT_REFLEXES);
        ELVEN_SPELLSWORD.add(COMBAT_TRICKERY_DISARM);
        ELVEN_SPELLSWORD.add(COMBAT_TRICKERY_KNOCK_DOWN);
        ELVEN_SPELLSWORD.add(COMMAND);
        ELVEN_SPELLSWORD.add(ELEMENTALISM);
        ELVEN_SPELLSWORD.add(FAMILIAR);
        ELVEN_SPELLSWORD.add(FIGHTING_STYLE);
        ELVEN_SPELLSWORD.add(LEADERSHIP);
        ELVEN_SPELLSWORD.add(LOREMASTERY);
        ELVEN_SPELLSWORD.add(MAGICAL_ENGINEERING);
        ELVEN_SPELLSWORD.add(MAGICAL_MUSIC);
        ELVEN_SPELLSWORD.add(MYSTIC_AURA);
        ELVEN_SPELLSWORD.add(NATURALISM);
        ELVEN_SPELLSWORD.add(PASSING_WITHOUT_TRACE);
        ELVEN_SPELLSWORD.add(QUIET_MAGIC);
        ELVEN_SPELLSWORD.add(PRECISE_SHOOTING);
        ELVEN_SPELLSWORD.add(PRESTIDIGITATION);
        ELVEN_SPELLSWORD.add(RUNNING);
        ELVEN_SPELLSWORD.add(SENSING_POWER);
        ELVEN_SPELLSWORD.add(SKIRMISHING);
        ELVEN_SPELLSWORD.add(SOOTHSAYING);
        ELVEN_SPELLSWORD.add(SWASHBUCKLING);
        ELVEN_SPELLSWORD.add(UNFLAPPABLE_CASTING);
        ELVEN_SPELLSWORD.add(WAKEFULNESS);
        ELVEN_SPELLSWORD.add(WEAPON_FOCUS);
        ELVEN_SPELLSWORD.add(WEAPON_FINESSE);

        // ALL EXPLORER PROFICIENCIES
        EXPLORER = new ArrayList<>();
        EXPLORER.add(ALERTNESS);
        EXPLORER.add(AMBUSHING);
        EXPLORER.add(BEAST_FRIENDSHIP);
        EXPLORER.add(BLIND_FIGHTING);
        EXPLORER.add(CLIMBING);
        EXPLORER.add(COMBAT_REFLEXES);
        EXPLORER.add(COMBAT_TRICKERY_DISARM);
        EXPLORER.add(COMBAT_TRICKERY_KNOCK_DOWN);
        EXPLORER.add(EAVES_DROPPING);
        EXPLORER.add(ENDURANCE);
        EXPLORER.add(FIGHTING_STYLE);
        EXPLORER.add(LAND_SURVEYING);
        EXPLORER.add(MAPPING);
        EXPLORER.add(MOUNTAINEERING);
        EXPLORER.add(NATURALISM);
        EXPLORER.add(NAVIGATION);
        EXPLORER.add(PASSING_WITHOUT_TRACE);
        EXPLORER.add(PRECISE_SHOOTING);
        EXPLORER.add(RIDING);
        EXPLORER.add(RUNNING);
        EXPLORER.add(SEAFARING);
        EXPLORER.add(SKIRMISHING);
        EXPLORER.add(SNIPING);
        EXPLORER.add(SURVIVAL);
        EXPLORER.add(SWASHBUCKLING);
        EXPLORER.add(TRAPPING);
        EXPLORER.add(WEAPON_FINESSE);
        EXPLORER.add(WEAPON_FOCUS);

        // ALL FIGHTER PROFICIENCIES
        FIGHTER = new ArrayList<>();
        FIGHTER.add(ACROBATICS);
        FIGHTER.add(ALERTNESS);
        FIGHTER.add(BERSERKERGANG);
        FIGHTER.add(BLIND_FIGHTING);
        FIGHTER.add(COMBAT_REFLEXES);
        FIGHTER.add(COMBAT_TRICKERY_DISARM);
        FIGHTER.add(COMBAT_TRICKERY_FORCE_BACK);
        FIGHTER.add(COMBAT_TRICKERY_KNOCK_DOWN);
        FIGHTER.add(COMBAT_TRICKERY_OVERRUN);
        FIGHTER.add(COMBAT_TRICKERY_SUNDER);
        FIGHTER.add(COMMAND);
        FIGHTER.add(DUNGEON_BASHING);
        FIGHTER.add(ENDURANCE);
        FIGHTER.add(FIGHTING_STYLE);
        FIGHTER.add(GAMBLING);
        FIGHTER.add(INTIMIDATION);
        FIGHTER.add(LEADERSHIP);
        FIGHTER.add(MANUAL_OF_ARMS);
        FIGHTER.add(MILITARY_STRATEGY);
        FIGHTER.add(PRECISE_SHOOTING);
        FIGHTER.add(RIDING);
        FIGHTER.add(RUNNING);
        FIGHTER.add(SIEGE_ENGINEERING);
        FIGHTER.add(SKIRMISHING);
        FIGHTER.add(SURVIVAL);
        FIGHTER.add(SWASHBUCKLING);
        FIGHTER.add(WEAPON_FINESSE);
        FIGHTER.add(WEAPON_FOCUS);

        // ALL MAGE PROFICIENCIES
        MAGE = new ArrayList<>();
        MAGE.add(ALCHEMY);
        MAGE.add(BATTLE_MAGIC);
        MAGE.add(BEAST_FRIENDSHIP);
        MAGE.add(BLACK_LORE_OF_ZAHAR);
        MAGE.add(COLLEGIATE_WIZARDRY);
        MAGE.add(CRAFT);
        MAGE.add(DIPLOMACY);
        MAGE.add(ELEMENTALISM);
        MAGE.add(ELVEN_BLOODLINE);
        MAGE.add(ENGINEERING);
        MAGE.add(FAMILIAR);
        MAGE.add(HEALING);
        MAGE.add(ILLUSION_RESISTANCE);
        MAGE.add(KNOWLEDGE);
        MAGE.add(LANGUAGE);
        MAGE.add(LOREMASTERY);
        MAGE.add(MAGICAL_ENGINEERING);
        MAGE.add(MAPPING);
        MAGE.add(MYSTIC_AURA);
        MAGE.add(NATURALISM);
        MAGE.add(QUIET_MAGIC);
        MAGE.add(PERFORMANCE);
        MAGE.add(PRESTIDIGITATION);
        MAGE.add(PROFESSION);
        MAGE.add(SENSING_POWER);
        MAGE.add(TRANSMOGRIFICATION);
        MAGE.add(SOOTHSAYING);
        MAGE.add(UNFLAPPABLE_CASTING);

        // ALL FIGHTER PROFICIENCIES
        THIEF = new ArrayList<>();
        THIEF.add(ACROBATICS);
        THIEF.add(ALERTNESS);
        THIEF.add(ARCANE_DABBLING);
        THIEF.add(BLIND_FIGHTING);
        THIEF.add(BRIBERY);
        THIEF.add(CAT_BURGLARY);
        THIEF.add(COMBAT_REFLEXES);
        THIEF.add(COMBAT_TRICKERY_DISARM);
        THIEF.add(COMBAT_TRICKERY_INCAPACITATE);
        THIEF.add(CONTORTIONISM);
        THIEF.add(DIPLOMACY);
        THIEF.add(FIGHTING_STYLE);
        THIEF.add(GAMBLING);
        THIEF.add(INTIMIDATION);
        THIEF.add(LIP_READING);
        THIEF.add(LOCKPICKING);
        THIEF.add(MAPPING);
        THIEF.add(PRECISE_SHOOTING);
        THIEF.add(RIDING);
        THIEF.add(RUNNING);
        THIEF.add(SEAFARING);
        THIEF.add(SKIRMISHING);
        THIEF.add(SKULKING);
        THIEF.add(SNIPING);
        THIEF.add(SWASHBUCKLING);
        THIEF.add(TRAP_FINDING);
        THIEF.add(WEAPON_FINESSE);
        THIEF.add(WEAPON_FOCUS);
    }
}
