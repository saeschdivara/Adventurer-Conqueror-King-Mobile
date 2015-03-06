package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class DwarvenFury extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 3100;
    }

    @Override
    protected long getLevel3Experience() {
        return 6200;
    }

    @Override
    protected long getLevel4Experience() {
        return 12400;
    }

    @Override
    protected long getLevel5Experience() {
        return 24800;
    }

    @Override
    protected long getLevel6Experience() {
        return 49600;
    }

    @Override
    protected long getLevel7Experience() {
        return 100000;
    }

    @Override
    protected long getLevel8Experience() {
        return 200000;
    }

    @Override
    protected long getLevel9Experience() {
        return 330000;
    }

    @Override
    protected long getLevel10Experience() {
        return 460000;
    }

    @Override
    protected long getLevel11Experience() {
        return 590000;
    }

    @Override
    protected long getLevel12Experience() {
        return 720000;
    }

    @Override
    protected long getLevel13Experience() {
        return 850000;
    }

    @Override
    protected long getLevel14Experience() {
        return 10000000;
    }

    @Override
    protected String getLevel1Title() {
        return "Dwarven Grudgebearer";
    }

    @Override
    protected String getLevel2Title() {
        return "Dwarven Punisher";
    }

    @Override
    protected String getLevel3Title() {
        return "Dwarven Repriser";
    }

    @Override
    protected String getLevel4Title() {
        return "Dwarven Vindicator";
    }

    @Override
    protected String getLevel5Title() {
        return "Dwarven Retaliator";
    }

    @Override
    protected String getLevel6Title() {
        return "Dwarven Castigator";
    }

    @Override
    protected String getLevel7Title() {
        return "Dwarven Scourge";
    }

    @Override
    protected String getLevel8Title() {
        return "Dwarven Fury";
    }

    @Override
    protected String getLevel9Title() {
        return "Dwarven Avenger";
    }

    @Override
    protected String getLevel10Title() {
        return "Dwarven Avenger (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Dwarven Avenger (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Dwarven Avenger (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Dwarven Avenger (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return null;
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(11);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(10);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(13);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(12);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(13);
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
