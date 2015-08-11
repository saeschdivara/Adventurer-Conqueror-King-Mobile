package com.ack.adventureandconquer.game.spell;

import com.ack.adventureandconquer.game.dice.RangeDice;

import java.util.ArrayList;

/**
 * Created by saskyrar on 11/03/15.
 */
public class Spell {

    public static final String ADAPTATION = "Adaptation";
    public static final String ALTER_SELF = "Alter Self";
    public static final String ANGELIC_CHOIR = "Angelic Choir";
    public static final String ANIMATE_DEAD = "Animate Dead";
    public static final String ANTI_MAGIC_SHELL = "Anti-Magic Shell";
    public static final String ATONEMENT = "Atonement";
    public static final String AUGURY = "Augury";
    public static final String BLESS = "Bless";
    public static final String BURNING_HANDS = "Burning Hands";
    public static final String CALL_LIGHTNING = "Call Lightning";
    public static final String CHAMELEON = "Chameleon";
    public static final String CHARM_ANIMAL = "Charm Animal";
    public static final String CHARM_MONSTER = "Charm Monster";
    public static final String CHARM_PERSON = "Charm Person";
    public static final String CHIMERICAL_FORCE = "Chimerical Force";
    public static final String CHOKING_GRIP = "Choking Grip";
    public static final String CLAIRAUDIENCE = "Clairaudience";
    public static final String CLAIRVOYANCE = "Clairvoyance";
    public static final String CLOUD_KILL = "Cloud Kill";
    public static final String COMMAND_ANIMALS = "Command Animals";
    public static final String COMMAND_PLANTS = "Command Plants";
    public static final String COMMAND_PERSON = "Command Person";
    public static final String COMMAND_WORD = "Command Word";
    public static final String COMMUNE = "Commune";
    public static final String CONE_OF_COLD = "Cone of Cold";
    public static final String CONE_OF_PARALYSIS = "Cone of Paralysis";
    public static final String CONFUSION = "Confusion";
    public static final String CONJURE_ELEMENTAL = "Conjure Elemental";
    public static final String CONJURE_OOZES = "Conjure Oozes";
    public static final String CONTACT_OUTER_PLANE = "Contact Outer Plane";
    public static final String CONTINUAL_LIGHT = "Continual Light";
    public static final String CONTROL_ANIMALS = "Control Animals";
    public static final String CONTROL_PLANTS = "Control Plants";
    public static final String CONTROL_UNDEAD = "Control Undead";
    public static final String CONTROL_WEATHER = "Control Weather";
    public static final String CONTROL_WIND = "Control Wind";
    public static final String CREATE_FOOD = "Create Food";
    public static final String CREATE_WATER = "Create Water";
    public static final String CURE_BLINDNESS = "Cure Blindness";
    public static final String CURE_CRITICAL_WOUNDS = "Cure Critical Wounds";
    public static final String CURE_DISEASE = "Cure Disease";
    public static final String CURE_LIGHT_WOUNDS = "Cure Light Wounds";
    public static final String CURE_MEDIUM_WOUNDS = "Cure Medium Wounds";
    public static final String CURE_SERIOUS_WOUNDS = "Cure Serious Wounds";
    public static final String CURSE_OF_SWINE = "Curse of Swine";
    public static final String DEATH_SPELL = "Death Spell";
    public static final String DEATH_WARD = "Death Ward";
    public static final String DEATHLESS_MINION = "Deathless Minion";
    public static final String DELAY_DISEASE = "Delay Disease";
    public static final String DELAY_POISON = "Delay Poison";
    public static final String DETECT_CHARM = "Detect Charm";
    public static final String DETECT_CURSE = "Detect Curse";
    public static final String DETECT_DANGER = "Detect Danger";
    public static final String DETECT_EVIL = "Detect Evil";
    public static final String DETECT_INVISIBLE = "Detect Invisible";
    public static final String DETECT_RITUAL_MAGIC = "Detect Ritual Magic";
    public static final String DETECT_SECRET_DOORS = "Detect Secret Doors";
    public static final String DETECT_UNDEAD = "Detect Undead";
    public static final String DETECT_MAGIC = "Detect Magic";
    public static final String DIMENSION_DOOR = "Dimension Door";
    public static final String DISINTEGRATE = "Disintegrate";
    public static final String DISMEMBER = "Dismember";
    public static final String DIVINE_GRACE = "Divine Grace";
    public static final String DISPEL_EVIL = "Dispel Evil";
    public static final String DISPEL_MAGIC = "Dispel Magic";
    public static final String DIVINATION = "Divination";
    public static final String EARTH_TEETH = "Earth Teeth";
    public static final String ENCHANTED_CONTAINER = "Enchanted Container";
    public static final String ENEVERATE = "Eneverate";
    public static final String ENSLAVE = "Enslave";
    public static final String ENTHRALL = "Enthrall";
    public static final String ESP = "ESP";
    public static final String EYES_OF_THE_EAGLE = "Eyes of the Eagle";
    public static final String FATE = "Fate";
    public static final String FEARIE_FIRE = "Faerie Fire";
    public static final String FEAR = "Fear";
    public static final String FEEBLEMIND = "Feeblemind";
    public static final String FEIGN_DEATH = "Feign Death";
    public static final String FELLOWSHIP = "Fellowship";
    public static final String FIND_TRAPS = "Find Traps";
    public static final String FIND_TREASURE = "Find Treasure";
    public static final String FIREBALL = "Fireball";
    public static final String FLAMESTRIKE = "Flamestrike";
    public static final String FLESH_TO_STONE = "Flesh to Stone";
    public static final String FLOATING_DISC = "Floating Disc";
    public static final String FLY = "Fly";
    public static final String GASEOUS_FORM = "Gaseous Form";
    public static final String GIANT_STRENGTH = "Giant Strength";
    public static final String GLITTERDUST = "Glitterdust";
    public static final String GEAS = "Geas";
    public static final String FLYPH_OF_WARDIN = "Glyph of Warding";
    public static final String GLOBE_OF_INVULNERABILITY = "Globe of Invulnerability";
    public static final String GROWTH = "Growth";
    public static final String GROWTH_OF_ANIMALS = "Growth of Animals";
    public static final String GROWTH_OF_PLANTS= "Growth of Plants";
    public static final String GUST_OF_WIND = "Gust of Wind";
    public static final String HYPNOTIC_PATTERN = "Hypnotic Pattern";
    public static final String HALLUCINATORY_TERRAIN= "Hallucinatory Terrain";
    public static final String HASTE = "Haste";
    public static final String HOLD_MONSTER = "Hold Monster";
    public static final String HOLD_PERSON = "Hold Person";
    public static final String HOLD_PORTAL = "Hold Portal";
    public static final String HOLY_CHANT = "Holy Chant";
    public static final String INAUDIBILITY = "Inaudibility";
    public static final String INFRAVISION = "Infravision";
    public static final String INSECT_PLAGUE = "Insect Plague";
    public static final String INVISIBILITY = "Invisibility";
    public static final String INVISIBILITY_10FT_RADIUS = "Invisibility 10ft. radius";
    public static final String INVISIBLE_STALKER = "Invisible Stalker";
    public static final String INVULNERABILITY_TO_EVIL = "Invulnerability to Evil";
    public static final String KNOCK = "Knock";
    public static final String JUMP = "Jump";
    public static final String LEVITATE = "Levitate";
    public static final String LOCATE_ANIMAL_OR_PLANT = "Locate Animal or Plant";
    public static final String LIGHT = "Light";
    public static final String LIGHTNING_BOLT = "Lightning Bolt";
    public static final String LOCATE_OBJECT = "Locate Object";
    public static final String LOWER_WATER = "Lower Water";
    public static final String MAGIC_CARPET = "Magic Carpet";
    public static final String MAGIC_JAR = "Magic Jar";
    public static final String MAGIC_MOUTH = "Magic Mouth";
    public static final String MAGIC_MISSILE = "Magic Missile";
    public static final String MAGIC_ROPE = "Magic Rope";
    public static final String MASS_INFRAVISION = "Mass Infravision";
    public static final String MINOR_GLOBE_OF_INVULNERABILITY = "Minor Globe of Invulnerability";
    public static final String MASS_MORPH = "Mass Morph";
    public static final String MIRROR_IMAGE = "Mirror Image";
    public static final String MOVE_EARTH = "Move Earth";
    public static final String NECROMANTIC_POTENCE = "Necromantic Potence";
    public static final String NONDETECTION = "Nondetection";
    public static final String NEUTRALIZE_POISON = "Neutralize Poison";
    public static final String OBLIVION = "Oblivion";
    public static final String OBSCURING_CLOUD = "Obscuring Cloud";
    public static final String OGRE_POWER = "Ogre Power";
    public static final String PANIC = "Panic";
    public static final String PATH_WITHOUT_TRACE = "Path Without Trace";
    public static final String PASSWALL = "Passwall";
    public static final String PHANTASMAL_FORCE = "Phantasmal Force";
    public static final String POLYMORPH_OTHER = "Polymorph Other";
    public static final String POLYMORPH_SELF = "Polymorph Self";
    public static final String PRAYER = "Prayer";
    public static final String PROJECTED_IMAGE = "Projected Image";
    public static final String PROTECTION_FROM_EVIL = "Protection from Evil";
    public static final String PERMANENT_ILLUSION = "Permanent Illusion";
    public static final String PHANTASMAL_KILLER = "Phantasmal Killer";
    public static final String PREDICT_WEATHER = "Predict Weather";
    public static final String PRODUCE_FIRE = "Produce Fire";
    public static final String PROGRAMMED_ILLUSION = "Programmed Illusion";
    public static final String PROTECTION_FROM_NORMAL_MISSILES = "Protection from Normal Missiles";
    public static final String PROTECTION_FROM_NORMAL_WEAPONS = "Protection from Normal Weapons";
    public static final String PURIFY_FOOD_AND_WATER = "Purify Food and Water";
    public static final String PROTECTION_FROM_EVIL_SUSTAINED = "Protection from Evil, Sustained";
    public static final String QUEST = "Quest";
    public static final String READ_LANGUAGE = "Read Languages";
    public static final String REINCARNATE = "Reincarnate";
    public static final String RIGHTEOUS_WRATH = "Righteous Wrath";
    public static final String SALVING_REST = "Salving Rest";
    public static final String RESTORE_LIFE_AND_LIMB = "Restore Life and Limb";
    public static final String REMOVE_CURSE = "Remove Curse";
    public static final String REMOVE_FEAR = "Remove Fear";
    public static final String RESIST_COLD = "Resist Cold";
    public static final String RESIST_FIRE = "Resist Fire";
    public static final String SANCTUARY = "Sanctuary";
    public static final String SHIELD = "Shield";
    public static final String SHIMMER = "Shimmer";
    public static final String SCOURING_WIND = "Scouring Wind";
    public static final String SCRY = "Scry";
    public static final String SHARPNESS = "Sharpness";
    public static final String SILENT_STEP = "Silent Step";
    public static final String SKINCHANGE = "Skinchange";
    public static final String SLEEP = "Sleep";
    public static final String SLIPPERINESS = "Slipperiness";
    public static final String SPECTRAL_FORCE = "Spectral Force";
    public static final String SPELL_STORING = "Spell Storing";
    public static final String SPHERE_OF_VISIBILITY = "Sphere of Visibility";
    public static final String SILENCE_15FT_RADIUS = "Silence 15ft. Radius";
    public static final String SMITE_UNDEAD = "Smite Undead";
    public static final String SNAKE_CHARM = "Snake Charm";
    public static final String SPEAK_WITH_ANIMALS = "Speak with Animals";
    public static final String SPEAK_WITH_DEAD = "Speak with Dead";
    public static final String SPEAK_WITH_PLANTS = "Speak with Plants";
    public static final String SPIDER_CLIMB = "Spider Climb";
    public static final String SPIRIT_OF_HEALING = "Spirit of Healing";
    public static final String STINKING_CLOUD = "Stinking Cloud";
    public static final String SUMMON_ANIMALS = "Summon Animals";
    public static final String SUMMON_BERSERKERS = "Summon Berserkers";
    public static final String SUMMON_DJINNI = "Summon Djinni";
    public static final String SUMMON_FANTASTIC_CREATURE = "Summon Fantastic Creature";
    public static final String SUMMON_HERO = "Summon Hero";
    public static final String SUMMON_WEATHER = "Summon Weather";
    public static final String SUMMON_WINGED_STEED = "Summon Winged Steed";
    public static final String SWIFT_SWORD = "Swift Sword";
    public static final String SPIRITUAL_WEAPON = "Spiritual Weapon";
    public static final String STICKS_TO_SNAKES = "Sticks to Snakes";
    public static final String STRENGTH_OF_MIND = "Strength of Mind";
    public static final String STRIKING = "Striking";
    public static final String SWORD_OF_FIRE = "Sword of Fire";
    public static final String TELEKINESIS = "Telekinesis";
    public static final String TELEPORT = "Teleport";
    public static final String TONGUES = "Tongues";
    public static final String TELEPATHY = "Telepathy";
    public static final String TORPOR = "Torpor";
    public static final String TRANCE = "Trance";
    public static final String TROLLBLOOD = "Trollblood";
    public static final String TRANSMUTE_ROCK_TO_MUD = "Transmute Rock to Mud";
    public static final String TRUE_SEEING = "True Seeing";
    public static final String UNCANNY_GYRATION = "Uncanny Gyration";
    public static final String UNSEEN_SERVANT = "Unseen Servant";
    public static final String VENTRILOQUISM = "Ventriloquism";
    public static final String VIGOR = "Vigor";
    public static final String WALL_OF_FIRE = "Wall of Fire";
    public static final String WALL_OF_ICE = "Wall of Ice";
    public static final String WALL_OF_IRON = "Wall of Iron";
    public static final String WALL_OF_CORPSES = "Wall of Corpses";
    public static final String WALL_OF_FORCE = "Wall of Force";
    public static final String WALL_OF_SMOKE = "Wall of Smoke";
    public static final String WALL_OF_WOOD = "Wall of Wood";
    public static final String WALL_OF_STONE = "Wall of Stone";
    public static final String WATER_BREATHING = "Water Breathing";
    public static final String WEB = "Web";
    public static final String WARP_WOOD = "Warp Wood";
    public static final String WATER_WALKING = "Water Walking";
    public static final String WINGED_FLIGHT = "Winged Flight";
    public static final String WIZARD_EYE = "Wizard Eye";
    public static final String WIZARD_LOCK = "Wizard Lock";
    public static final String XRAY_VISION = "X-Ray Vision";
//    public static final String  = "";

