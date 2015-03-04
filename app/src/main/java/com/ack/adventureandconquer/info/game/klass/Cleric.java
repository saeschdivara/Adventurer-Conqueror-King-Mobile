package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Cleric extends CharacterClass {

    @Override
    public int getDefaultHitPoints() {
        return super.getDefaultHitPoints();
    }

    @Override
    public void setLevel(int level) {

        if (level == 1) {
            setExperience(0);
        }
        else if (level == 2) {
            setExperience(1500);
        }
        else if (level == 3) {
            setExperience(3000);
        }
        else if (level == 4) {
            setExperience(6000);
        }
        else if (level == 5) {
            setExperience(12000);
        }
        else if (level == 6) {
            setExperience(24000);
        }
        else if (level == 7) {
            setExperience(50000);
        }
        else if (level == 8) {
            setExperience(100000);
        }
        else if (level == 9) {
            setExperience(200000);
        }
        else if (level == 10) {
            setExperience(300000);
        }
        else if (level == 11) {
            setExperience(400000);
        }
        else if (level == 12) {
            setExperience(500000);
        }
        else if (level == 13) {
            setExperience(600000);
        }
        else if (level == 14) {
            setExperience(700000);
        }
    }

    @Override
    public int getLevel() {

        long experience = getExperience();

        if (experience >= 0 && experience < 1500) {
            return 1;
        }
        else if (experience >= 1500 && experience < 3000) {
            return 2;
        }
        else if (experience >= 3000 && experience < 6000) {
            return 3;
        }
        else if (experience >= 6000 && experience < 12000) {
            return 4;
        }
        else if (experience >= 12000 && experience < 24000) {
            return 5;
        }
        else if (experience >= 24000 && experience < 50000) {
            return 6;
        }
        else if (experience >= 50000 && experience < 100000) {
            return 7;
        }
        else if (experience >= 100000 && experience < 200000) {
            return 8;
        }
        else if (experience >= 200000 && experience < 300000) {
            return 9;
        }
        else if (experience >= 300000 && experience < 400000) {
            return 10;
        }
        else if (experience >= 400000 && experience < 500000) {
            return 11;
        }
        else if (experience >= 500000 && experience < 600000) {
            return 12;
        }
        else if (experience >= 600000 && experience < 700000) {
            return 13;
        }
        else {
            return 14;
        }
    }

    @Override
    public String getTitle() {

        int level = getLevel();

        if (level == 1) {
            return "Catechist";
        }
        else if (level == 2) {
            return "Acolyte";
        }
        else if (level == 3) {
            return "Priest";
        }
        else if (level == 4) {
            return "Curate";
        }
        else if (level == 5) {
            return "Vicar";
        }
        else if (level == 6) {
            return "Rector";
        }
        else if (level == 7) {
            return "Prelate";
        }
        else if (level == 8) {
            return "Bishop";
        }
        else if (level == 9) {
            return "Patriarch";
        }
        else if (level == 10) {
            return "Patriarch (X)";
        }
        else if (level == 11) {
            return "Patriarch (XI)";
        }
        else if (level == 12) {
            return "Patriarch (XII)";
        }
        else if (level == 13) {
            return "Patriarch (XIII)";
        }
        else {
            return "Theocrat";
        }
    }
}
