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
import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.men.AcolyteType;
import com.ack.adventureandconquer.info.game.creature.npc.men.BanditType;
import com.ack.adventureandconquer.info.game.creature.npc.men.BerserkerType;
import com.ack.adventureandconquer.info.game.creature.npc.men.BrigandType;
import com.ack.adventureandconquer.info.game.creature.npc.men.BuccaneerType;
import com.ack.adventureandconquer.info.game.creature.npc.men.ClericNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.men.FighterNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.men.MageNpcType;
import com.ack.adventureandconquer.info.game.creature.npc.men.MediumType;
import com.ack.adventureandconquer.info.game.creature.npc.men.MerchantType;
import com.ack.adventureandconquer.info.game.creature.npc.men.NobleType;
import com.ack.adventureandconquer.info.game.creature.npc.men.NomadType;
import com.ack.adventureandconquer.info.game.creature.npc.men.NpcPartyType;
import com.ack.adventureandconquer.info.game.creature.npc.men.PirateType;
import com.ack.adventureandconquer.info.game.creature.npc.men.TraderType;
import com.ack.adventureandconquer.info.game.creature.npc.men.TribesmanType;
import com.ack.adventureandconquer.info.game.creature.npc.men.VeteranType;

/**
 * Created by saskyrar on 15/01/15.
 */
public class MenType implements IsCreatureType {

