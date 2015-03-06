package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class GnomishTrickster extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2475;
    }

    @Override
    protected long getLevel3Experience() {
        return 4950;
    }

    @Override
    protected long getLevel4Experience() {
        return 9900;
    }

    @Override
    protected long getLevel5Experience() {
        return 19800;
    }

    @Override
    protected long getLevel6Experience() {
        return 39600;
    }

    @Override
    protected long getLevel7Experience() {
        return 80000;
    }

    @Override
    protected long getLevel8Experience() {
        return 160000;
    }

    @Override
    protected long getLevel9Experience() {
        return 310000;
    }

    @Override
    protected long getLevel10Experience() {
        return 460000;
    }

    @Override
    protected long getLevel11Experience() {
        return 610000;
    }

    @Override
    protected long getLevel12Experience() {
        return 760000;
    }

    @Override
    protected long getLevel13Experience() {
        return 10000000;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Gnomish Scamp";
    }

    @Override
    protected String getLevel2Title() {
        return "Gnomish Knave";
    }

    @Override
    protected String getLevel3Title() {
        return "Gnomish Prankster";
    }

    @Override
    protected String getLevel4Title() {
        return "Gnomish Rapscallion";
    }

    @Override
    protected String getLevel5Title() {
        return "Gnomish Scapegrace";
    }

    @Override
    protected String getLevel6Title() {
        return "Gnomish Rogue";
    }

    @Override
    protected String getLevel7Title() {
        return "Gnomish Scoundrel";
    }

    @Override
    protected String getLevel8Title() {
        return "Gnomish Trickster";
    }

    @Override
    protected String getLevel9Title() {
        return "Gnomish Mastermind";
    }

    @Override
    protected String getLevel10Title() {
        return "Gnomish Mastermind (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Gnomish Mastermind (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Gnomish Mastermind (XII)";
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
            default:
                return -1;
        }
    }
}
