package com.ack.adventureandconquer.game.creature.npc.dragon;

import com.ack.adventureandconquer.game.creature.npc.Npc;

/**
 * Created by saskyrar on 10/02/15.
 */
abstract public class BaseDragon extends Npc {

    private Category category;
    private int age;
    private int groupSize;
    private boolean awake;

    public BaseDragon() {
//        generateAttributes();
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
                case 2:
                    category = SPAWN;
                    break;
                case 3:
                    category = VERY_YOUNG;
                    break;
                case 4:
                    category = YOUNG;
                    break;
                case 5:
                    category = JUVENILE;
                    break;
                case 6:
                    category = ADULT;
                    break;
                case 7:
                    category = MATURE_ADULT;
                    break;
                case 8:
                    category = OLD;
                    int evenOlder = (d6.role()-3);
                    if (evenOlder == 1){
                        category = VERY_OLD;
                    }
                    if (evenOlder == 2){
                        category = ANCIENT;
                    }
                    if (evenOlder == 3){
                        category = VENERABLE;
                    }
                    break;
            }

            return category;
        }

    }

//    protected void generateAttributes() {
//        setCategory(Category.fromInt(d4.role() + d4.role()));
//        generateAge();
//
//    }


    protected static boolean checkIfCanSpeak(int chance) {
        boolean canSpeak;
        if (d100.role() < chance) {
            canSpeak = true;
        } else
            canSpeak = false;

        return canSpeak;
    }

    protected static String awake(int chance) {
        if (d100.role() < chance) {
            return "Awake and ready!";
        } else
            return "Currently asleep!";
    }

//    protected void generateAge() {
//
//        switch (getCategory()) {
//            case SPAWN:
//                groupSize = d4.role();
//                if (d100.role() <= 80){
//                    awake = true;
//                }else{
//                    awake = false;
//                }
//                break;
//            case VERY_YOUNG:
//                groupSize = d4.role();
//                break;
//            case YOUNG:
//                groupSize = d4.role();
//                break;
//            case JUVENILE:
//                groupSize = d4.role();
//                break;
//            case ADULT:
//                groupSize = d4.role();
//                break;
//            case MATURE_ADULT:
//                groupSize = d4.role();
//                break;
//            case OLD:
//                groupSize = d2.role();
//                break;
//            case VERY_OLD:
//                groupSize = d2.role();
//                break;
//            case ANCIENT:
//                groupSize = d2.role();
//                break;
//            case VENERABLE:
//                groupSize = 1;
//                break;
//        }
//    }
}
