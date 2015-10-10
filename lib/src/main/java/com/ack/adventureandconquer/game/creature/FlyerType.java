package com.ack.adventureandconquer.game.creature;

import com.ack.adventureandconquer.game.adventure.Barren;
import com.ack.adventureandconquer.game.adventure.Desert;
import com.ack.adventureandconquer.game.adventure.IsTerrain;
import com.ack.adventureandconquer.game.adventure.Mountains;
import com.ack.adventureandconquer.game.adventure.Woods;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.animal.VultureType;
import com.ack.adventureandconquer.game.creature.npc.flyer.BatSwarmType;
import com.ack.adventureandconquer.game.creature.npc.flyer.ChimeraType;
import com.ack.adventureandconquer.game.creature.npc.flyer.CockatriceType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GargoyleType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GiantBatType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GiantCarnivFlyType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GiantHawkType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GiantOwlType;
import com.ack.adventureandconquer.game.creature.npc.flyer.GriffonType;
import com.ack.adventureandconquer.game.creature.npc.flyer.HarpyType;
import com.ack.adventureandconquer.game.creature.npc.flyer.HippogriffType;
import com.ack.adventureandconquer.game.creature.npc.flyer.KillerBeeType;
import com.ack.adventureandconquer.game.creature.npc.flyer.LammasuType;
import com.ack.adventureandconquer.game.creature.npc.flyer.ManticoreType;
import com.ack.adventureandconquer.game.creature.npc.flyer.PegasusType;
import com.ack.adventureandconquer.game.creature.npc.flyer.PterodactylType;
import com.ack.adventureandconquer.game.creature.npc.flyer.RocType;
import com.ack.adventureandconquer.game.creature.npc.flyer.SmallRocType;
import com.ack.adventureandconquer.game.creature.npc.flyer.SphinxType;
import com.ack.adventureandconquer.game.creature.npc.flyer.StirgeType;
import com.ack.adventureandconquer.game.creature.npc.flyer.WyvernType;
import com.ack.adventureandconquer.game.creature.npc.humanoid.PixieType;
import com.ack.adventureandconquer.game.creature.npc.humanoid.SpriteType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class FlyerType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        String terrainName = terrain.getTerrainName();
        boolean isClear = terrainName.equals("Clear");
        boolean isGrass = terrainName.equals("Grass");
        boolean isScrub = terrainName.equals("Scrub");
        boolean isWoods = terrainName.equals("Woods");
        boolean isRiver = terrainName.equals("River");
        boolean isSwamp = terrainName.equals("Swamp");
        boolean isMountains = terrainName.equals("Mountains");
        boolean isHills = terrainName.equals("Hills");
        boolean isBarren = terrainName.equals("Barren");
        boolean isDesert = terrainName.equals("Desert");
        boolean isInhabited = terrainName.equals("Inhabited");
        boolean isCity = terrainName.equals("City");
        boolean isOcean = terrainName.equals("Ocean");
        boolean isJungle = terrainName.equals("Jungle");

        if (isBarren) {
            switch (number) {
                case 1:
                    npc = new CockatriceType();
                    break;
                case 2:
                    npc = new GargoyleType();
                    break;
                case 3:
                    npc = new GriffonType();
                    break;
                case 4:
                    npc = new HarpyType();
                    break;
                case 5:
                    npc = new GiantHawkType();
                    break;
                case 6:
                    npc = new HippogriffType();
                    break;
                case 7:
                    npc = new LammasuType();
                    break;
                case 8:
                    npc = new ManticoreType();
                    break;
                case 9:
                    npc = new PegasusType();
                    break;
                case 10:
                    npc = new SmallRocType();
                    break;
                case 11:
                    npc = new StirgeType();
                    break;
                case 12:
                    npc = new WyvernType();
                    break;
            }
        }
        else if (isDesert) {
            switch (number) {
                case 1:
                    npc = new ChimeraType();
                    break;
                case 2:
                    npc = new CockatriceType();
                    break;
                case 3:
                    npc = new GargoyleType();
                    break;
                case 4:
                    npc = new GriffonType();
                    break;
                case 5:
                    npc = new GiantHawkType();
                    break;
                case 6:
                    npc = new LammasuType();
                    break;
                case 7:
                    npc = new ManticoreType();
                    break;
                case 8:
                    npc = new PterodactylType();
                    break;
                case 9:
                    npc = new SmallRocType();
                    break;
                case 10:
                    npc = new SphinxType();
                    break;
                case 11:
                    npc = new WyvernType();
                    break;
                case 12:
                    npc = new VultureType();
                    break;
            }
        }
        else if (isMountains) {
            switch (number) {
                case 1:
                    npc = new BatSwarmType();
                    break;
                case 2:
                    npc = new ChimeraType();
                    break;
                case 3:
                    npc = new CockatriceType();
                    break;
                case 4:
                    npc = new GargoyleType();
                    break;
                case 5:
                    npc = new GriffonType();
                    break;
                case 6:
                    npc = new HarpyType();
                    break;
                case 7:
                    npc = new GiantHawkType();
                    break;
                case 8:
                    npc = new HippogriffType();
                    break;
                case 9:
                    npc = new ManticoreType();
                    break;
                case 10:
                    npc = new PegasusType();
                    break;
                case 11:
                    npc = new RocType();
                    break;
                case 12:
                    npc = new WyvernType();
                    break;
            }
        }
        else if (isWoods) {
            switch (number) {
                case 1:
                    npc = new GiantBatType();
                    break;
                case 2:
                    npc = new BatSwarmType();
                    break;
                case 3:
                    npc = new CockatriceType();
                    break;
                case 4:
                    npc = new GriffonType();
                    break;
                case 5:
                    npc = new GiantHawkType();
                    break;
                case 6:
                    npc = new HippogriffType();
                    break;
                case 7:
                    npc = new PegasusType();
                    break;
                case 8:
                    npc = new GiantOwlType();
                    break;
                case 9:
                    npc = new PixieType();
                    break;
                case 10:
                    npc = new SmallRocType();
                    break;
                case 11:
                    npc = new SpriteType();
                    break;
                case 12:
                    npc = new StirgeType();
                    break;
            }
        }
        else {
            switch (number) {
                case 1:
                    npc = new CockatriceType();
                    break;
                case 2:
                    npc = new GiantCarnivFlyType();
                    break;
                case 3:
                    npc = new GargoyleType();
                    break;
                case 4:
                    npc = new GriffonType();
                    break;
                case 5:
                    npc = new GiantHawkType();
                    break;
                case 6:
                    npc = new HippogriffType();
                    break;
                case 7:
                    npc = new KillerBeeType();
                    break;
                case 8:
                    npc = new PegasusType();
                    break;
                case 9:
                    npc = new PixieType();
                    break;
                case 10:
                    npc = new SmallRocType();
                    break;
                case 11:
                    npc = new SpriteType();
                    break;
                case 12:
                    npc = new StirgeType();
                    break;
            }
        }

        return npc;
    }
}
