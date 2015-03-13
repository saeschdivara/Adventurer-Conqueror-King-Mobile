package com.ack.adventureandconquer.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class NobiranWonderworker extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 3125;
    }

    @Override
    protected long getLevel3Experience() {
        return 6250;
    }

    @Override
    protected long getLevel4Experience() {
        return 12500;
    }

    @Override
    protected long getLevel5Experience() {
        return 25000;
    }

    @Override
    protected long getLevel6Experience() {
        return 50000;
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
        return 390000;
    }

    @Override
    protected long getLevel10Experience() {
        return 580000;
    }

    @Override
    protected long getLevel11Experience() {
        return 870000;
    }

    @Override
    protected long getLevel12Experience() {
        return 1060000;
    }

    @Override
    protected long getLevel13Experience() {
        return 10600000;
    }

    @Override
    protected long getLevel14Experience() {
        return 0;
    }

    @Override
    protected String getLevel1Title() {
        return "Divine Arcanist";
    }

    @Override
    protected String getLevel2Title() {
        return "Divine Seer";
    }

    @Override
    protected String getLevel3Title() {
        return "Divine Theurgist";
    }

    @Override
    protected String getLevel4Title() {
        return "Divine Magician";
    }

    @Override
    protected String getLevel5Title() {
        return "Divine Thaumaturge";
    }

    @Override
    protected String getLevel6Title() {
        return "Divine Enchanter";
    }

    @Override
    protected String getLevel7Title() {
        return "Divine Sorcerer";
    }

    @Override
    protected String getLevel8Title() {
        return "Divine Mage";
    }

    @Override
    protected String getLevel9Title() {
        return "Divine Wizard";
    }

    @Override
    protected String getLevel10Title() {
        return "Divine Wizard (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Divine Wizard (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Divine Wizard (XII)";
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
        return getSaving(11);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(11);
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
        return getSaving(10);
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
