package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class DwarvenDelver extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2000;
    }

    @Override
    protected long getLevel3Experience() {
        return 4000;
    }

    @Override
    protected long getLevel4Experience() {
        return 8000;
    }

    @Override
    protected long getLevel5Experience() {
        return 16000;
    }

    @Override
    protected long getLevel6Experience() {
        return 32000;
    }

    @Override
    protected long getLevel7Experience() {
        return 65000;
    }

    @Override
    protected long getLevel8Experience() {
        return 130000;
    }

    @Override
    protected long getLevel9Experience() {
        return 260000;
    }

    @Override
    protected long getLevel10Experience() {
        return 390000;
    }

    @Override
    protected long getLevel11Experience() {
        return 520000;
    }

    @Override
    protected long getLevel12Experience() {
        return 10000000;
    }

    @Override
    protected long getLevel13Experience() {
        return 0;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Dwarven Caver";
    }

    @Override
    protected String getLevel2Title() {
        return "Dwarven Tunneler";
    }

    @Override
    protected String getLevel3Title() {
        return "Dwarven Excavator";
    }

    @Override
    protected String getLevel4Title() {
        return "Dwarven Undertrekker";
    }

    @Override
    protected String getLevel5Title() {
        return "Dwarven Spelunker";
    }

    @Override
    protected String getLevel6Title() {
        return "Dwarven Expeditionary";
    }

    @Override
    protected String getLevel7Title() {
        return "Dwarven Pathfinder";
    }

    @Override
    protected String getLevel8Title() {
        return "Dwarven Delver";
    }

    @Override
    protected String getLevel9Title() {
        return "Dwarven Pioneer";
    }

    @Override
    protected String getLevel10Title() {
        return "Dwarven Pioneer (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Dwarven Pioneer (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return null;
    }

    @Override
    protected String getLevel13Title() {
        return null;
    }

    @Override
    protected String getLevel14Title() {
        return null;
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(9);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(9);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(13);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(10);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(11);
    }

    @Override
    public int getAttackThrow() {
        return getSaving(10);
    }

    private int getSaving(int startingPoint) {

        switch (getLevel()) {
            case 1:
            case 2:
                return startingPoint;
            case 3:
            case 4:
                return startingPoint - 1;
            case 5:
            case 6:
                return startingPoint - 2;
            case 7:
            case 8:
                return startingPoint - 3;
            case 9:
            case 10:
                return startingPoint - 4;
            case 11:
                return startingPoint - 5;
            default:
                return -1;
        }
    }
}
