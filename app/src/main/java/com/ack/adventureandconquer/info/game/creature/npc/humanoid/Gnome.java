package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 22/01/15.
 */
public class Gnome extends Npc {

    private boolean isSquadLeader = false;
    private boolean isSubChieftain = false;
    private boolean isGrandChieftain = false;

    public static List<Npc> getSquad() {
        List<Npc> squad = new ArrayList<>();
        int squadSize = d8.role();

        for (int index = 0; index < squadSize; index++) {
            Gnome gnome = new Gnome();
            gnome.roleHitPoints();

            squad.add(gnome);
        }

        Gnome leader = new Gnome();
        leader.setSquadLeader(true);
        leader.setHitDice(2);
        leader.setHitPoints(11);
        squad.add(leader);

        return squad;
    }

    public static List<Npc> getCompany() {
        List<Npc> company = new ArrayList<>();
        int companySize = d10.role();

        for (int index = 0; index < companySize; index++) {
            List<Npc> squad = getSquad();
            company.addAll(squad);
        }

        Gnome subChieftain = createSubChieftain();

        return company;
    }

    public static List<Npc> getVault() {
        List<Npc> vault = new ArrayList<>();
        int companySize = d10.role();

        for (int index = 0; index < companySize; index++) {
            List<Npc> company = getCompany();
            vault.addAll(company);
        }

        Gnome grandChieftain = new Gnome();
        grandChieftain.setGrandChieftain(true);
        grandChieftain.setHitDice(4);
        grandChieftain.setHitPoints(18);

        vault.add(grandChieftain);

        int bodyguardsNumber = d6.role();
        for (int index = 0; index < bodyguardsNumber; index++) {
            Gnome bodyGuard = createSubChieftain();
            vault.add(bodyGuard);
        }

        return vault;
    }

    public static Gnome createSubChieftain() {
        Gnome subChieftain = new Gnome();
        subChieftain.setSubChieftain(true);
        subChieftain.setHitDice(3);
        subChieftain.setHitPoints(d4.role() + 9);

        return subChieftain;
    }

    @Override
    public String getExtraInformation() {

        if (isSquadLeader) {
            return "Squad Leader";
        }
        else if (isSubChieftain) {
            return "Sub Chieftain";
        }
        else if (isGrandChieftain) {
            return "Grand Chieftain\n+1 bonus on damage rolls";
        }

        return "";
    }

    @Override
    public int getDefaultArmorClass() {
        return 1;
    }

    @Override
    public int getDefaultHitDice() {
        return 1;
    }

    public void setSquadLeader(boolean isSquadLeader) {
        this.isSquadLeader = isSquadLeader;
    }

    public void setSubChieftain(boolean isSubChieftain) {
        this.isSubChieftain = isSubChieftain;
    }

    public void setGrandChieftain(boolean isGrandChieftain) {
        this.isGrandChieftain = isGrandChieftain;
    }
}
