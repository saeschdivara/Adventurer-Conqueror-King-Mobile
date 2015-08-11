package com.ack.adventureandconquer.game.creature;

import com.ack.adventureandconquer.game.adventure.IsTerrain;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.animal.PythonSnakeType;
import com.ack.adventureandconquer.game.creature.npc.dragon.AdultDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.AncientDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.BasiliskType;
import com.ack.adventureandconquer.game.creature.npc.dragon.CaeciliaType;
import com.ack.adventureandconquer.game.creature.npc.dragon.HydraType;
import com.ack.adventureandconquer.game.creature.npc.dragon.JuvenileDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.LamiaType;
import com.ack.adventureandconquer.game.creature.npc.dragon.MatureAdultDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.OldDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.PurpleWormType;
import com.ack.adventureandconquer.game.creature.npc.dragon.SalamanderType;
import com.ack.adventureandconquer.game.creature.npc.dragon.SpawnDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.VenerableDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.VeryOldDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.VeryYoungDragonType;
import com.ack.adventureandconquer.game.creature.npc.dragon.YoungDragonType;
import com.ack.adventureandconquer.game.creature.npc.flyer.ChimeraType;
import com.ack.adventureandconquer.game.creature.npc.flyer.SphinxType;
import com.ack.adventureandconquer.game.creature.npc.flyer.WyvernType;
import com.ack.adventureandconquer.game.creature.npc.swimmer.SeaHydraType;
import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.dice.RangeDice;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.D8;

import java.util.ArrayList;

/**
 * Created by saskyrar on 15/01/15.
 */
public class DragonType implements IsCreatureType {
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();


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

    public IsNpcType getDragon(IsTerrain terrain) {
        String type = null;
        String breathAttack = null;
        IsNpcType dragon = null;
        ArrayList<String> powers = null;
        int age = d8.role();

        if (terrain.getTerrainName().equals("Swamp")) {
            type = "black";
        }
        else if (terrain.getTerrainName().equals("Mountains")  ) {
            type = "blue";
        }
        else if (terrain.getTerrainName().equals("Desert")  ) {
            type = "brown";
        }
        else if (terrain.getTerrainName().equals("Woods")  ) {
            type = "green";
        }
        else if (terrain.getTerrainName().equals("Barren")  ) {
            type = "red";
        }
        else if (terrain.getTerrainName().equals("Ocean")  ) {
            type = "sea";
        }
        else if (terrain.getTerrainName().equals("River")  ) {
            type = "sea";
        }
        else if (terrain.getTerrainName().equals("Lake")  ) { //Does not yet exist
            type = "sea";
        }
        else {
            IsDice d9 = new RangeDice(1,9);

            switch (d9.role()) {
                case 1:
                    type = "black";
                    break;
                case 2:
                    type = "blue";
                    break;
                case 3:
                    type = "brown";
                    break;
                case 4:
                    type = "green";
                    break;
                case 5:
                    type = "metallic";
                    break;
                case 6:
                    type = "red";
                    break;
                case 7:
                    type = "sea";
                    break;
                case 8:
                    type = "white";
                    break;
                case 9:
                    type = "wyrm";
                    break;
            }
        }

        switch (type){
            case "black":
                breathAttack = "D6 damage, line of acid, 100' long 5' wide.";
                break;
            case "blue":
                breathAttack = "D6 damage, line of lightning bolts, 100' long 5' wide.";
                break;
            case "brown":
                breathAttack = "D6 damage, cone of scouring wind, 90' long 30' wide. Dust obscures and gives -2 to attacks into or through area.";
                break;
            case "green":
                breathAttack = "D6 damage, cloud of poison gas, around 40' long and 40' wide. Cloud obscures and gives -2 to attacks into or through area.";
                break;
            case "metallic":
                breathAttack = "D6 damage, cone of fire, 90' long 30' wide. ";
                break;
            case "red":
                breathAttack = "D6 damage, cone of fire, 90' long 30' wide. ";
                break;
            case "sea":
                breathAttack = "D6 damage, cloud of blistering steam, around 40' long and 40' wide. Cloud obscures and gives -2 to attacks into or through area.";
                break;
            case "white":
                breathAttack = "D6 damage, cloud of freezing vapor, 90' long 30' wide. Dust obscures and gives -2 to attacks into or through area.";
                break;
            case "wyrm":
                breathAttack = "D6 damage, cloud of fetid gas, around 40' long and 40' wide. Save or lose 1D4 Str, Dex and Con.";
                break;
        }

        switch (age) {
            case 2:
                dragon = new SpawnDragonType(type,breathAttack);
                break;
            case 3:
                dragon = new VeryYoungDragonType(type,breathAttack);
                break;
            case 4:
                dragon = new YoungDragonType(type,breathAttack);
                break;
            case 5:
                dragon = new JuvenileDragonType(type,breathAttack);
                break;
            case 6:
                dragon = new AdultDragonType(type,breathAttack);
                break;
            case 7:
                dragon = new MatureAdultDragonType(type,breathAttack);
                break;
            case 8:
                dragon = new OldDragonType(type,breathAttack);
                int evenOlder = (d6.role()-3);
                if (evenOlder == 1){
                    dragon = new VeryOldDragonType(type,breathAttack);
                }
                if (evenOlder == 2){
                    dragon = new AncientDragonType(type,breathAttack);
                }
                if (evenOlder == 3){
                    dragon = new VenerableDragonType(type,breathAttack);
                }
                break;
        }



        return dragon;
    }



    private IsNpcType getHydra(IsTerrain terrain) {
        IsNpcType hydra = null;

        if (terrain.getTerrainName().equals("Ocean")||terrain.getTerrainName().equals("River")) {
            hydra = new SeaHydraType();
        }
        else {
            hydra = new HydraType();
        }

        return hydra;
    }


}
