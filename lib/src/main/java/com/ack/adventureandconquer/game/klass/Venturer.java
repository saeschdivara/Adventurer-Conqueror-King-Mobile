package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Venturer extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 1525;
    }

    @Override
    protected long getLevel3Experience() {
        return 3050;
    }

    @Override
    protected long getLevel4Experience() {
        return 6100;
    }

    @Override
    protected long getLevel5Experience() {
        return 12200;
    }

    @Override
    protected long getLevel6Experience() {
        return 24400;
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
        return "Tinker";
    }

    @Override
    protected String getLevel2Title() {
        return "Trader";
    }

    @Override
    protected String getLevel3Title() {
        return "Arbitrager";
    }

    @Override
    protected String getLevel4Title() {
        return "Commissary";
    }

    @Override
    protected String getLevel5Title() {
        return "Mercantilist";
    }

    @Override
    protected String getLevel6Title() {
        return "Enterpriser";
    }

    @Override
    protected String getLevel7Title() {
        return "Venturer";
    }

    @Override
    protected String getLevel8Title() {
        return "Merchant Venturer";
    }

    @Override
    protected String getLevel9Title() {
        return "Merchant Prince";
    }

    @Override
    protected String getLevel10Title() {
        return "Merchant Prince (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Merchant Prince (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Merchant Prince (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Merchant Prince (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Mogul";
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
