package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Assassin extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 1700;
    }

    @Override
    protected long getLevel3Experience() {
        return 3400;
    }

    @Override
    protected long getLevel4Experience() {
        return 6800;
    }

    @Override
    protected long getLevel5Experience() {
        return 14000;
    }

    @Override
    protected long getLevel6Experience() {
        return 28000;
    }

    @Override
    protected long getLevel7Experience() {
        return 55000;
    }

    @Override
    protected long getLevel8Experience() {
        return 110000;
    }

    @Override
    protected long getLevel9Experience() {
        return 230000;
    }

    @Override
    protected long getLevel10Experience() {
        return 350000;
    }

    @Override
    protected long getLevel11Experience() {
        return 470000;
    }

    @Override
    protected long getLevel12Experience() {
        return 590000;
    }

    @Override
    protected long getLevel13Experience() {
        return 710000;
    }

    @Override
    protected long getLevel14Experience() {
        return 830000;
    }

    @Override
    protected String getLevel1Title() {
        return "Thug";
    }

    @Override
    protected String getLevel2Title() {
        return "Enforcer";
    }

    @Override
    protected String getLevel3Title() {
        return "Torturer";
    }

    @Override
    protected String getLevel4Title() {
        return "Slayer";
    }

    @Override
    protected String getLevel5Title() {
        return "Destroyer";
    }

    @Override
    protected String getLevel6Title() {
        return "Executioner";
    }

    @Override
    protected String getLevel7Title() {
        return "Blackguard";
    }

    @Override
    protected String getLevel8Title() {
        return "Assassin";
    }

    @Override
    protected String getLevel9Title() {
        return "Master Assassin";
    }

    @Override
    protected String getLevel10Title() {
        return "Master Assassin (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Master Assassin (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Master Assassin (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Master Assassin (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Grandfather of Assassins";
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