    public static final ArrayList<String> ARCANE1;
    public static final ArrayList<String> ARCANE2;
    public static final ArrayList<String> ARCANE3;
    public static final ArrayList<String> ARCANE4;
    public static final ArrayList<String> ARCANE5;
    public static final ArrayList<String> ARCANE6;

    public static final ArrayList<String> BLADEDANCER1;
    public static final ArrayList<String> BLADEDANCER2;
    public static final ArrayList<String> BLADEDANCER3;
    public static final ArrayList<String> BLADEDANCER4;
    public static final ArrayList<String> BLADEDANCER5;

    public static final ArrayList<String> CLERIC1;
    public static final ArrayList<String> CLERIC2;
    public static final ArrayList<String> CLERIC3;
    public static final ArrayList<String> CLERIC4;
    public static final ArrayList<String> CLERIC5;

    public static final ArrayList<String> PRIESTESS1;
    public static final ArrayList<String> PRIESTESS2;
    public static final ArrayList<String> PRIESTESS3;
    public static final ArrayList<String> PRIESTESS4;
    public static final ArrayList<String> PRIESTESS5;

    public static final ArrayList<String> SHAMAN1;
    public static final ArrayList<String> SHAMAN2;
    public static final ArrayList<String> SHAMAN3;
    public static final ArrayList<String> SHAMAN4;
    public static final ArrayList<String> SHAMAN5;

