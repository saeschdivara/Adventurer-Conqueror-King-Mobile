package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.DragonType;
import com.ack.adventureandconquer.game.creature.FlyerType;
import com.ack.adventureandconquer.game.creature.HumanoidType;
import com.ack.adventureandconquer.game.creature.InsectType;
import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.ack.adventureandconquer.game.creature.MenType;
import com.ack.adventureandconquer.game.creature.SwimmerType;
import com.ack.adventureandconquer.game.creature.UndeadType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class Swamp implements IsTerrain {
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
                creatureType = new SwimmerType();
                break;
            case 5:
                creatureType = new UndeadType();
                break;
            case 6:
                creatureType = new UndeadType();
                break;
            case 7:
                creatureType = new InsectType();
                break;
            case 8:
                creatureType = new DragonType();
                break;
        }

        return creatureType;
    }
}
