package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.Desert;
import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.adventure.Mountains;
import com.ack.adventureandconquer.info.game.adventure.Ocean;
import com.ack.adventureandconquer.info.game.adventure.River;
import com.ack.adventureandconquer.info.game.adventure.Swamp;
import com.ack.adventureandconquer.info.game.adventure.Woods;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.animal.PythonSnakeType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.BasiliskType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.BlackDragon;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.BlueDragon;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.CaeciliaType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.GoldDragon;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.GreenDragon;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.HydraType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.LamiaType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.PurpleWormType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.RedDragon;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.SalamanderType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.WhiteDragon;
import com.ack.adventureandconquer.info.game.creature.npc.flyer.ChimeraType;
import com.ack.adventureandconquer.info.game.creature.npc.flyer.SphinxType;
import com.ack.adventureandconquer.info.game.creature.npc.flyer.WyvernType;
import com.ack.adventureandconquer.info.game.creature.npc.dragon.SeaDragonType;
import com.ack.adventureandconquer.info.game.creature.npc.swimmer.SeaHydraType;
import com.ack.adventureandconquer.info.game.dice.D6;
import com.ack.adventureandconquer.info.game.dice.IsDice;

/**
 * Created by saskyrar on 15/01/15.
 */
public class DragonType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        switch (number) {
            case 1:
                npc = new BasiliskType();
                break;
            case 2:
                npc = new CaeciliaType();
                break;
            case 3:
                npc = new ChimeraType();
                break;
            case 4:
                npc = getDragon(terrain);
                break;
            case 5:
                npc = getDragon(terrain);
                break;
            case 6:
                npc = new SphinxType();
                break;
            case 7:
                npc = getHydra(terrain);
                break;
            case 8:
                npc = new LamiaType();
                break;
            case 9:
                npc = new PurpleWormType();
                break;
            case 10:
                npc = new PythonSnakeType();
                break;
            case 11:
                npc = new SalamanderType();
                break;
            case 12:
                npc = new WyvernType();
                break;
        }

        return npc;
    }

    private IsNpcType getDragon(IsTerrain terrain) {
        IsNpcType dragon = null;

        if (terrain instanceof Swamp) {
            dragon = new BlackDragon();
        }
        else if (terrain instanceof Desert) {
            dragon = new BlueDragon();
        }
        else if (terrain instanceof Woods) {
            dragon = new GreenDragon();
        }
        else if (terrain instanceof River) {
            dragon = new GoldDragon();
        }
        else if (terrain instanceof Mountains) {
            dragon = new RedDragon();
        }
        else if (terrain instanceof Ocean) {
            dragon = new SeaDragonType();
        }
        else {
            IsDice d6 = new D6();

            switch (d6.role()) {
                case 1:
                    dragon = new BlackDragon();
                    break;
                case 2:
                    dragon = new BlueDragon();
                    break;
                case 3:
                    dragon = new GoldDragon();
                    break;
                case 4:
                    dragon = new GreenDragon();
                    break;
                case 5:
                    dragon = new RedDragon();
                    break;
                case 6:
                    dragon = new WhiteDragon();
                    break;
            }
        }

        return dragon;
    }

    private IsNpcType getHydra(IsTerrain terrain) {
        IsNpcType hydra = null;

        if (terrain instanceof Ocean) {
            hydra = new SeaHydraType();
        }
        else {
            hydra = new HydraType();
        }

        return hydra;
    }
}
