package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class DwarvenCraftpriest extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2650;
    }

    @Override
    protected long getLevel3Experience() {
        return 5300;
    }

    @Override
    protected long getLevel4Experience() {
        return 10600;
    }

    @Override
    protected long getLevel5Experience() {
        return 21200;
    }

    @Override
    protected long getLevel6Experience() {
        return 42500;
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
        return 300000;
    }

    @Override
    protected long getLevel10Experience() {
        return 430000;
    }

    @Override
    protected long getLevel11Experience() {
        return 10000000;
    }

    @Override
    protected long getLevel12Experience() {
        return 0;
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
        return "Dwarven Craft-Catechist";
    }

    @Override
    protected String getLevel2Title() {
        return "Dwarven Craft-Acolyte";
    }

    @Override
    protected String getLevel3Title() {
        return "Dwarven Craftpriest";
    }

    @Override
    protected String getLevel4Title() {
        return "Dwarven Craft-Curate";
    }

    @Override
    protected String getLevel5Title() {
        return "Dwarven Craft-Vicar";
    }

    @Override
    protected String getLevel6Title() {
        return "Dwarven Craft-Rector";
    }

    @Override
    protected String getLevel7Title() {
        return "Dwarven Craft-Prelate";
    }

    @Override
    protected String getLevel8Title() {
        return "Dwarven Craft-Bishop";
    }

    @Override
    protected String getLevel9Title() {
        return "Dwarven Craft-Lord";
    }

    @Override
    protected String getLevel10Title() {
        return "Dwarven Craft-Lord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return null;
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
        return getSaving(6);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(13);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(9);
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
            default:
                return -1;
        }
    }
}
