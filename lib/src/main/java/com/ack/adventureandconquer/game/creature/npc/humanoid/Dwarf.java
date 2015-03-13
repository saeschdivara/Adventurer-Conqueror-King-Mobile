package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.creature.npc.animal.BrownBear;
import com.ack.adventureandconquer.game.creature.npc.animal.WarDog;
import com.ack.adventureandconquer.game.dice.D12;
import com.ack.adventureandconquer.game.dice.D2;
import com.ack.adventureandconquer.game.dice.D4;
import com.ack.adventureandconquer.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Dwarf extends Npc {

    private static D12 d12 = new D12();

    private boolean isVaultGuard = false;
    private boolean isCraftPriest = false;

    public static List<Npc> getCompany() {
        List<Npc> company = new ArrayList<>();
        int companySize = d12.role();

        for (int i = 0; i < companySize; i++) {
            Dwarf dwarf = new Dwarf();
            dwarf.roleHitPoints();

            company.add(dwarf);
        }

        Dwarf vaultguard = createVaultGuard();
        company.add(vaultguard);

        return company;
    }

    public static List<Npc> getVault() {
        List<Npc> companies = new ArrayList<>();
        int companyNumber = d10.role();

        for (int i = 0; i < companyNumber; i++) {
            List<Npc> company = getCompany();

            companies.addAll(company);
        }

        Dwarf vaultLord = new Dwarf();
        vaultLord.setVaultGuard(true);
        vaultLord.setHitDice(9);
        vaultLord.roleHitPoints();

        companies.add(vaultLord);

        int guardsNumber = d6.role() + d6.role();
        for (int j = 0; j < guardsNumber; j++) {
            companies.add(createVaultGuard());
        }

        IsDice d2 = new D2();

        boolean hasPriest = d10.role() >= 5;
        if (hasPriest) {
            Dwarf priest = new Dwarf();
            priest.setCraftPriest(true);

            int priestLevel = 6 + d2.role();

            priest.setHitDice(priestLevel);
            priest.roleHitPoints();

            companies.add(priest);
        }

        boolean hasAnimals = d10.role() >= 6;
        if (hasAnimals) {
            boolean isDogs = d12.role() < 6;

            IsDice d4 = new D4();

            if (isDogs) {
                // DOGS
                int dogsNumber = d4.role() + d4.role() + d4.role() + d4.role() + d4.role();

                for (int i = 0; i < dogsNumber; i++) {
                    WarDog dog = new WarDog();
                    dog.roleHitPoints();

                    companies.add(dog);
                }
            }
            else {
                // BEARS
                int bearsNumber = d4.role() + d4.role();

                for (int i = 0; i < bearsNumber; i++) {
                    BrownBear bear = new BrownBear();
                    bear.roleHitPoints();

                    companies.add(bear);
                }
            }
        }

        return companies;
    }

    private static Dwarf createVaultGuard() {
        Dwarf vaultguard = new Dwarf();
        vaultguard.setVaultGuard(true);

        int level = d4.role();
        vaultguard.setHitDice(level);
        vaultguard.roleHitPoints();
        vaultguard.setHitPoints(vaultguard.getHitPoints() + 1);

        return vaultguard;
    }

    @Override
    public int getDefaultArmorClass() {
        return 5;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    @Override
    public String getExtraInformation() {
        if (isVaultGuard) {
            return "Vault Guard";
        }
        else if (isCraftPriest) {
            return "Craft Priest";
        }
        else {
            return "";
        }
    }

    public void setVaultGuard(boolean isVaultGuard) {
        this.isVaultGuard = isVaultGuard;
    }

    public void setCraftPriest(boolean isCraftPriest) {
        this.isCraftPriest = isCraftPriest;
    }
}
