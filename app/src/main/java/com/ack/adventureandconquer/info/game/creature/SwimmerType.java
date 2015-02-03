package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.adventure.Ocean;
import com.ack.adventureandconquer.info.game.adventure.River;
import com.ack.adventureandconquer.info.game.adventure.Swamp;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.CrocodileType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.GiantCrabType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.GiantLeechType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.LizardManType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.NaiadType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.CatfishType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.DragonTurtleType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.GiantCrocodile;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.GiantOctopusType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.GiantSquidType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.InsectSwarmType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.LargeCrocodileType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.MermanType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.PiranhaFishType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SeaDragonType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SeaHydraType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SeaSerpentType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SeaSnakeType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SharkType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SkitteringMawType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SturgeonFishType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.WhaleType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class SwimmerType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        if (terrain instanceof River) {
            switch (number) {
                case 1:
                    npc = new GiantCrabType();
                    break;
                case 2:
                    npc = new CrocodileType();
                    break;
                case 3:
                    npc = new CrocodileType();
                    break;
                case 4:
                    npc = new LargeCrocodileType();
                    break;
                case 5:
                    npc = new CatfishType();
                    break;
                case 6:
                    npc = new PiranhaFishType();
                    break;
                case 7:
                    npc = new SturgeonFishType();
                    break;
                case 8:
                    npc = new GiantLeechType();
                    break;
                case 9:
                    npc = new LizardManType();
                    break;
                case 10:
                    npc = new MermanType();
                    break;
                case 11:
                    npc = new NaiadType();
                    break;
                case 12:
                    npc = new SkitteringMawType();
                    break;
            }
        }
        else if (terrain instanceof Ocean) {
            switch (number) {
                case 1:
                    npc = new DragonTurtleType();
                    break;
                case 2:
                    npc = new SeaHydraType();
                    break;
                case 3:
                    npc = new MermanType();
                    break;
                case 4:
                    npc = new GiantOctopusType();
                    break;
                case 5:
                    npc = new SeaDragonType();
                    break;
                case 6:
                    npc = new SeaSerpentType();
                    break;
                case 7:
                    npc = new SharkType();
                    break;
                case 8:
                    npc = new SharkType();
                    break;
                case 9:
                    npc = new SkitteringMawType();
                    break;
                case 10:
                    npc = new SeaSnakeType();
                    break;
                case 11:
                    npc = new GiantSquidType();
                    break;
                case 12:
                    npc = new WhaleType();
                    break;
            }
        }
        else if (terrain instanceof Swamp) {
            switch (number) {
                case 1:
                    npc = new GiantCrabType();
                    break;
                case 2:
                    npc = new CrocodileType();
                    break;
                case 3:
                    npc = new LargeCrocodileType();
                    break;
                case 4:
                    npc = new GiantCrocodile();
                    break;
                case 5:
                    npc = new CatfishType();
                    break;
                case 6:
                    npc = new InsectSwarmType();
                    break;
                case 7:
                    npc = new InsectSwarmType();
                    break;
                case 8:
                    npc = new GiantLeechType();
                    break;
                case 9:
                    npc = new GiantLeechType();
                    break;
                case 10:
                    npc = new LizardManType();
                    break;
                case 11:
                    npc = new LizardManType();
                    break;
                case 12:
                    npc = new SkitteringMawType();
                    break;
            }
        }

        return npc;
    }
}
