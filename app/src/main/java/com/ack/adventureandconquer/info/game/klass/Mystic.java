package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Mystic extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2450;
    }

    @Override
    protected long getLevel3Experience() {
        return 4900;
    }

    @Override
    protected long getLevel4Experience() {
        return 9800;
    }

    @Override
    protected long getLevel5Experience() {
        return 19600;
    }

    @Override
    protected long getLevel6Experience() {
        return 39200;
    }

    @Override
    protected long getLevel7Experience() {
        return 80000;
    }

    @Override
    protected long getLevel8Experience() {
        return 160000;
    }

    @Override
    protected long getLevel9Experience() {
        return 280000;
    }

    @Override
    protected long getLevel10Experience() {
        return 400000;
    }

    @Override
    protected long getLevel11Experience() {
        return 520000;
    }

    @Override
    protected long getLevel12Experience() {
        return 640000;
    }

    @Override
    protected long getLevel13Experience() {
        return 760000;
    }

    @Override
    protected long getLevel14Experience() {
        return 880000;
    }

    @Override
    protected String getLevel1Title() {
        return "Aspirant";
    }

    @Override
    protected String getLevel2Title() {
        return "Novice";
    }

    @Override
    protected String getLevel3Title() {
        return "Initiate";
    }

    @Override
    protected String getLevel4Title() {
        return "Disciple";
    }

    @Override
    protected String getLevel5Title() {
        return "Immaculate";
    }

    @Override
    protected String getLevel6Title() {
        return "Preceptor";
    }

    @Override
    protected String getLevel7Title() {
        return "Master";
    }

    @Override
    protected String getLevel8Title() {
        return "Superior Master";
    }

    @Override
    protected String getLevel9Title() {
        return "Enlightened Master";
    }

    @Override
    protected String getLevel10Title() {
        return "Enlightened Master (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Enlightened Master (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Enlightened Master (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Enlightened Master (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Hierophant";
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(15);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(14);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(16);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(17);
    }

    @Override
    public int getAttackThrow() {
        return getSaving(10);
    }

    private int getSaving(int startingPoint) {

        switch (getLevel()) {
            case 1:
                return startingPoint;
            case 2:
            case 3:
                return startingPoint - 1;
            case 4:
                return startingPoint - 2;
            case 5:
            case 6:
                return startingPoint - 3;
            case 7:
                return startingPoint - 4;
            case 8:
            case 9:
                return startingPoint - 5;
            case 10:
                return startingPoint - 6;
            case 11:
            case 12:
                return startingPoint - 7;
            case 13:
                return startingPoint - 8;
            case 14:
                return startingPoint - 9;
            default:
                return -1;
        }
    }
}
