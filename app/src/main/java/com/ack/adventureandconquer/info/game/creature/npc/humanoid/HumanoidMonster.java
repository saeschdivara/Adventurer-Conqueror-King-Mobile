package com.ack.adventureandconquer.info.game.creature.npc.humanoid;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 26/01/15.
 */
public class HumanoidMonster extends Npc {

    private boolean isChampion = false;
    private boolean isSubChieftain = false;
    private boolean isChieftain = false;
    private boolean isShaman = false;
    private boolean isWitchDoctor = false;

    private int clericalLevel = 0;
    private int mageLevel = 0;

    private Type type = Type.MALE;

    public boolean isChampion() {
        return isChampion;
    }

    public boolean isSubChieftain() {
        return isSubChieftain;
    }

    public boolean isChieftain() {
        return isChieftain;
    }

    public boolean isShaman() {
        return isShaman;
    }

    public boolean isWitchDoctor() {
        return isWitchDoctor;
    }

    public int getClericalLevel() {
        return clericalLevel;
    }

    public int getMageLevel() {
        return mageLevel;
    }

    public Type getType() {
        return type;
    }

    public void setChieftain(boolean isChieftain) {
        this.isChieftain = isChieftain;
    }

    public void setSubChieftain(boolean isSubChieftain) {
        this.isSubChieftain = isSubChieftain;
    }

    public void setChampion(boolean isChampion) {
        this.isChampion = isChampion;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setShaman(boolean isShaman) {
        this.isShaman = isShaman;
    }

    public void setWitchDoctor(boolean isWitchDoctor) {
        this.isWitchDoctor = isWitchDoctor;
    }

    public void setClericalLevel(int clericalLevel) {
        this.clericalLevel = clericalLevel;
    }

    public void setMageLevel(int mageLevel) {
        this.mageLevel = mageLevel;
    }

    public enum Type  {
        MALE,
        FEMALE,
        YOUNG;

        public static Type fromString(String str) {
            if (str.equals("FEMALE")) {
                return FEMALE;
            }
            else if (str.equals("YOUNG")) {
                return YOUNG;
            }
            else {
                return MALE;
            }
        }

        @Override
        public String toString() {
            if (this.equals(MALE)) {
                return "MALE";
            }
            else if (this.equals(FEMALE)) {
                return "FEMALE";
            }
            else if (this.equals(YOUNG)) {
                return "YOUNG";
            }
            else {
                return null;
            }
        }


    }
}
