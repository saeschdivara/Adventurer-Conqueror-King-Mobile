package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Cleric extends CharacterClass {

    @Override
    protected long getLevel2Experience() {
        return 1500;
    }

    @Override
    protected long getLevel3Experience() {
        return 3000;
    }

    @Override
    protected long getLevel4Experience() {
        return 6000;
    }

    @Override
    protected long getLevel5Experience() {
        return 12000;
    }

    @Override
    protected long getLevel6Experience() {
        return 24000;
    }

    @Override
    protected long getLevel7Experience() {
        return 50000;
    }

    @Override
    protected long getLevel8Experience() {
        return 100000;
    }

    @Override
    protected long getLevel9Experience() {
        return 200000;
    }

    @Override
    protected long getLevel10Experience() {
        return 300000;
    }

    @Override
    protected long getLevel11Experience() {
        return 400000;
    }

    @Override
    protected long getLevel12Experience() {
        return 500000;
    }

    @Override
    protected long getLevel13Experience() {
        return 600000;
    }

    @Override
    protected long getLevel14Experience() {
        return 700000;
    }

    @Override
    protected String getLevel1Title() {
        return "Catechist";
    }

    @Override
    protected String getLevel2Title() {
        return "Acolyte";
    }

    @Override
    protected String getLevel3Title() {
        return "Priest";
    }

    @Override
    protected String getLevel4Title() {
        return "Curate";
    }

    @Override
    protected String getLevel5Title() {
        return "Vicar";
    }

    @Override
    protected String getLevel6Title() {
        return "Rector";
    }

    @Override
    protected String getLevel7Title() {
        return "Prelate";
    }

    @Override
    protected String getLevel8Title() {
        return "Bishop";
    }

    @Override
    protected String getLevel9Title() {
        return "Patriarch";
    }

    @Override
    protected String getLevel10Title() {
        return "Patriarch (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Patriarch (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Patriarch (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Patriarch (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Theocrat";
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(13);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(10);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(13);
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
