package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class DwarvenMachinist extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2300;
    }

    @Override
    protected long getLevel3Experience() {
        return 4600;
    }

    @Override
    protected long getLevel4Experience() {
        return 9200;
    }

    @Override
    protected long getLevel5Experience() {
        return 18400;
    }

    @Override
    protected long getLevel6Experience() {
        return 36800;
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
        return 280000;
    }

    @Override
    protected long getLevel10Experience() {
        return 410000;
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
        return "Dwarven Apprentice";
    }

    @Override
    protected String getLevel2Title() {
        return "Dwarven Mechanic";
    }

    @Override
    protected String getLevel3Title() {
        return "Dwarven Shaper";
    }

    @Override
    protected String getLevel4Title() {
        return "Dwarven Forger";
    }

    @Override
    protected String getLevel5Title() {
        return "Dwarven Maker";
    }

    @Override
    protected String getLevel6Title() {
        return "Dwarven Engineer";
    }

    @Override
    protected String getLevel7Title() {
        return "Dwarven Artificer";
    }

    @Override
    protected String getLevel8Title() {
        return "Dwarven Machinist";
    }

    @Override
    protected String getLevel9Title() {
        return "Dwarven Master Machinist";
    }

    @Override
    protected String getLevel10Title() {
        return "Dwarven Master Machinist (X)";
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
        return getSaving(9);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(13);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(10);
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
            case 11:
                return startingPoint - 5;
            default:
                return -1;
        }
    }
}
