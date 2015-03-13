package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.AnimalType;
import com.ack.adventureandconquer.game.creature.DragonType;
import com.ack.adventureandconquer.game.creature.FlyerType;
import com.ack.adventureandconquer.game.creature.HumanoidType;
import com.ack.adventureandconquer.game.creature.InsectType;
import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.ack.adventureandconquer.game.creature.MenType;

/**
 * Created by saskyrar on 16/01/15.
 */
public class Jungle implements IsTerrain {
    @Override
    public IsCreatureType getEnemyType(int number) {

        IsCreatureType creatureType = null;

        switch (number) {
            case 1:
                creatureType = new MenType();
                break;
            case 2:
                creatureType = new FlyerType();
                break;
            case 3:
                creatureType = new InsectType();
                break;
            case 4:
                creatureType = new InsectType();
                break;
            case 5:
                creatureType = new HumanoidType();
                break;
            case 6:
                creatureType = new AnimalType();
                break;
            case 7:
                creatureType = new AnimalType();
                break;
            case 8:
                creatureType = new DragonType();
                break;
        }

        return creatureType;
    }
}
