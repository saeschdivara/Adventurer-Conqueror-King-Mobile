package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class ZaharanRuinguard extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 3850;
    }

    @Override
    protected long getLevel3Experience() {
        return 7700;
    }

    @Override
    protected long getLevel4Experience() {
        return 15400;
    }

    @Override
    protected long getLevel5Experience() {
        return 30800;
    }

    @Override
    protected long getLevel6Experience() {
        return 61600;
    }

    @Override
    protected long getLevel7Experience() {
        return 125000;
    }

    @Override
    protected long getLevel8Experience() {
        return 250000;
    }

    @Override
    protected long getLevel9Experience() {
        return 425000;
    }

    @Override
    protected long getLevel10Experience() {
        return 600000;
    }

    @Override
    protected long getLevel11Experience() {
        return 775000;
    }

    @Override
    protected long getLevel12Experience() {
        return 950000;
    }

    @Override
    protected long getLevel13Experience() {
        return 9500000;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Insignificant";
    }

    @Override
    protected String getLevel2Title() {
        return "Ruinborn";
    }

    @Override
    protected String getLevel3Title() {
        return "Ruinchild";
    }

    @Override
    protected String getLevel4Title() {
        return "Son of Ruin";
    }

    @Override
    protected String getLevel5Title() {
        return "Ruinwielder";
    }

    @Override
    protected String getLevel6Title() {
        return "Ruinscourge";
    }

    @Override
    protected String getLevel7Title() {
        return "Ruinmaster";
    }

    @Override
    protected String getLevel8Title() {
        return "Father of Ruin";
    }

    @Override
    protected String getLevel9Title() {
        return "Lord of Ruin";
    }

    @Override
    protected String getLevel10Title() {
        return "Lord of Secrets";
    }

    @Override
    protected String getLevel11Title() {
        return "Lord of Bindings";
    }

    @Override
    protected String getLevel12Title() {
        return "Prince of Ruin";
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
        return getSaving(13);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(14);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(14);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(14);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(15);
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
            default:
                return -1;
        }
    }
}
