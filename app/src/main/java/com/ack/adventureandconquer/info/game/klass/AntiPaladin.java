package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class AntiPaladin extends CharacterClass {

    @Override
    public int getLevel() {

        long experience = getExperience();

        if (experience == 0) {
            return 1;
        }
        else if (experience >= 1850 && experience < 3700) {
            return 2;
        }
        else if (experience >= 3700 && experience < 7400) {
            return 3;
        }
        else if (experience >= 7400 && experience < 14800) {
            return 4;
        }
        else if (experience >= 14800 && experience < 29600) {
            return 5;
        }
        else if (experience >= 29600 && experience < 60000) {
            return 6;
        }
        else if (experience >= 60000 && experience < 120000) {
            return 7;
        }
        else if (experience >= 120000 && experience < 240000) {
            return 8;
        }
        else if (experience >= 240000 && experience < 360000) {
            return 9;
        }
        else if (experience >= 360000 && experience < 480000) {
            return 10;
        }
        else if (experience >= 480000 && experience < 600000) {
            return 11;
        }
        else if (experience >= 600000 && experience < 720000) {
            return 12;
        }
        else if (experience >= 720000 && experience < 840000) {
            return 13;
        }
        else {
            return 14;
        }
    }

    @Override
    public void setLevel(int level) {

        if (level == 1) {
            setExperience(0);
        }
        else if (level == 2) {
            setExperience(1850);
        }
        else if (level == 3) {
            setExperience(3700);
        }
        else if (level == 4) {
            setExperience(7400);
        }
        else if (level == 5) {
            setExperience(14800);
        }
        else if (level == 6) {
            setExperience(29600);
        }
        else if (level == 7) {
            setExperience(60000);
        }
        else if (level == 8) {
            setExperience(120000);
        }
        else if (level == 9) {
            setExperience(240000);
        }
        else if (level == 10) {
            setExperience(360000);
        }
        else if (level == 11) {
            setExperience(480000);
        }
        else if (level == 12) {
            setExperience(600000);
        }
        else if (level == 13) {
            setExperience(720000);
        }
        else {
            setExperience(840000);
        }
    }

    @Override
    public String getTitle() {

        int level = getLevel();

        if (level == 1) {
            return "Miscreant";
        }
        else if (level == 2) {
            return "Despoiler";
        }
        else if (level == 3) {
            return "Avenger";
        }
        else if (level == 4) {
            return "Defiler";
        }
        else if (level == 5) {
            return "Blackguard";
        }
        else if (level == 6) {
            return "Destroyer";
        }
        else if (level == 7) {
            return "Warduke";
        }
        else if (level == 8) {
            return "Malefactor";
        }
        else if (level == 9) {
            return "Malefactor Lord";
        }
        else if (level == 10) {
            return "Malefactor Lord (X)";
        }
        else if (level == 11) {
            return "Malefactor Lord (XI)";
        }
        else if (level == 12) {
            return "Malefactor Lord (XII)";
        }
        else if (level == 13) {
            return "Malefactor Lord (XIII)";
        }
        else {
            return "Dark Lord of Malefaction";
        }
    }
}

