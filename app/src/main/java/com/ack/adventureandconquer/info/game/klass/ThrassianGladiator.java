package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class ThrassianGladiator extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 3000;
    }

    @Override
    protected long getLevel3Experience() {
        return 6000;
    }

    @Override
    protected long getLevel4Experience() {
        return 12000;
    }

    @Override
    protected long getLevel5Experience() {
        return 24000;
    }

    @Override
    protected long getLevel6Experience() {
        return 48000;
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
        return 400000;
    }

    @Override
    protected long getLevel10Experience() {
        return 800000;
    }

    @Override
    protected long getLevel11Experience() {
        return 1600000;
    }

    @Override
    protected long getLevel12Experience() {
        return 16000000;
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
        return "Thrassian Pitfighter";
    }

    @Override
    protected String getLevel2Title() {
        return "Thrassian Gladiator";
    }

    @Override
    protected String getLevel3Title() {
        return "Thrassian Clawmaster";
    }

    @Override
    protected String getLevel4Title() {
        return "Thrassian Hero";
    }

    @Override
    protected String getLevel5Title() {
        return "Thrassian Exemplar";
    }

    @Override
    protected String getLevel6Title() {
        return "Thrassian Myrmidon";
    }

    @Override
    protected String getLevel7Title() {
        return "Thrassian Champion";
    }

    @Override
    protected String getLevel8Title() {
        return "Thrassian Epic Hero";
    }

    @Override
    protected String getLevel9Title() {
        return "Thrassian Warlord";
    }

    @Override
    protected String getLevel10Title() {
        return "Thrassian Warlord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Thrassian Warlord (XI)";
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
                return startingPoint - 7;
            default:
                return -1;
        }
    }
}
