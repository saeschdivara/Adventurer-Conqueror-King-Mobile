package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.AnimalType;
import com.ack.adventureandconquer.info.game.creature.DragonType;
import com.ack.adventureandconquer.info.game.creature.FlyerType;
import com.ack.adventureandconquer.info.game.creature.HumanoidType;
import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.MenType;
import com.ack.adventureandconquer.info.game.creature.UndeadType;
import com.ack.adventureandconquer.info.game.creature.UnusualType;

/**
 * Created by saskyrar on 16/01/15.
 */
public class Barren implements IsTerrain {
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
                creatureType = new HumanoidType();
                break;
            case 4:
                creatureType = new HumanoidType();
                break;
            case 5:
                creatureType = new AnimalType();
                break;
            case 6:
                creatureType = new DragonType();
                break;
            case 7:
                creatureType = new UndeadType();
                break;
            case 8:
                creatureType = new UnusualType();
                break;
        }

        return creatureType;
    }
}
