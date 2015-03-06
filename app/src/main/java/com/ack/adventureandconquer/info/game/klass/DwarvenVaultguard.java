package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class DwarvenVaultguard extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2200;
    }

    @Override
    protected long getLevel3Experience() {
        return 4400;
    }

    @Override
    protected long getLevel4Experience() {
        return 8800;
    }

    @Override
    protected long getLevel5Experience() {
        return 17500;
    }

    @Override
    protected long getLevel6Experience() {
        return 35000;
    }

    @Override
    protected long getLevel7Experience() {
        return 70000;
    }

    @Override
    protected long getLevel8Experience() {
        return 140000;
    }

    @Override
    protected long getLevel9Experience() {
        return 270000;
    }

    @Override
    protected long getLevel10Experience() {
        return 400000;
    }

    @Override
    protected long getLevel11Experience() {
        return 530000;
    }

    @Override
    protected long getLevel12Experience() {
        return 660000;
    }

    @Override
    protected long getLevel13Experience() {
        return 790000;
    }

    @Override
    protected long getLevel14Experience() {
        return 10000000;
    }

    @Override
    protected String getLevel1Title() {
        return "Sentry";
    }

    @Override
    protected String getLevel2Title() {
        return "Warden";
    }

    @Override
    protected String getLevel3Title() {
        return "Shieldbearer";
    }

    @Override
    protected String getLevel4Title() {
        return "Defender";
    }

    @Override
    protected String getLevel5Title() {
        return "Sentinel";
    }

    @Override
    protected String getLevel6Title() {
        return "Guardian";
    }

    @Override
    protected String getLevel7Title() {
        return "Champion";
    }

    @Override
    protected String getLevel8Title() {
        return "Vaultguard";
    }

    @Override
    protected String getLevel9Title() {
        return "Vaultlord";
    }

    @Override
    protected String getLevel10Title() {
        return "Vaultlord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Vaultlord (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Vaultlord (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Vaultlord (XIII)";
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
