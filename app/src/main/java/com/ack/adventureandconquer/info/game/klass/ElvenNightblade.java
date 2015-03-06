package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class ElvenNightblade extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2775;
    }

    @Override
    protected long getLevel3Experience() {
        return 5550;
    }

    @Override
    protected long getLevel4Experience() {
        return 11100;
    }

    @Override
    protected long getLevel5Experience() {
        return 22200;
    }

    @Override
    protected long getLevel6Experience() {
        return 45000;
    }

    @Override
    protected long getLevel7Experience() {
        return 90000;
    }

    @Override
    protected long getLevel8Experience() {
        return 180000;
    }

    @Override
    protected long getLevel9Experience() {
        return 330000;
    }

    @Override
    protected long getLevel10Experience() {
        return 480000;
    }

    @Override
    protected long getLevel11Experience() {
        return 630000;
    }

    @Override
    protected long getLevel12Experience() {
        return 1000000;
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
        return "Arcanist-Avenger";
    }

    @Override
    protected String getLevel2Title() {
        return "Seer-Enforcer";
    }

    @Override
    protected String getLevel3Title() {
        return "Theurgist-Torturer";
    }

    @Override
    protected String getLevel4Title() {
        return "Magician-Slayer";
    }

    @Override
    protected String getLevel5Title() {
        return "Thaumaturge-Destroyer";
    }

    @Override
    protected String getLevel6Title() {
        return "Enchanter-Executioner";
    }

    @Override
    protected String getLevel7Title() {
        return "Sorcerer-Blackguard";
    }

    @Override
    protected String getLevel8Title() {
        return "Mage-Assassin";
    }

    @Override
    protected String getLevel9Title() {
        return "Nightblade";
    }

    @Override
    protected String getLevel10Title() {
        return "Nightblade (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Nightblade (XI)";
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
        return getSaving(12);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(13);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(14);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(14);
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