    public static final ArrayList<String> WITCH1;
    public static final ArrayList<String> WITCH2;
    public static final ArrayList<String> WITCH3;
    public static final ArrayList<String> WITCH4;
    public static final ArrayList<String> WITCH5;

    private  ArrayList<String> spells1 = new ArrayList<String>();
    private  ArrayList<String> spells2 = new ArrayList<String>();
    private  ArrayList<String> spells3 = new ArrayList<String>();
    private  ArrayList<String> spells4 = new ArrayList<String>();
    private  ArrayList<String> spells5 = new ArrayList<String>();
    private  ArrayList<String> spells6 = new ArrayList<String>();
    private  ArrayList<String> level1spells = new ArrayList<String>();
    private  ArrayList<String> level2spells = new ArrayList<String>();
    private  ArrayList<String> level3spells = new ArrayList<String>();
    private  ArrayList<String> level4spells = new ArrayList<String>();
    private  ArrayList<String> level5spells = new ArrayList<String>();
    private  ArrayList<String> level6spells = new ArrayList<String>();

    private ArrayList<String> spellList = new ArrayList<String>();

//    public void Spell(){
//
//        spellList  = new ArrayList<String>();
//        spells1 = new ArrayList<String>();
//        spells2 = new ArrayList<String>();
//        spells3 = new ArrayList<String>();
//        spells4 = new ArrayList<String>();
//        spells5 = new ArrayList<String>();
//        spells6 = new ArrayList<String>();
//        level1spells = new ArrayList<String>();
//        level2spells = new ArrayList<String>();
//        level3spells = new ArrayList<String>();
//        level4spells = new ArrayList<String>();
//        level5spells = new ArrayList<String>();
//        level6spells = new ArrayList<String>();
//    }

