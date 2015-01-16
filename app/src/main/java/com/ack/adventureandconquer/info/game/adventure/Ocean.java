package com.ack.adventureandconquer.info.game.adventure;

import com.ack.adventureandconquer.info.game.creature.DragonType;
import com.ack.adventureandconquer.info.game.creature.FlyerType;
import com.ack.adventureandconquer.info.game.creature.IsCreatureType;
import com.ack.adventureandconquer.info.game.creature.MenType;
import com.ack.adventureandconquer.info.game.creature.SwimmerType;

/**
 * Created by saskyrar on 16/01/15.
 */
public class Ocean implements IsTerrain {
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
                creatureType = new SwimmerType();
                break;
            case 4:
                creatureType = new SwimmerType();
                break;
            case 5:
                creatureType = new SwimmerType();
                break;
            case 6:
                creatureType = new SwimmerType();
                break;
            case 7:
                creatureType = new SwimmerType();
                break;
            case 8:
                creatureType = new DragonType();
                break;
        }

        return creatureType;
    }
}
