package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Thief extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 1250;
    }

    @Override
    protected long getLevel3Experience() {
        return 2500;
    }

    @Override
    protected long getLevel4Experience() {
        return 5000;
    }

    @Override
    protected long getLevel5Experience() {
        return 10000;
    }

    @Override
    protected long getLevel6Experience() {
        return 20000;
    }

    @Override
    protected long getLevel7Experience() {
        return 40000;
    }

    @Override
    protected long getLevel8Experience() {
        return 80000;
    }

    @Override
    protected long getLevel9Experience() {
        return 180000;
    }

    @Override
    protected long getLevel10Experience() {
        return 280000;
    }

    @Override
    protected long getLevel11Experience() {
        return 380000;
    }

    @Override
    protected long getLevel12Experience() {
        return 480000;
    }

    @Override
    protected long getLevel13Experience() {
        return 580000;
    }

    @Override
    protected long getLevel14Experience() {
        return 680000;
    }

    @Override
    protected String getLevel1Title() {
        return "Footpad";
    }

    @Override
    protected String getLevel2Title() {
        return "Hood";
    }

    @Override
    protected String getLevel3Title() {
        return "Robber";
    }

    @Override
    protected String getLevel4Title() {
        return "Burglar";
    }

    @Override
    protected String getLevel5Title() {
        return "Rogue";
    }

    @Override
    protected String getLevel6Title() {
        return "Scoundrel";
    }

    @Override
    protected String getLevel7Title() {
        return "Pilferer";
    }

    @Override
    protected String getLevel8Title() {
        return "Thief";
    }

    @Override
    protected String getLevel9Title() {
        return "Master Thief";
    }

    @Override
    protected String getLevel10Title() {
        return "Master Thief (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Master Thief (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Master Thief (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Master Thief (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Prince of Thieves";
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
        return getSaving(16);
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
            case 13:
            case 14:
                return startingPoint - 6;
            default:
                return -1;
        }
    }
}
