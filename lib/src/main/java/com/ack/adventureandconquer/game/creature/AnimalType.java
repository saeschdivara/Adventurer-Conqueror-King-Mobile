package com.ack.adventureandconquer.game.creature;

import com.ack.adventureandconquer.game.adventure.Barren;
import com.ack.adventureandconquer.game.adventure.Clear;
import com.ack.adventureandconquer.game.adventure.Desert;
import com.ack.adventureandconquer.game.adventure.Grass;
import com.ack.adventureandconquer.game.adventure.Hills;
import com.ack.adventureandconquer.game.adventure.Inhabited;
import com.ack.adventureandconquer.game.adventure.IsTerrain;
import com.ack.adventureandconquer.game.adventure.Jungle;
import com.ack.adventureandconquer.game.adventure.Mountains;
import com.ack.adventureandconquer.game.adventure.River;
import com.ack.adventureandconquer.game.adventure.Scrub;
import com.ack.adventureandconquer.game.adventure.Woods;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.animal.AntelopeType;
import com.ack.adventureandconquer.game.creature.npc.animal.BatType;
import com.ack.adventureandconquer.game.creature.npc.animal.BlackBearType;
import com.ack.adventureandconquer.game.creature.npc.animal.BlackWidowSpiderType;
import com.ack.adventureandconquer.game.creature.npc.animal.BoarType;
import com.ack.adventureandconquer.game.creature.npc.animal.CamelType;
import com.ack.adventureandconquer.game.creature.npc.animal.CaveBearType;
import com.ack.adventureandconquer.game.creature.npc.animal.CrabSpiderType;
import com.ack.adventureandconquer.game.creature.npc.animal.CrocodileType;
import com.ack.adventureandconquer.game.creature.npc.animal.DireWolfType;
import com.ack.adventureandconquer.game.creature.npc.animal.DogType;
import com.ack.adventureandconquer.game.creature.npc.animal.DonkeyType;
import com.ack.adventureandconquer.game.creature.npc.animal.DracoLizardType;
import com.ack.adventureandconquer.game.creature.npc.animal.EagleType;
import com.ack.adventureandconquer.game.creature.npc.animal.ElephantType;
import com.ack.adventureandconquer.game.creature.npc.animal.GeckoLizardType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantCrabType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantFerretType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantLeechType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantPiranhaType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantShrewType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantToadType;
import com.ack.adventureandconquer.game.creature.npc.animal.GiantWeaselType;
import com.ack.adventureandconquer.game.creature.npc.animal.GrizzlyBearType;
import com.ack.adventureandconquer.game.creature.npc.animal.HawkType;
import com.ack.adventureandconquer.game.creature.npc.animal.HornedLizardType;
import com.ack.adventureandconquer.game.creature.npc.animal.LionCatType;
import com.ack.adventureandconquer.game.creature.npc.animal.MonkeyType;
import com.ack.adventureandconquer.game.creature.npc.animal.MountainLionCatType;
import com.ack.adventureandconquer.game.creature.npc.animal.OwlType;
import com.ack.adventureandconquer.game.creature.npc.animal.PantherCatType;
import com.ack.adventureandconquer.game.creature.npc.animal.PitViperSnakeType;
import com.ack.adventureandconquer.game.creature.npc.animal.PythonSnakeType;
import com.ack.adventureandconquer.game.creature.npc.animal.RatType;
import com.ack.adventureandconquer.game.creature.npc.animal.RattlerSnakeType;
import com.ack.adventureandconquer.game.creature.npc.animal.RidingHorseType;
import com.ack.adventureandconquer.game.creature.npc.animal.RockBaboonType;
import com.ack.adventureandconquer.game.creature.npc.animal.SheepType;
import com.ack.adventureandconquer.game.creature.npc.animal.SpitCobraSnakeType;
import com.ack.adventureandconquer.game.creature.npc.animal.SwanType;
import com.ack.adventureandconquer.game.creature.npc.animal.TuataraLizardType;
import com.ack.adventureandconquer.game.creature.npc.animal.UnicornType;
import com.ack.adventureandconquer.game.creature.npc.animal.VultureType;
import com.ack.adventureandconquer.game.creature.npc.animal.WildGoatType;
import com.ack.adventureandconquer.game.creature.npc.animal.WolfType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class AnimalType implements IsCreatureType {
    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        String terrainName = terrain.getTerrainName();
        boolean isClear = terrainName.equals("Clear");
        boolean isGrass = terrainName.equals("Grass");
        boolean isScrub = terrainName.equals("Scrub");
        boolean isRiver = terrainName.equals("River");
        boolean isWoods = terrainName.equals("Woods");
        boolean isBarren = terrainName.equals("Barren");
        boolean isMountains = terrainName.equals("Mountains");
        boolean isHills = terrainName.equals("Hills");
        boolean isDesert = terrainName.equals("Desert");
        boolean isInhabited = terrainName.equals("Inhabited");
        boolean isJungle = terrainName.equals("Jungle");



        if (isClear || isGrass || isScrub) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new BoarType();
                    break;
                case 3:
                    npc = new LionCatType();
                    break;
                case 4:
                    npc = new PantherCatType();
                    break;
                case 5:
                    npc = new ElephantType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new RidingHorseType();
                    break;
                case 8:
                    npc = new TuataraLizardType();
                    break;
                case 9:
                    npc = new DonkeyType();
                    break;
                case 10:
                    npc = new PitViperSnakeType();
                    break;
                case 11:
                    npc = new RattlerSnakeType();
                    break;
                case 12:
                    npc = new GiantWeaselType();
                    break;
            }
        }
        else if (isWoods) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new BatType();
                    break;
                case 3:
                    npc = new GrizzlyBearType();
                    break;
                case 4:
                    npc = new BoarType();
                    break;
                case 5:
                    npc = new PantherCatType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new OwlType();
                    break;
                case 8:
                    npc = new PitViperSnakeType();
                    break;
                case 9:
                    npc = new BlackWidowSpiderType();
                    break;
                case 10:
                    npc = new UnicornType();
                    break;
                case 11:
                    npc = new WolfType();
                    break;
                case 12:
                    npc = new DireWolfType();
                    break;
            }
        }
        else if (isRiver) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new BlackBearType();
                    break;
                case 3:
                    npc = new BoarType();
                    break;
                case 4:
                    npc = new PantherCatType();
                    break;
                case 5:
                    npc = new GiantCrabType();
                    break;
                case 6:
                    npc = new CrocodileType();
                    break;
                case 7:
                    npc = new GiantLeechType();
                    break;
                case 8:
                    npc = new GiantPiranhaType();
                    break;
                case 9:
                    npc = new RatType();
                    break;
                case 10:
                    npc = new GiantShrewType();
                    break;
                case 11:
                    npc = new SwanType();
                    break;
                case 12:
                    npc = new GiantToadType();
                    break;
            }
        }
        else if (isHills) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new GrizzlyBearType();
                    break;
                case 3:
                    npc = new BoarType();
                    break;
                case 4:
                    npc = new MountainLionCatType();
                    break;
                case 5:
                    npc = new EagleType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new RidingHorseType();
                    break;
                case 8:
                    npc = new SheepType();
                    break;
                case 9:
                    npc = new PitViperSnakeType();
                    break;
                case 10:
                    npc = new OwlType();
                    break;
                case 11:
                    npc = new WolfType();
                    break;
                case 12:
                    npc = new DireWolfType();
                    break;
            }
        }
        else if (isMountains) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new CaveBearType();
                    break;
                case 3:
                    npc = new MountainLionCatType();
                    break;
                case 4:
                    npc = new EagleType();
                    break;
                case 5:
                    npc = new WildGoatType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new DonkeyType();
                    break;
                case 8:
                    npc = new RockBaboonType();
                    break;
                case 9:
                    npc = new PitViperSnakeType();
                    break;
                case 10:
                    npc = new RattlerSnakeType();
                    break;
                case 11:
                    npc = new WolfType();
                    break;
                case 12:
                    npc = new DireWolfType();
                    break;
            }
        }
        else if (isBarren) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new CaveBearType()  ;
                    break;
                case 3:
                    npc = new MountainLionCatType();
                    break;
                case 4:
                    npc = new EagleType();
                    break;
                case 5:
                    npc = new WildGoatType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new RockBaboonType();
                    break;
                case 8:
                    npc = new PitViperSnakeType();
                    break;
                case 9:
                    npc = new RattlerSnakeType();
                    break;
                case 10:
                    npc = new CrabSpiderType();
                    break;
                case 11:
                    npc = new DireWolfType();
                    break;
                case 12:
                    npc = new VultureType();
                    break;
            }
        }
        else if (isDesert) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new AntelopeType();
                    break;
                case 3:
                    npc = new CamelType();
                    break;
                case 4:
                    npc = new CamelType();
                    break;
                case 5:
                    npc = new LionCatType();
                    break;
                case 6:
                    npc = new HawkType();
                    break;
                case 7:
                    npc = new GeckoLizardType();
                    break;
                case 8:
                    npc = new TuataraLizardType();
                    break;
                case 9:
                    npc = new RattlerSnakeType();
                    break;
                case 10:
                    npc = new WolfType();
                    break;
                case 11:
                    npc = new DireWolfType();
                    break;
                case 12:
                    npc = new VultureType();
                    break;
            }
        }
        else if (isInhabited) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new BoarType();
                    break;
                case 3:
                    npc = new DogType();
                    break;
                case 4:
                    npc = new GiantFerretType();
                    break;
                case 5:
                    npc = new HawkType();
                    break;
                case 6:
                    npc = new RidingHorseType();
                    break;
                case 7:
                    npc = new DonkeyType();
                    break;
                case 8:
                    npc = new RatType();
                    break;
                case 9:
                    npc = new PitViperSnakeType();
                    break;
                case 10:
                    npc = new SheepType();
                    break;
                case 11:
                    npc = new GiantWeaselType();
                    break;
                case 12:
                    npc = new WolfType();
                    break;
            }
        }
        else if (isJungle) {
            switch (number) {
                case 1:
                    npc = new AntelopeType();
                    break;
                case 2:
                    npc = new BoarType();
                    break;
                case 3:
                    npc = new PantherCatType();
                    break;
                case 4:
                    npc = new DracoLizardType();
                    break;
                case 5:
                    npc = new GeckoLizardType();
                    break;
                case 6:
                    npc = new HornedLizardType();
                    break;
                case 7:
                    npc = new MonkeyType();
                    break;
                case 8:
                    npc = new GiantShrewType();
                    break;
                case 9:
                    npc = new PitViperSnakeType();
                    break;
                case 10:
                    npc = new PythonSnakeType();
                    break;
                case 11:
                    npc = new SpitCobraSnakeType();
                    break;
                case 12:
                    npc = new CrabSpiderType();
                    break;
            }
        }

        return npc;
    }
}
