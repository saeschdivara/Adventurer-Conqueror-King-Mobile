package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class AntiPaladin extends CharacterClass {
    @Override
    public String getTitle() {

        long experience = getExperience();

        if (experience == 0) {
            return "Miscreant";
        }
        else if (experience >= 1850 && experience < 3700) {
            return "Despoiler";
        }
        else if (experience >= 3700 && experience < 7400) {
            return "Avenger";
        }
        else if (experience >= 7400 && experience < 14800) {
            return "Defiler";
        }
        else if (experience >= 14800 && experience < 29600) {
            return "Blackguard";
        }
        else if (experience >= 29600 && experience < 60000) {
            return "Destroyer";
        }
        else if (experience >= 60000 && experience < 120000) {
            return "Warduke";
        }
        else if (experience >= 120000 && experience < 240000) {
            return "Malefactor";
        }
        else if (experience >= 240000 && experience < 360000) {
            return "Malefactor Lord";
        }
        else if (experience >= 360000 && experience < 480000) {
            return "Malefactor Lord (X)";
        }
        else if (experience >= 480000 && experience < 600000) {
            return "Malefactor Lord (XI)";
        }
        else if (experience >= 600000 && experience < 720000) {
            return "Malefactor Lord (XII)";
        }
        else if (experience >= 720000 && experience < 840000) {
            return "Malefactor Lord (XIII)";
        }
        else {
            return "Dark Lord of Malefaction";
        }
    }
}

