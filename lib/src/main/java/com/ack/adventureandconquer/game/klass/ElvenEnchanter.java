package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class ElvenEnchanter extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2700;
    }

    @Override
    protected long getLevel3Experience() {
        return 5400;
    }

    @Override
    protected long getLevel4Experience() {
        return 10800;
    }

    @Override
    protected long getLevel5Experience() {
        return 21600;
    }

    @Override
    protected long getLevel6Experience() {
        return 43200;
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
        return 370000;
    }

    @Override
    protected long getLevel10Experience() {
        return 570000;
    }

    @Override
    protected long getLevel11Experience() {
        return 770000;
    }

    @Override
    protected long getLevel12Experience() {
        return 970000;
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
        return "Prestidigitator";
    }

    @Override
    protected String getLevel2Title() {
        return "Glamourer";
    }

    @Override
    protected String getLevel3Title() {
        return "Charmer";
    }

    @Override
    protected String getLevel4Title() {
        return "Beguiler";
    }

    @Override
    protected String getLevel5Title() {
        return "Spellbinder";
    }

    @Override
    protected String getLevel6Title() {
        return "Bewitcher";
    }

    @Override
    protected String getLevel7Title() {
        return "Ensorceller";
    }

    @Override
    protected String getLevel8Title() {
        return "Illusionist";
    }

    @Override
    protected String getLevel9Title() {
        return "Enchanter";
    }

    @Override
    protected String getLevel10Title() {
        return "Enchanter (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Enchanter (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Enchanter (XII)";
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
        return getSaving(12);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(13);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(15);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(11);
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
            case 3:
                return startingPoint;
            case 4:
            case 5:
            case 6:
                return startingPoint - 1;
            case 7:
            case 8:
            case 9:
                return startingPoint - 2;
            case 10:
            case 11:
            case 12:
                return startingPoint - 3;
            default:
                return -1;
        }
    }
}
