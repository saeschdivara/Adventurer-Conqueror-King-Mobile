package com.ack.adventureandconquer.game.creature.npc.flyer;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.spell.Spell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class Lammasu extends Npc {


    public static List<Npc> getGroup() {
        int groupSize = d4.role()+d4.role();
        return createMonster(groupSize);
    }

    private String spell() {
        Spell spell = new Spell();
        spell.addSpells(1, Spell.CLERIC1);
        spell.addSpells(2, Spell.CLERIC2);
        spell.addSpells(3, Spell.CLERIC3);
        spell.addSpells(4, Spell.CLERIC4);
        spell.addSpells(5, Spell.CLERIC5);
        spell.setSpellsMemmorizedClerical();
        return spell.getSpellLevelString(2, 2, 2, 1, 1);
    }


    private static List<Npc> createMonster(int groupSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= groupSize; i++) {
            Lammasu monster = new Lammasu();
            monster.setExtraInformation("Cure spells have 2x effect! Radiates Protection from Evil aura with 2x effect. Can Ignore magic spells due magical resistance on 7+ ");
            monster.addExtraInformation(monster.spell());
            monster.addToAttackRoutine("Claw 1D6,Claw 1D6");
            monster.setAdditionalHitPoints(7);
            monster.roleHitPoints();
            pack.add(monster);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 7;
    }

    @Override
    public int getDefaultMovement(){return 120;}

    @Override
    public int getDefaultExtraMovement(){return 240;}

    @Override
    public String getExtraMovementType(){return "Fly";}

    @Override
    public int getDefaultMorale() {
        return +1;
    }

    @Override
    public String getDefaultSaves() {
        return "F7";
    }

    @Override
    public String getDefaultAlignment() {return "Lawful";}
}
