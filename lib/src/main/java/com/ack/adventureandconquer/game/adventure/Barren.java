package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.AnimalType;
import com.ack.adventureandconquer.game.creature.DragonType;
import com.ack.adventureandconquer.game.creature.FlyerType;
import com.ack.adventureandconquer.game.creature.HumanoidType;
import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.ack.adventureandconquer.game.creature.MenType;
import com.ack.adventureandconquer.game.creature.UndeadType;
import com.ack.adventureandconquer.game.creature.UnusualType;

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

    @Override
    public String getTerrainName(){
        return this.getClass().getName().substring(this.getClass().getName().lastIndexOf(".")+1);
    }
}
