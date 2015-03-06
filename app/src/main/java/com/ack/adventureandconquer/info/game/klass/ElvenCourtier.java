package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class ElvenCourtier extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2600;
    }

    @Override
    protected long getLevel3Experience() {
        return 5200;
    }

    @Override
    protected long getLevel4Experience() {
        return 10400;
    }

    @Override
    protected long getLevel5Experience() {
        return 20800;
    }

    @Override
    protected long getLevel6Experience() {
        return 41600;
    }

    @Override
    protected long getLevel7Experience() {
        return 85000;
    }

    @Override
    protected long getLevel8Experience() {
        return 170000;
    }

    @Override
    protected long getLevel9Experience() {
        return 370000;
    }

    @Override
    protected long getLevel10Experience() {
        return 520000;
    }

    @Override
    protected long getLevel11Experience() {
        return 670000;
    }

    @Override
    protected long getLevel12Experience() {
        return 820000;
    }

    @Override
    protected long getLevel13Experience() {
        return 1000000;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Attendant";
    }

    @Override
    protected String getLevel2Title() {
        return "Courtier";
    }

    @Override
    protected String getLevel3Title() {
        return "Aristocrat";
    }

    @Override
    protected String getLevel4Title() {
        return "Noble";
    }

    @Override
    protected String getLevel5Title() {
        return "Exemplar";
    }

    @Override
    protected String getLevel6Title() {
        return "Patrician";
    }

    @Override
    protected String getLevel7Title() {
        return "Dignitary";
    }

    @Override
    protected String getLevel8Title() {
        return "Consul";
    }

    @Override
    protected String getLevel9Title() {
        return "Lord";
    }

    @Override
    protected String getLevel10Title() {
        return "Lord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Lord (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Lord (XII)";
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
        return getSaving(12);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(13);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(14);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(14);
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
            case 12:
                return startingPoint - 5;
            default:
                return -1;
        }
    }
}
