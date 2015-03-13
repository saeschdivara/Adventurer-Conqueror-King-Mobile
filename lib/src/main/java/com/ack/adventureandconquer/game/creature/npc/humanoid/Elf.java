package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.flyer.GiantHawk;
import com.ack.adventureandconquer.game.dice.D2;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Elf extends Npc {

    private boolean isSpellSword = false;
    private boolean isNightBlade = false;

    public static List<Npc> getFellowship() {
        List<Npc> fellowship = new ArrayList<>();
        int fellowshipSize = d4.role();

        for (int index = 0; index < fellowshipSize; index++) {
            Elf elf = new Elf();
            elf.roleHitPoints();

            fellowship.add(elf);
        }

        return fellowship;
    }

    public static List<Npc> getCompany() {
        List<Npc> company = new ArrayList<>();
        int companySize = d10.role();

        for (int index = 0; index < companySize; index++) {
            List<Npc> fellowship = getFellowship();

            company.addAll(fellowship);
        }

        Npc spellSword = createSpellSword(d6.role());
        company.add(spellSword);


        return company;
    }

    public static List<Npc> getFastness() {
        List<Npc> fastness = new ArrayList<>();
        int fastnessSize = d10.role();

        for (int index = 0; index < fastnessSize; index++) {
            List<Npc> company = getCompany();

            fastness.addAll(company);
        }

        Npc spellSword = createSpellSword(9);
        fastness.add(spellSword);

        int guardsNumber = d6.role() + d6.role();
        for (int index = 0; index < guardsNumber; index++) {
            fastness.add( createSpellSword(d6.role()) );
        }

        boolean hasNightBlade = d10.role() <= 5;
        if (hasNightBlade) {
            IsDice d2 = new D2();
            int nightBladeLevel = 6 + d2.role();
            Elf nightBlade = createSpellSword(nightBladeLevel);
            nightBlade.setNightBlade(true);

            fastness.add(nightBlade);
        }

        boolean hasAnimals = d10.role() <= 7;
        if (hasAnimals) {
            int animalNumber = d6.role() + d6.role();
            for (int index = 0; index < animalNumber; index++) {
                GiantHawk hawk = new GiantHawk();
                hawk.roleHitPoints();
                fastness.add(hawk);
            }
        }

        return fastness;
    }


    public static Elf createSpellSword(int hitDice) {
        Elf spellSword = new Elf();
        spellSword.setSpellSword(true);
        spellSword.setHitDice(hitDice);
        spellSword.roleHitPoints();

        return spellSword;
    }

    @Override
    public String getExtraInformation() {
        if (isSpellSword) {
            return "Spell Sword";
        }
        else if (isNightBlade) {
            return "Night Blade";
        }
        else {
            return "";
        }
    }

    @Override
    public int getAdditionalHitPoints() {
        return 1;
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    public void setSpellSword(boolean isSpellSword) {
        this.isSpellSword = isSpellSword;
    }

    public void setNightBlade(boolean isNightBlade) {
        this.isNightBlade = isNightBlade;
    }
}
