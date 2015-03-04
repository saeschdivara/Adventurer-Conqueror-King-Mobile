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
    public String getTitle() {

        long experience = getExperience();

        if (experience == 0) {
            return "Catechist";
        }
        else if (experience >= 1500 && experience < 3000) {
            return "Acolyte";
        }
        else if (experience >= 3000 && experience < 6000) {
            return "Priest";
        }
        else if (experience >= 6000 && experience < 12000) {
            return "Curate";
        }
        else if (experience >= 12000 && experience < 24000) {
            return "Vicar";
        }
        else if (experience >= 24000 && experience < 50000) {
            return "Rector";
        }
        else if (experience >= 50000 && experience < 100000) {
            return "Prelate";
        }
        else if (experience >= 100000 && experience < 200000) {
            return "Bishop";
        }
        else if (experience >= 200000 && experience < 300000) {
            return "Patriarch";
        }
        else if (experience >= 300000 && experience < 400000) {
            return "Patriarch (X)";
        }
        else if (experience >= 400000 && experience < 500000) {
            return "Patriarch (XI)";
        }
        else if (experience >= 500000 && experience < 600000) {
            return "Patriarch (XII)";
        }
        else if (experience >= 600000 && experience < 700000) {
            return "Patriarch (XIII)";
        }
        else {
            return "Theocrat";
        }
    }
}
