package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Warlock extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2075;
    }

    @Override
    protected long getLevel3Experience() {
        return 4150;
    }

    @Override
    protected long getLevel4Experience() {
        return 8300;
    }

    @Override
    protected long getLevel5Experience() {
        return 16600;
    }

    @Override
    protected long getLevel6Experience() {
        return 33200;
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
        return 280000;
    }

    @Override
    protected long getLevel10Experience() {
        return 430000;
    }

    @Override
    protected long getLevel11Experience() {
        return 580000;
    }

    @Override
    protected long getLevel12Experience() {
        return 730000;
    }

    @Override
    protected long getLevel13Experience() {
        return 880000;
    }

    @Override
    protected long getLevel14Experience() {
        return 1030000;
    }

    @Override
    protected String getLevel1Title() {
        return "Medium";
    }

    @Override
    protected String getLevel2Title() {
        return "Occultist";
    }

    @Override
    protected String getLevel3Title() {
        return "Spiritualist";
    }

    @Override
    protected String getLevel4Title() {
        return "Hexgiver";
    }

    @Override
    protected String getLevel5Title() {
        return "Cursebringer";
    }

    @Override
    protected String getLevel6Title() {
        return "Necromancer";
    }

    @Override
    protected String getLevel7Title() {
        return "Incantationist";
    }

    @Override
    protected String getLevel8Title() {
        return "Warlock";
    }

    @Override
    protected String getLevel9Title() {
        return "Dread Lord";
    }

    @Override
    protected String getLevel10Title() {
        return "Dread Lord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Dread Lord (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Dread Lord (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Dread Lord (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Dread King";
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(13);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(13);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(15);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(11);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(12);
    }

    @Override
    public int getAttackThrow() {
        return getSaving(10);
    }

    private int getSaving(int startingPoint) {

        switch (getLevel()) {
            case 1:
            case 2:
            case 3:
                return startingPoint;
            case 4:
            case 5:
            case 6:
                return startingPoint - 1;
            case 7:
            case 8:
            case 9:
                return startingPoint - 2;
            case 10:
            case 11:
            case 12:
                return startingPoint - 3;
            default:
                return -1;
        }
    }
}
