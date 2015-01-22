package com.ack.adventureandconquer.info.game.creature.npc.unusual;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;
import com.ack.adventureandconquer.info.game.dice.D100;
import com.ack.adventureandconquer.info.game.dice.IsDice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 19/01/15.
 */
public class Centaur extends Npc {

    private static IsDice d100 = new D100();

    private boolean isChieftain = false;
    private boolean isCleric = false;
    private int clericLevel = 0;
    private Type type = Type.MALE;

    public static List<Npc> getPack() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d10.role() + d10.role();

        // Create chieftain
        Centaur chieftain = createChieftain();
        pack.add(chieftain);

        // Create pack
        for (int i = 1; i <= packSize; i++) {
            Centaur centaur = new Centaur();
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        return pack;
    }

    public static List<Npc> getLair() {
        List<Npc> pack = new ArrayList<>();
        int packSize = d10.role() + d10.role();

        // Create chieftain
        Centaur chieftain = createChieftain();
        pack.add(chieftain);

        int partMale = packSize;
        int partFemale = packSize / 2;
        int partYoung = packSize / 2;

        // Create male
        for (int i = 1; i <= partMale; i++) {
            Centaur centaur = new Centaur();
            centaur.setType(Type.MALE);
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        // Create female
        for (int i = 1; i <= partFemale; i++) {
            Centaur centaur = new Centaur();
            centaur.setType(Type.FEMALE);
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        // Create young
        for (int i = 1; i <= partYoung; i++) {
            Centaur centaur = new Centaur();
            centaur.setType(Type.YOUNG);
            centaur.roleHitPoints();

            pack.add(centaur);
        }

        return pack;
    }

    private static Centaur createChieftain() {
        Centaur chieftain = new Centaur();
        chieftain.setArmorClass(6);
        chieftain.setHitDice(5);
        chieftain.setHitPoints(29);

        chieftain.setChieftain(true);
        chieftain.setCleric(d100.role());

        if (chieftain.isCleric()) {
            chieftain.setClericLevel(d6.role());
        }

        return chieftain;
    }

    @Override
    public String getExtraInformation() {
        if (isChieftain) {
            String extra = "Rank: Chieftain\n";

            extra += "+2 bonus to damage rolls\n";

            if (isCleric) {
                extra += "Cleric level: " + String.valueOf(clericLevel) + "\n";
            }

            return extra;
        }
        else {
            return type.toString();
        }
    }

    @Override
    public int getDefaultArmorClass() {
        return 4;
    }

    @Override
    public int getDefaultHitDice() {
        if (type == Type.MALE)
            return 4;
        else if (type == Type.FEMALE)
            return 3;
        else
            return 2;
    }

    public boolean isChieftain() {
        return isChieftain;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }

    public boolean isCleric() {
        return isCleric;
    }

    public void setCleric(int number) {
        if (number < 50) {
            isCleric = false;
        }
        else {
            isCleric = true;
        }
    }

    public int getClericLevel() {
        return clericLevel;
    }

    public void setClericLevel(int clericLevel) {
        this.clericLevel = clericLevel;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private enum Type {
        MALE,
        FEMALE,
        YOUNG
    }
}