    public void addFavoriteSpell(int level, String spellName, int amount){
        ArrayList<String> templist = new ArrayList<String>();
        for (int i = 0; i < amount; i++) {
            templist.add(spellName);
        }
        this.addSpells(level,templist);
    }

    public void addSpells(int level,ArrayList spells) {
        switch (level) {
            case 1:
                spells1.addAll(spells);
                break;
            case 2:
                spells2.addAll(spells);
                break;
            case 3:
                spells3.addAll(spells);
                break;
            case 4:
                spells4.addAll(spells);
                break;
            case 5:
                spells5.addAll(spells);
                break;
            case 6:
                spells6.addAll(spells);
                break;
        }
    }

    public String getSpellLevelString() {
        String result = "none";

        if (!level1spells.isEmpty())
            result = "Level 1: " + level1spells;

        if (!level2spells.isEmpty())
            result += "Level 2: " + level2spells;

        if (!level3spells.isEmpty())
            result += "Level 3: " + level3spells;

        if (!level4spells.isEmpty())
            result += "Level 4: " + level4spells;

        if (!level5spells.isEmpty())
            result += "Level 5: " + level5spells;

        if (!level6spells.isEmpty())
            result += "Level 6: " + level6spells;

        return "SPELLS: " +result;
    }

    public void setSpellsMemmorized(int level, int amount, boolean divine) {
        if (divine){
            switch (level){
                case 1:
                    amount = spells1.size();
                    break;
                case 2:
                    amount = spells2.size();
                    break;
                case 3:
                    amount = spells3.size();
                    break;
                case 4:
                    amount = spells4.size();
                    break;
                case 5:
                    amount = spells5.size();
                    break;
                case 6:
                    amount = spells6.size();
                    break;
            }
        }

        switch (level) {
            case 1:
                while (level1spells.size() < amount) {
                    RangeDice rand = new RangeDice(1, spells1.size());
                    String newspell = spells1.get(rand.role()-1);
                    if (!level1spells.contains(newspell))
                        level1spells.add(newspell);
                }
                break;
            case 2:
                while (level2spells.size() < amount) {
                    RangeDice rand = new RangeDice(0, spells2.size() - 1);
                    String newspell = spells2.get(rand.role());
                    if (!level2spells.contains(newspell))
                        level2spells.add(newspell);
                }
                break;
            case 3:
                while (level3spells.size() < amount) {
                    RangeDice rand = new RangeDice(0, spells3.size() - 1);
                    String newspell = spells3.get(rand.role());
                    if (!level3spells.contains(newspell))
                        level3spells.add(newspell);
                }
                break;
            case 4:
                while (level4spells.size() < amount) {
                    RangeDice rand = new RangeDice(0, spells4.size() - 1);
                    String newspell = spells4.get(rand.role());
                    if (!level4spells.contains(newspell))
                        level4spells.add(newspell);
                }
                break;
            case 5:
                while (level5spells.size() < amount) {
                    RangeDice rand = new RangeDice(0, spells5.size() - 1);
                    String newspell = spells5.get(rand.role());
                    if (!level5spells.contains(newspell))
                        level5spells.add(newspell);
                }
                break;
            case 6:
                while (level6spells.size() < amount) {
                    RangeDice rand = new RangeDice(0, spells6.size() - 1);
                    String newspell = spells6.get(rand.role());
                    if (!level6spells.contains(newspell))
                        level6spells.add(newspell);
                }
                break;
        }
    }