    @Override
    public IsNpcType getNpcType(IsTerrain terrain, int number) {
        IsNpcType npc = null;

        boolean isClear = terrain instanceof Clear;
        boolean isGrass = terrain instanceof Grass;
        boolean isScrub = terrain instanceof Scrub;

        boolean isBarren = terrain instanceof Barren;
        boolean isMountains = terrain instanceof Mountains;
        boolean isHills = terrain instanceof Hills;

        if (isClear || isGrass || isScrub) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new NobleType();
                    break;
                case 3:
                    npc = new MageNpcType();
                    break;
                case 4:
                    npc = new FighterNpcType();
                    break;
                case 5:
                    npc = new BanditType();
                    break;
                case 6:
                    npc = new ClericNpcType();
                    break;
                case 7:
                    npc = new NomadType();
                    break;
                case 8:
                    npc = new BanditType();
                    break;
                case 9:
                    npc = new NpcPartyType();
                    break;
                case 10:
                    npc = new MerchantType();
                    break;
                case 11:
                    npc = new BerserkerType();
                    break;
                case 12:
                    npc = new TraderType();
                    break;
            }
        }
        else if (terrain instanceof Woods) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new BanditType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new MerchantType();
                    break;
                case 5:
                    npc = new BerserkerType();
                    break;
                case 6:
                    npc = new BrigandType();
                    break;
                case 7:
                    npc = new ClericNpcType();
                    break;
                case 8:
                    npc = new MageNpcType();
                    break;
                case 9:
                    npc = new VeteranType();
                    break;
                case 10:
                    npc = new BanditType();
                    break;
                case 11:
                    npc = new BrigandType();
                    break;
                case 12:
                    npc = new NpcPartyType();
                    break;
            }
        }
        else if (terrain instanceof River) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new BanditType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new MerchantType();
                    break;
                case 5:
                    npc = new BuccaneerType();
                    break;
                case 6:
                    npc = new BuccaneerType();
                    break;
                case 7:
                    npc = new ClericNpcType();
                    break;
                case 8:
                    npc = new MageNpcType();
                    break;
                case 9:
                    npc = new FighterNpcType();
                    break;
                case 10:
                    npc = new MerchantType();
                    break;
                case 11:
                    npc = new BuccaneerType();
                    break;
                case 12:
                    npc = new NpcPartyType();
                    break;
            }
        }
        else if (terrain instanceof Swamp) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new BanditType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new MerchantType();
                    break;
                case 6:
                    npc = new ClericNpcType();
                    break;
                case 7:
                    npc = new TraderType();
                    break;
                case 8:
                    npc = new BerserkerType();
                    break;
                case 9:
                    npc = new FighterNpcType();
                    break;
                case 10:
                    npc = new MageNpcType();
                    break;
                case 11:
                    npc = new NpcPartyType();
                    break;
                case 12:
                    npc = new BanditType();
                    break;
            }
        }
        else if (isBarren || isMountains || isHills) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new BanditType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new MerchantType();
                    break;
                case 6:
                    npc = new ClericNpcType();
                    break;
                case 7:
                    npc = new TraderType();
                    break;
                case 8:
                    npc = new BerserkerType();
                    break;
                case 9:
                    npc = new FighterNpcType();
                    break;
                case 10:
                    npc = new MageNpcType();
                    break;
                case 11:
                    npc = new NpcPartyType();
                    break;
                case 12:
                    npc = new BanditType();
                    break;
            }
        }
        else if (terrain instanceof Desert) {
            switch (number) {
                case 1:
                    npc = new NomadType();
                    break;
                case 2:
                    npc = new NomadType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new MerchantType();
                    break;
                case 5:
                    npc = new NomadType();
                    break;
                case 6:
                    npc = new NomadType();
                    break;
                case 7:
                    npc = new ClericNpcType();
                    break;
                case 8:
                    npc = new MageNpcType();
                    break;
                case 9:
                    npc = new FighterNpcType();
                    break;
                case 10:
                    npc = new NobleType();
                    break;
                case 11:
                    npc = new NomadType();
                    break;
                case 12:
                    npc = new NomadType();
                    break;
            }
        }
        else if (terrain instanceof Inhabited) {
            switch (number) {
                case 1:
                    npc = new BanditType();
                    break;
                case 2:
                    npc = new TraderType()  ;
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new MerchantType();
                    break;
                case 6:
                    npc = new VeteranType();
                    break;
                case 7:
                    npc = new BanditType();
                    break;
                case 8:
                    npc = new FighterNpcType();
                    break;
                case 9:
                    npc = new MageNpcType();
                    break;
                case 10:
                    npc = new AcolyteType();
                    break;
                case 11:
                    npc = new ClericNpcType();
                    break;
                case 12:
                    npc = new NobleType();
                    break;
            }
        }
        else if (terrain instanceof City) {
            switch (number) {
                case 1:
                    npc = new BanditType();
                    break;
                case 2:
                    npc = new TraderType();
                    break;
                case 3:
                    npc = new NpcPartyType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new MerchantType();
                    break;
                case 6:
                    npc = new VeteranType();
                    break;
                case 7:
                    npc = new MerchantType();
                    break;
                case 8:
                    npc = new FighterNpcType();
                    break;
                case 9:
                    npc = new MageNpcType();
                    break;
                case 10:
                    npc = new ClericNpcType();
                    break;
                case 11:
                    npc = new ClericNpcType();
                    break;
                case 12:
                    npc = new NobleType();
                    break;
            }
        }
        else if (terrain instanceof Ocean) {
            switch (number) {
                case 1:
                    npc = new BuccaneerType();
                    break;
                case 2:
                    npc = new PirateType();
                    break;
                case 3:
                    npc = new MerchantType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new PirateType();
                    break;
                case 6:
                    npc = new MerchantType();
                    break;
                case 7:
                    npc = new MerchantType();
                    break;
                case 8:
                    npc = new MerchantType();
                    break;
                case 9:
                    npc = new BuccaneerType();
                    break;
                case 10:
                    npc = new PirateType();
                    break;
                case 11:
                    npc = new MerchantType();
                    break;
                case 12:
                    npc = new PirateType();
                    break;
            }
        }
        else if (terrain instanceof Jungle) {
            switch (number) {
                case 1:
                    npc = new BrigandType();
                    break;
                case 2:
                    npc = new TraderType();
                    break;
                case 3:
                    npc = new BanditType();
                    break;
                case 4:
                    npc = new NpcPartyType();
                    break;
                case 5:
                    npc = new ClericNpcType();
                    break;
                case 6:
                    npc = new FighterNpcType();
                    break;
                case 7:
                    npc = new MediumType();
                    break;
                case 8:
                    npc = new BerserkerType();
                    break;
                case 9:
                    npc = new BrigandType();
                    break;
                case 10:
                    npc = new TribesmanType();
                    break;
                case 11:
                    npc = new NpcPartyType();
                    break;
                case 12:
                    npc = new BrigandType();
                    break;
            }
        }

        return npc;
    }

}
