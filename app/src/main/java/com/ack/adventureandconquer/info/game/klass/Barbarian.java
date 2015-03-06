package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Barbarian extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2600;
    }

    @Override
    protected long getLevel3Experience() {
        return 5200;
    }

    @Override
    protected long getLevel4Experience() {
        return 10400;
    }

    @Override
    protected long getLevel5Experience() {
        return 20800;
    }

    @Override
    protected long getLevel6Experience() {
        return 41600;
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
        return 290000;
    }

    @Override
    protected long getLevel10Experience() {
        return 410000;
    }

    @Override
    protected long getLevel11Experience() {
        return 530000;
    }

    @Override
    protected long getLevel12Experience() {
        return 650000;
    }

    @Override
    protected long getLevel13Experience() {
        return 770000;
    }

    @Override
    protected long getLevel14Experience() {
        return 890000;
    }

    @Override
    protected String getLevel1Title() {
        return "Hunter";
    }

    @Override
    protected String getLevel2Title() {
        return "Raider";
    }

    @Override
    protected String getLevel3Title() {
        return "Marauder";
    }

    @Override
    protected String getLevel4Title() {
        return "Plunderer";
    }

    @Override
    protected String getLevel5Title() {
        return "Reaver";
    }

    @Override
    protected String getLevel6Title() {
        return "Bloodletter";
    }

    @Override
    protected String getLevel7Title() {
        return "Menace";
    }

    @Override
    protected String getLevel8Title() {
        return "Scourge";
    }

    @Override
    protected String getLevel9Title() {
        return "Warchief";
    }

    @Override
    protected String getLevel10Title() {
        return "Warchief (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Warchief (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Warchief (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Warchief (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Great Chieftain";
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
            case 13:
                return startingPoint - 8;
            case 14:
                return startingPoint - 9;
            default:
                return -1;
        }
    }
}
