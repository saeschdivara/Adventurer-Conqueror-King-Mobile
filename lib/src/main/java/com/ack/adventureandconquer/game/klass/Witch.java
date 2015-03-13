package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Witch extends CharacterClass {
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
        return 230000;
    }

    @Override
    protected long getLevel10Experience() {
        return 330000;
    }

    @Override
    protected long getLevel11Experience() {
        return 430000;
    }

    @Override
    protected long getLevel12Experience() {
        return 530000;
    }

    @Override
    protected long getLevel13Experience() {
        return 630000;
    }

    @Override
    protected long getLevel14Experience() {
        return 730000;
    }

    @Override
    protected String getLevel1Title() {
        return "Initiate";
    }

    @Override
    protected String getLevel2Title() {
        return "Seeress";
    }

    @Override
    protected String getLevel3Title() {
        return "Siren";
    }

    @Override
    protected String getLevel4Title() {
        return "Pythoness";
    }

    @Override
    protected String getLevel5Title() {
        return "Sibyl";
    }

    @Override
    protected String getLevel6Title() {
        return "Enchantress";
    }

    @Override
    protected String getLevel7Title() {
        return "Sorceress";
    }

    @Override
    protected String getLevel8Title() {
        return "Incantrix";
    }

    @Override
    protected String getLevel9Title() {
        return "Witch";
    }

    @Override
    protected String getLevel10Title() {
        return "Witch (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Witch (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Witch (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Witch (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Witch Queen";
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
