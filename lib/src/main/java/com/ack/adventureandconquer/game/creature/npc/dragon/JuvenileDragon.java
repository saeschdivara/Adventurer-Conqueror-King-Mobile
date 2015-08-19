package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.RangeDice;
import com.ack.adventureandconquer.game.spell.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class JuvenileDragon extends Npc {

    private static String breathAttack = "";
    private static String dragonColour = "";
    private ArrayList<String> powerDesc = new ArrayList<>();
    private static boolean canSpeak = false;

    public static List<Npc> getGroup() {
        int groupSize = d4.role();
        return createMonster(groupSize);
    }

    public static void setDragonType(String colour, String breath) {
        dragonColour = colour;
        breathAttack = breath;
    }

    private ArrayList<String> getPower() {

        return powerDesc;
    }

    private void generatePowers(int amount, Npc monster) {
        RangeDice d13 = new RangeDice(1, 13);
        int random = d13.role();
        ArrayList powerList = new ArrayList<>();
        while (powerList.size() < amount) {
            random = d13.role();
            switch (random) {
                case 1:
                    if (!powerList.contains(random)) {
                        monster.addExtraInformation("Clutching Claws: Dragon can make Dive Attack. When both claws hit victim is carried of, no save. Paralysis save -4 to break free.");
                        monster.addToAttackRoutine("Dive");
                        powerList.add(random);
                    }
                    break;
                case 2:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Decapitating Bite: On a natural 19-20 the bite decapitates unless a save vs. death is made. Then target takes 4x damage.");
                        powerList.add(random);
                    }
                    break;
                case 3:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Elemental Aura: Everyone within 5' takes 1D4 damage per round.");
                        monster.addToAttackRoutine("Aura");
                        powerList.add(random);
                    }
                    break;
                case 4:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Fear Aura: On charge or overhead flight panic strikes. 1HD: Flee for 4D6 turns, 1-3HD: Save vs. Paralysis or be paralysed, 3+HD: Save vs. Paralysis or -1 to attacks. Lasts till dragon gone.");
                        powerList.add(random);
                    }
                    break;
                case 5:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Gem Encrusted Hide");
                        monster.setArmorClass(monster.getArmorClass() + 2);//AC+3 if Very Old, AC+4 if Venerable
                        monster.setMovement(getMovement() - 30);
                        monster.setExtraMovement(getExtraMovement() - 30);
                        powerList.add(random);
                    }
                    break;
                case 6:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Horrific Stench: Save vs. Poison if within 30' or -3 to attacks for 1D4+4 rounds.");
                        powerList.add(random);
                    }
                    break;
                case 7:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Invulnerable: Immune to non-magical weapons");
                        powerList.add(random);
                    }
                    break;
                case 8:
                    powerDesc.add("Massive Size");
                    monster.setHitDice(getHitDice() + 3);
                    ArrayList<String> routine = monster.getAttackRoutine();

                    if (routine.remove("Claw 1D6,Claw 1D6,Bite 2D8")) {
                        routine.add("Claw 2D3,Claw 2D3,Bite 2D10");
                    }

                    //Venerable dragons attack for 3d6/3d6/6d8
                    //if this special ability is taken once and for 3d8/3d8/6d10 if the
                    //special ability is taken twice.

                    monster.setAttackRoutine(routine);
                    powerList.add(random);
                    break;
                case 9:
                    if (!powerList.contains(random) && monster.getAlignment().equals("chaotic")) {
                        powerDesc.add("Paralizing Blows: Save vs. Paralysis or be paralysed for 3D4 turns due to negative energy like Ghouls");
                        powerList.add(random);
                    }
                    break;
                case 10:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Poisonous Blood: Everyone striking the dragon in melee must save vs. poison or die.");
                        powerList.add(random);
                    }
                    break;
                case 11:
                    if (!powerList.contains(random) && canSpeak) {
                        powerDesc.add("Polymorph Self: Can change shape at will.");
                        powerList.add(random);
                    }
                    break;
                case 12:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Tail Lash");
                        monster.addToAttackRoutine("Tail (as Bite)");
                        powerList.add(random);
                    }
                    break;
                case 13:
                    if (!powerList.contains(random)) {
                        powerDesc.add("Wing Claws");
                        monster.addToAttackRoutine("Wing (as Claw),Wing (as Claw)");
                        powerList.add(random);
                    }
                    break;
            }
        }
    }



    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            JuvenileDragon monster = new JuvenileDragon();
            monster.addToAttackRoutine("Claw 1D6,Claw 1D6,Bite 2D8");
//            monster.setAdditionalHitPoints(0);
            canSpeak = BaseDragon.checkIfCanSpeak(10);
//            monster.generatePowers(1, monster);
            monster.addExtraInformation(dragonColour + "dragon breath: Initial then 50% chance," + monster.getHitDice() + breathAttack);
//            monster.addExtraInformation("Dragon Powers: " + monster.getPower());
            if (canSpeak){
                monster.addExtraInformation(" " + monster.spellsifcanSpeak());
            }
//            monster.addExtraInformation(BaseDragon.awake(50)); //Values in the Core book depict awake not asleep!
            monster.addToAttackRoutine("Breath Weapon");
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }



    private String spellsifcanSpeak() {
            Spell dragonspell = new Spell();
            dragonspell.addFavoriteSpell(2, Spell.MIRROR_IMAGE, 10);
            dragonspell.addFavoriteSpell(2, Spell.INVISIBILITY, 10);
            dragonspell.addFavoriteSpell(1, Spell.CHARM_PERSON, 10);
            dragonspell.addSpells(1, Spell.ARCANE1);
            dragonspell.setSpellsMemmorizedArcane(1, 2);
            dragonspell.addSpells(2, Spell.ARCANE2);
            dragonspell.setSpellsMemmorizedArcane(2, 2);
            return dragonspell.getSpellLevelString();
    }

    @Override
    public String getDefaultAlignment  () {
        if (d6.role() < 3) {
            return "lawful";
        } else if (d6.role() > 5) {
            return "chaotic";
        } else
            return "neutral";
    }

    @Override
    public int getDefaultArmorClass() {
        return 6;
    }

    @Override
    public int getDefaultHitDice() {
        return 8;
    }

    @Override
    public int getDefaultMovement() {
        return 90;
    }

    @Override
    public int getDefaultExtraMovement() {
        return 240;
    }

    @Override
    public String getExtraMovementType() {
        return "Fly";
    }

    @Override
    public int getDefaultMorale() {
        return +0;
    }

    @Override
    public String getDefaultSaves() {
        return "F8";
    }
}
