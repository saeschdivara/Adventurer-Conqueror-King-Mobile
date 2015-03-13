package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 10/02/15.
 */
abstract public class BaseDragon extends Npc {

    private Category category;
    private int age;

    public BaseDragon() {
        generateAttributes();
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum Category {

        SPAWN,
        VERY_YOUNG,
        YOUNG,
        JUVENILE,
        ADULT,
        MATURE_ADULT,
        OLD,
        VERY_OLD,
        ANCIENT,
        VENERABLE;

        public static Category fromInt(int number) {

            Category category = null;

            switch (number) {
                case 1:
                    category = SPAWN;
                    break;
                case 2:
                    category = VERY_YOUNG;
                    break;
                case 3:
                    category = YOUNG;
                    break;
                case 4:
                    category = JUVENILE;
                    break;
                case 5:
                    category = ADULT;
                    break;
                case 6:
                    category = MATURE_ADULT;
                    break;
                case 7:
                    category = OLD;
                    break;
                case 8:
                    category = VERY_OLD;
                    break;
                case 9:
                    category = ANCIENT;
                    break;
                case 10:
                    category = VENERABLE;
                    break;
            }

            return category;
        }

    }

    protected void generateAttributes() {
        setCategory(Category.fromInt(d10.role()));
        generateAge();
    }

    protected void generateAge() {

        switch (getCategory()) {
            case SPAWN:
                break;
            case VERY_YOUNG:
                break;
            case YOUNG:
                break;
            case JUVENILE:
                break;
            case ADULT:
                break;
            case MATURE_ADULT:
                break;
            case OLD:
                break;
            case VERY_OLD:
                break;
            case ANCIENT:
                break;
            case VENERABLE:
                break;
        }
    }
}

/**
 *
 switch (getCategory()) {
 case SPAWN:
 break;
 case VERY_YOUNG:
 break;
 case YOUNG:
 break;
 case JUVENILE:
 break;
 case ADULT:
 break;
 case MATURE_ADULT:
 break;
 case OLD:
 break;
 case VERY_OLD:
 break;
 case ANCIENT:
 break;
 case VENERABLE:
 break;
 }
 */