    static {

        ARCANE1 = new ArrayList<>();
        ARCANE1.add(BURNING_HANDS);
        ARCANE1.add(CHARM_PERSON);
        ARCANE1.add(CHAMELEON);
        ARCANE1.add(CHOKING_GRIP);
        ARCANE1.add(DETECT_MAGIC);
        ARCANE1.add(FLOATING_DISC);
        ARCANE1.add(HOLD_PORTAL);
        ARCANE1.add(JUMP);
        ARCANE1.add(LIGHT);
        ARCANE1.add(MAGIC_MISSILE);
        ARCANE1.add(MAGIC_MOUTH);
        ARCANE1.add(MAGIC_ROPE);
        ARCANE1.add(PROTECTION_FROM_EVIL);
        ARCANE1.add(READ_LANGUAGE);
        ARCANE1.add(SHARPNESS);
        ARCANE1.add(SHIELD);
        ARCANE1.add(SILENT_STEP);
        ARCANE1.add(SLEEP);
        ARCANE1.add(SLIPPERINESS);
        ARCANE1.add(SPIDER_CLIMB);
        ARCANE1.add(SUMMON_BERSERKERS);
        ARCANE1.add(UNSEEN_SERVANT);
        ARCANE1.add(VENTRILOQUISM);
        ARCANE1.add(WALL_OF_SMOKE);


        ARCANE2 = new ArrayList<>();
        ARCANE2.add(ALTER_SELF);
        ARCANE2.add(CONTINUAL_LIGHT);
        ARCANE2.add(DEATHLESS_MINION);
        ARCANE2.add(DETECT_EVIL);
        ARCANE2.add(DETECT_INVISIBLE);
        ARCANE2.add(DETECT_SECRET_DOORS);
        ARCANE2.add(ESP);
        ARCANE2.add(GLITTERDUST);
        ARCANE2.add(GUST_OF_WIND);
        ARCANE2.add(HYPNOTIC_PATTERN);
        ARCANE2.add(INAUDIBILITY);
        ARCANE2.add(INVISIBILITY);
        ARCANE2.add(KNOCK);
        ARCANE2.add(LEVITATE);
        ARCANE2.add(LOCATE_OBJECT);
        ARCANE2.add(MIRROR_IMAGE);
        ARCANE2.add(NECROMANTIC_POTENCE);
        ARCANE2.add(OGRE_POWER);
        ARCANE2.add(PHANTASMAL_FORCE);
        ARCANE2.add(STINKING_CLOUD);
        ARCANE2.add(SUMMON_HERO);
        ARCANE2.add(UNCANNY_GYRATION);
        ARCANE2.add(WEB);
        ARCANE2.add(WIZARD_LOCK);

        ARCANE3 = new ArrayList<>();
        ARCANE3.add(CLAIRVOYANCE);
        ARCANE3.add(CLAIRAUDIENCE);
        ARCANE3.add(CHIMERICAL_FORCE);
        ARCANE3.add(COMMAND_PERSON);
        ARCANE3.add(DISMEMBER);
        ARCANE3.add(DISPEL_MAGIC);
        ARCANE3.add(EARTH_TEETH);
        ARCANE3.add(ENEVERATE);
        ARCANE3.add(FIREBALL);
        ARCANE3.add(FLY);
        ARCANE3.add(GASEOUS_FORM);
        ARCANE3.add(GROWTH);
        ARCANE3.add(HASTE);
        ARCANE3.add(HOLD_PERSON);
        ARCANE3.add(INFRAVISION);
        ARCANE3.add(INVISIBILITY_10FT_RADIUS);
        ARCANE3.add(LIGHTNING_BOLT);
        ARCANE3.add(NONDETECTION);
        ARCANE3.add(PROTECTION_FROM_EVIL_SUSTAINED);
        ARCANE3.add(PROTECTION_FROM_NORMAL_MISSILES);
        ARCANE3.add(SKINCHANGE);
        ARCANE3.add(SUMMON_WINGED_STEED);
        ARCANE3.add(TELEPATHY);
        ARCANE3.add(WATER_BREATHING);


        ARCANE4 = new ArrayList<>();
        ARCANE4.add(CHARM_MONSTER);
        ARCANE4.add(COMMAND_PLANTS);
        ARCANE4.add(CONFUSION);
        ARCANE4.add(CONJURE_OOZES);
        ARCANE4.add(DIMENSION_DOOR);
        ARCANE4.add(FEAR);
        ARCANE4.add(FIND_TREASURE);
        ARCANE4.add(GIANT_STRENGTH);
        ARCANE4.add(GROWTH_OF_PLANTS);
        ARCANE4.add(HALLUCINATORY_TERRAIN);
        ARCANE4.add(MAGIC_CARPET);
        ARCANE4.add(MASS_MORPH);
        ARCANE4.add(MINOR_GLOBE_OF_INVULNERABILITY);
        ARCANE4.add(POLYMORPH_SELF);
        ARCANE4.add(POLYMORPH_OTHER);
        ARCANE4.add(REMOVE_CURSE);
        ARCANE4.add(SCRY);
        ARCANE4.add(SPECTRAL_FORCE);
        ARCANE4.add(SPELL_STORING);
        ARCANE4.add(SUMMON_FANTASTIC_CREATURE);
        ARCANE4.add(WALL_OF_FIRE);
        ARCANE4.add(WALL_OF_ICE);
        ARCANE4.add(WALL_OF_WOOD);
        ARCANE4.add(WIZARD_EYE);

        ARCANE5 = new ArrayList<>();
        ARCANE5.add(ANIMATE_DEAD);
        ARCANE5.add(ADAPTATION);
        ARCANE5.add(CLOUD_KILL);
        ARCANE5.add(CONE_OF_COLD);
        ARCANE5.add(CONE_OF_PARALYSIS);
        ARCANE5.add(CONJURE_ELEMENTAL);
        ARCANE5.add(CONTACT_OUTER_PLANE);
        ARCANE5.add(CONTROL_UNDEAD);
        ARCANE5.add(CURSE_OF_SWINE);
        ARCANE5.add(ENCHANTED_CONTAINER);
        ARCANE5.add(FEEBLEMIND);
        ARCANE5.add(HOLD_MONSTER);
        ARCANE5.add(MAGIC_JAR);
        ARCANE5.add(MASS_INFRAVISION);
        ARCANE5.add(PANIC);
        ARCANE5.add(PASSWALL);
        ARCANE5.add(PHANTASMAL_KILLER);
        ARCANE5.add(PROTECTION_FROM_NORMAL_WEAPONS);
        ARCANE5.add(SCOURING_WIND);
        ARCANE5.add(TELEKINESIS);
        ARCANE5.add(TELEPORT);
        ARCANE5.add(TRANSMUTE_ROCK_TO_MUD);
        ARCANE5.add(WALL_OF_STONE);
        ARCANE5.add(XRAY_VISION);

        ARCANE6 = new ArrayList<>();
        ARCANE6.add(ANTI_MAGIC_SHELL);
        ARCANE6.add(CONTROL_PLANTS);
        ARCANE6.add(CONTROL_WEATHER);
        ARCANE6.add(DEATH_SPELL);
        ARCANE6.add(DETECT_RITUAL_MAGIC);
        ARCANE6.add(DISINTEGRATE);
        ARCANE6.add(ENSLAVE);
        ARCANE6.add(FLESH_TO_STONE);
        ARCANE6.add(GEAS);
        ARCANE6.add(GLOBE_OF_INVULNERABILITY);
        ARCANE6.add(INVISIBLE_STALKER);
        ARCANE6.add(LOWER_WATER);
        ARCANE6.add(MOVE_EARTH);
        ARCANE6.add(OBLIVION);
        ARCANE6.add(PERMANENT_ILLUSION);
        ARCANE6.add(PROGRAMMED_ILLUSION);
        ARCANE6.add(PROJECTED_IMAGE);
        ARCANE6.add(REINCARNATE);
        ARCANE6.add(SUMMON_DJINNI);
        ARCANE6.add(TORPOR);
        ARCANE6.add(TROLLBLOOD);
        ARCANE6.add(WALL_OF_CORPSES);
        ARCANE6.add(WALL_OF_FORCE);
        ARCANE6.add(WALL_OF_IRON);


        BLADEDANCER1 = new ArrayList<>();
        BLADEDANCER2 = new ArrayList<>();
        BLADEDANCER3 = new ArrayList<>();
        BLADEDANCER4 = new ArrayList<>();
        BLADEDANCER5 = new ArrayList<>();

        CLERIC1 = new ArrayList<>();
        CLERIC2 = new ArrayList<>();
        CLERIC3 = new ArrayList<>();
        CLERIC4 = new ArrayList<>();
        CLERIC5 = new ArrayList<>();

        PRIESTESS1 = new ArrayList<>();
        PRIESTESS2 = new ArrayList<>();
        PRIESTESS3 = new ArrayList<>();
        PRIESTESS4 = new ArrayList<>();
        PRIESTESS5 = new ArrayList<>();

        SHAMAN1 = new ArrayList<>();
        SHAMAN2 = new ArrayList<>();
        SHAMAN3 = new ArrayList<>();
        SHAMAN4 = new ArrayList<>();
        SHAMAN5 = new ArrayList<>();

        WITCH1 = new ArrayList<>();
        WITCH2 = new ArrayList<>();
        WITCH3 = new ArrayList<>();
        WITCH4 = new ArrayList<>();
        WITCH5 = new ArrayList<>();


    }

}
