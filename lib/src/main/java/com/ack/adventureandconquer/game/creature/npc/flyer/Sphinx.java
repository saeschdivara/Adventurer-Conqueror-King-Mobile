package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.spell.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Sphinx extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role();
        return createMonster(groupSize);
    }

    private String spellsifMale() {
        Spell spell = new Spell();
        spell.addSpells(1, Spell.ARCANE1);
        spell.setSpellsMemmorizedArcane(1, 4);
        spell.addSpells(2, Spell.ARCANE2);
        spell.setSpellsMemmorizedArcane(2, 4);
        spell.addSpells(3, Spell.ARCANE3);
        spell.setSpellsMemmorizedArcane(3, 3);
        spell.addSpells(4, Spell.ARCANE4);
        spell.setSpellsMemmorizedArcane(4, 3);
        spell.addSpells(5, Spell.ARCANE5);
        spell.setSpellsMemmorizedArcane(5, 3);
        spell.addSpells(6, Spell.ARCANE6);
        spell.setSpellsMemmorizedArcane(6, 2);
        return spell.getSpellLevelString();
    }

    private String spellsifFemale() {
        Spell spell = new Spell();
        spell.addSpells(1, Spell.CLERIC1);
        spell.addSpells(2, Spell.CLERIC2);
        spell.addSpells(3, Spell.CLERIC3);
        spell.addSpells(4, Spell.CLERIC4);
        spell.addSpells(5, Spell.CLERIC5);
        spell.setSpellsMemmorizedClerical();
        return spell.getSpellLevelString(5, 5, 4, 4, 3);
    }

    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();




        for (int i = 1; i <= groupSize; i++) {
            Sphinx monster = new Sphinx();
            String sphinxPowers = "Immune to Spells Level 1-3 and non-magical weapons! Roar to causes fear within 120' for 1HD creatures, paralysis within 60ft (SvP) and deafness + 6d6 damage within 10'";
            if (d6.role()>3){
                monster.addExtraInformation("Male Squinx. ");
                monster.addExtraInformation(sphinxPowers);
                monster.addExtraInformation(monster.spellsifMale());
            }else{
                monster.addExtraInformation("Female Squinx. ");
                monster.addExtraInformation(sphinxPowers);
                monster.addExtraInformation(monster.spellsifFemale());
            }


            monster.addToAttackRoutine("Claw 3D6,Claw 3D6,Bite 2D8, or terrifying roar");
//            monster.setAdditionalHitPoints(0);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 9;
    }

    @Override
    public int getDefaultHitDice() {
        return 12;
    }

    @Override
    public int getDefaultMovement(){return 60;}

    @Override
    public int getDefaultExtraMovement(){return 120;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +2;
    }

    @Override
    public String getDefaultSaves() {
        return "F24";
    }
}
