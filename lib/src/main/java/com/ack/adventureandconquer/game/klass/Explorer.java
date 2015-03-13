package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Explorer extends CharacterClass {
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
        return 250000;
    }

    @Override
    protected long getLevel10Experience() {
        return 370000;
    }

    @Override
    protected long getLevel11Experience() {
        return 490000;
    }

    @Override
    protected long getLevel12Experience() {
        return 610000;
    }

    @Override
    protected long getLevel13Experience() {
        return 730000;
    }

    @Override
    protected long getLevel14Experience() {
        return 850000;
    }

    @Override
    protected String getLevel1Title() {
        return "Scout";
    }

    @Override
    protected String getLevel2Title() {
        return "Outrider";
    }

    @Override
    protected String getLevel3Title() {
        return "Forester";
    }

    @Override
    protected String getLevel4Title() {
        return "Explorer";
    }

    @Override
    protected String getLevel5Title() {
        return "Guide";
    }

    @Override
    protected String getLevel6Title() {
        return "Tracker";
    }

    @Override
    protected String getLevel7Title() {
        return "Pathfinder";
    }

    @Override
    protected String getLevel8Title() {
        return "Ranger";
    }

    @Override
    protected String getLevel9Title() {
        return "Warden";
    }

    @Override
    protected String getLevel10Title() {
        return "Warden (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Warden (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Warden (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Warden (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Lord Warden";
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
