package com.ack.adventureandconquer.info.game.creature;

import com.ack.adventureandconquer.info.game.adventure.Barren;
import com.ack.adventureandconquer.info.game.adventure.City;
import com.ack.adventureandconquer.info.game.adventure.Clear;
import com.ack.adventureandconquer.info.game.adventure.Desert;
import com.ack.adventureandconquer.info.game.adventure.Grass;
import com.ack.adventureandconquer.info.game.adventure.Hills;
import com.ack.adventureandconquer.info.game.adventure.Inhabited;
import com.ack.adventureandconquer.info.game.adventure.IsTerrain;
import com.ack.adventureandconquer.info.game.adventure.Jungle;
import com.ack.adventureandconquer.info.game.adventure.Mountains;
import com.ack.adventureandconquer.info.game.adventure.Ocean;
import com.ack.adventureandconquer.info.game.adventure.River;
import com.ack.adventureandconquer.info.game.adventure.Scrub;
import com.ack.adventureandconquer.info.game.adventure.Swamp;
import com.ack.adventureandconquer.info.game.adventure.Woods;
import com.ack.adventureandconquer.info.game.creature.npc.IsNpc;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.BugbearType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.CloudGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.CyclopsType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.DoppelgangerType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.DryadType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.DwarfType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.ElfType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.FireGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.FrostGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.GnollType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.GnomeType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.GoblinType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.HalflingType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.HillGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.HobgoblinType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.KoboldType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.LizardManType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.MinotaurType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.NaiadType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.OgreType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.OrcType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.PixieType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.SpriteType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.StoneGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.StormGiantType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.ThroghrinType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.TroglodyteType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.TrollType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.WerebearType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.WereboarType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.WereratType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.WeretigerType;
import com.ack.adventureandconquer.info.game.creature.npc.humanoid.WerewolfType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class HumanoidType implements IsCreatureType {
    @Override
    public IsNpc getNpcType(IsTerrain terrain, int number) {
        IsNpc npc = null;

        boolean isClear = terrain instanceof Clear;
        boolean isGrass = terrain instanceof Grass;
        boolean isScrub = terrain instanceof Scrub;

        boolean isBarren = terrain instanceof Barren;
        boolean isMountains = terrain instanceof Mountains;
        boolean isHills = terrain instanceof Hills;

        if (isClear || isGrass || isScrub) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new ElfType();
                    break;
                case 3:
                    npc = new GnollType();
                    break;
                case 4:
                    npc = new GoblinType();
                    break;
                case 5:
                    npc = new HalflingType();
                    break;
                case 6:
                    npc = new HobgoblinType();
                    break;
                case 7:
                    npc = new KoboldType();
                    break;
                case 8:
                    npc = new OgreType();
                    break;
                case 9:
                    npc = new OrcType();
                    break;
                case 10:
                    npc = new PixieType();
                    break;
                case 11:
                    npc = new ThroghrinType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (terrain instanceof Woods) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new CyclopsType();
                    break;
                case 3:
                    npc = new DryadType();
                    break;
                case 4:
                    npc = new ElfType();
                    break;
                case 5:
                    npc = new HillGiantType();
                    break;
                case 6:
                    npc = new GnollType();
                    break;
                case 7:
                    npc = new GoblinType();
                    break;
                case 8:
                    npc = new HobgoblinType();
                    break;
                case 9:
                    npc = new OgreType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new PixieType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (terrain instanceof River) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new ElfType();
                    break;
                case 3:
                    npc = new GnollType();
                    break;
                case 4:
                    npc = new HobgoblinType();
                    break;
                case 5:
                    npc = new LizardManType();
                    break;
                case 6:
                    npc = new LizardManType();
                    break;
                case 7:
                    npc = new NaiadType();
                    break;
                case 8:
                    npc = new NaiadType();
                    break;
                case 9:
                    npc = new OgreType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new SpriteType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (terrain instanceof Swamp) {
            switch (number) {
                case 1:
                    npc = new GnollType();
                    break;
                case 2:
                    npc = new GoblinType();
                    break;
                case 3:
                    npc = new HobgoblinType();
                    break;
                case 4:
                    npc = new LizardManType();
                    break;
                case 5:
                    npc = new LizardManType();
                    break;
                case 6:
                    npc = new LizardManType();
                    break;
                case 7:
                    npc = new NaiadType();
                    break;
                case 8:
                    npc = new OgreType();
                    break;
                case 9:
                    npc = new OrcType();
                    break;
                case 10:
                    npc = new TroglodyteType();
                    break;
                case 11:
                    npc = new TrollType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (isMountains || isHills) {
            switch (number) {
                case 1:
                    npc = new DwarfType();
                    break;
                case 2:
                    npc = new CloudGiantType();
                    break;
                case 3:
                    npc = new FrostGiantType();
                    break;
                case 4:
                    npc = new HillGiantType();
                    break;
                case 5:
                    npc = new StoneGiantType();
                    break;
                case 6:
                    npc = new StormGiantType();
                    break;
                case 7:
                    npc = new GoblinType();
                    break;
                case 8:
                    npc = new KoboldType();
                    break;
                case 9:
                    npc = new OgreType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new TroglodyteType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (isBarren) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new HillGiantType();
                    break;
                case 3:
                    npc = new GoblinType();
                    break;
                case 4:
                    npc = new GnollType();
                    break;
                case 5:
                    npc = new HobgoblinType();
                    break;
                case 6:
                    npc = new HobgoblinType();
                    break;
                case 7:
                    npc = new OgreType();
                    break;
                case 8:
                    npc = new OgreType();
                    break;
                case 9:
                    npc = new OrcType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new ThroghrinType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (terrain instanceof Desert) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new GnollType();
                    break;
                case 3:
                    npc = new FireGiantType();
                    break;
                case 4:
                    npc = new HobgoblinType();
                    break;
                case 5:
                    npc = new HobgoblinType();
                    break;
                case 6:
                    npc = new MinotaurType();
                    break;
                case 7:
                    npc = new OgreType();
                    break;
                case 8:
                    npc = new OgreType();
                    break;
                case 9:
                    npc = new OrcType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new TrollType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }
        else if (terrain instanceof City) {
            switch (number) {
                case 1:
                    npc = new DoppelgangerType();
                    break;
                case 2:
                    npc = new DwarfType()  ;
                    break;
                case 3:
                    npc = new ElfType();
                    break;
                case 4:
                    npc = new GnomeType();
                    break;
                case 5:
                    npc = new HalflingType();
                    break;
                case 6:
                    npc = new PixieType();
                    break;
                case 7:
                    npc = new SpriteType();
                    break;
                case 8:
                    npc = new WerebearType();
                    break;
                case 9:
                    npc = new WereboarType();
                    break;
                case 10:
                    npc = new WereratType();
                    break;
                case 11:
                    npc = new WeretigerType();
                    break;
                case 12:
                    npc = new WerewolfType();
                    break;
            }
        }
        else if (terrain instanceof Inhabited) {
            switch (number) {
                case 1:
                    npc = new DoppelgangerType();
                    break;
                case 2:
                    npc = new DwarfType();
                    break;
                case 3:
                    npc = new ElfType();
                    break;
                case 4:
                    npc = new GnomeType();
                    break;
                case 5:
                    npc = new GoblinType();
                    break;
                case 6:
                    npc = new HalflingType();
                    break;
                case 7:
                    npc = new KoboldType();
                    break;
                case 8:
                    npc = new OgreType();
                    break;
                case 9:
                    npc = new OrcType();
                    break;
                case 10:
                    npc = new PixieType();
                    break;
                case 11:
                    npc = new SpriteType();
                    break;
                case 12:
                    npc = new WereratType();
                    break;
            }
        }
        else if (terrain instanceof Ocean) {
        }
        else if (terrain instanceof Jungle) {
            switch (number) {
                case 1:
                    npc = new BugbearType();
                    break;
                case 2:
                    npc = new CyclopsType();
                    break;
                case 3:
                    npc = new ElfType();
                    break;
                case 4:
                    npc = new FireGiantType();
                    break;
                case 5:
                    npc = new HillGiantType();
                    break;
                case 6:
                    npc = new GnollType();
                    break;
                case 7:
                    npc = new GoblinType();
                    break;
                case 8:
                    npc = new LizardManType();
                    break;
                case 9:
                    npc = new OgreType();
                    break;
                case 10:
                    npc = new OrcType();
                    break;
                case 11:
                    npc = new TroglodyteType();
                    break;
                case 12:
                    npc = new TrollType();
                    break;
            }
        }

        return npc;
    }
}
