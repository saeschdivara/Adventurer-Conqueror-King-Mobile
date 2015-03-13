package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class ElvenRanger extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2275;
    }

    @Override
    protected long getLevel3Experience() {
        return 4550;
    }

    @Override
    protected long getLevel4Experience() {
        return 9100;
    }

    @Override
    protected long getLevel5Experience() {
        return 18200;
    }

    @Override
    protected long getLevel6Experience() {
        return 36400;
    }

    @Override
    protected long getLevel7Experience() {
        return 75000;
    }

    @Override
    protected long getLevel8Experience() {
        return 150000;
    }

    @Override
    protected long getLevel9Experience() {
        return 300000;
    }

    @Override
    protected long getLevel10Experience() {
        return 450000;
    }

    @Override
    protected long getLevel11Experience() {
        return 600000;
    }

    @Override
    protected long getLevel12Experience() {
        return 750000;
    }

    @Override
    protected long getLevel13Experience() {
        return 900000;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Archer";
    }

    @Override
    protected String getLevel2Title() {
        return "Rover";
    }

    @Override
    protected String getLevel3Title() {
        return "Forester";
    }

    @Override
    protected String getLevel4Title() {
        return "Courser";
    }

    @Override
    protected String getLevel5Title() {
        return "Patroller";
    }

    @Override
    protected String getLevel6Title() {
        return "Keeper";
    }

    @Override
    protected String getLevel7Title() {
        return "Protector";
    }

    @Override
    protected String getLevel8Title() {
        return "Steward";
    }

    @Override
    protected String getLevel9Title() {
        return "Ranger";
    }

    @Override
    protected String getLevel10Title() {
        return "Ranger (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Ranger (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Ranger (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Ranger (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return null;
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(14);
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
        return getSaving(16);
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
            default:
                return -1;
        }
    }
}
