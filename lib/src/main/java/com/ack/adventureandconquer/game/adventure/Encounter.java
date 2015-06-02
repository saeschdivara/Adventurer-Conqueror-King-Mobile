package com.ack.adventureandconquer.game.adventure;

import com.ack.adventureandconquer.game.creature.IsCreatureType;
import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;
import com.ack.adventureandconquer.game.dice.D10;
import com.ack.adventureandconquer.game.dice.D20;
import com.ack.adventureandconquer.game.dice.D4;
import com.ack.adventureandconquer.game.dice.D6;
import com.ack.adventureandconquer.game.dice.D8;
import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.json.CreatureTypeAdapter;
import com.ack.adventureandconquer.game.json.NpcListTypeAdapter;
import com.ack.adventureandconquer.game.json.NpcTypeAdapter;
import com.google.gson.annotations.JsonAdapter;

import java.util.List;

/**
 * Created by saskyrar on 20/01/15.
 */
public class Encounter {

    protected static IsDice d4 = new D4();
    protected static IsDice d6 = new D6();
    protected static IsDice d8 = new D8();
    protected static IsDice d10 = new D10();
    protected static IsDice d20 = new D20();

    @JsonAdapter(CreatureTypeAdapter.class)
    private IsCreatureType creatureType;

    @JsonAdapter(NpcTypeAdapter.class)
    private IsNpcType npcType;

    private boolean isLair;

    private String wildernessType;


    @JsonAdapter(NpcListTypeAdapter.class)
    private List<Npc> encounterNpcs;

    private String encounterGroupName;

    public IsCreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(IsCreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public IsNpcType getNpcType() {
        return npcType;
    }

    public void setNpcType(IsNpcType npcType) {
        this.npcType = npcType;
    }

    public boolean isLair() {
        return isLair;
    }

    public void setLair(boolean isLair) {
        this.isLair = isLair;
    }

    public List<Npc> getEncounterNpcs() {
        return encounterNpcs;
    }

    public void setEncounterNpcs(List<Npc> encounterNpcs) {
        this.encounterNpcs = encounterNpcs;
    }

    public String getEncounterGroupName() {
        return encounterGroupName;
    }

    public void setEncounterGroupName(String encounterGroupName) {
        this.encounterGroupName = encounterGroupName;
    }

    public String isWildernessType(){
        return wildernessType ;
    }

    public void setWildernessType (String wildernessType){
        this.wildernessType = wildernessType;
    }

    public String getDescription() {
        String encounterDescription = "You have found: " + getCreatureType().getClass().getSimpleName() + "\n";
        encounterDescription += getNpcType().getClass().getSimpleName() + "\n";
        encounterDescription += "is lair: " + String.valueOf(isLair) + "\n";
        encounterDescription += "Encounter Group Name: " + getEncounterGroupName() + "\n";
        encounterDescription += "Group Size: " + String.valueOf(getEncounterNpcs().size()) + "\n";
        encounterDescription += "Encounter distance: "+ encounterDistance(wildernessType);

        return encounterDescription;
    }


    private String encounterDistance (String terrain) {
        String result = "";
        int dist = 0;
        switch (terrain) {
            case "Barren":
                if (d4.role() > 1){ dist =(d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                    result = "Plains:" + dist;}
                else { dist =(d6.role() + d6.role())*10;
                    result = "Badlands:" + dist;
                }
                break;

            case "City":
                if (d4.role() > 2){ dist =d4.role() + d4.role() + d4.role() + d4.role()+ d4.role();
                    result = "Urban Jungle:" + dist;}
                else { dist =d8.role() + d8.role() + d8.role() + d8.role() + d8.role();
                    result = "Light open Streets:" + dist;
                }
                break;

            case "Clear":
                if (d4.role() >= 3){ dist =(d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                    result = "Plains:" + dist;}
                else if (d4.role() == 2) { dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Fallow Fields:" + dist;
                }else if (d4.role() == 1) { dist =(d6.role() + d6.role() + d6.role() )*5;
                    result = "Wild Fields:" + dist;

                }
                break;

            case "Desert":
                if (d4.role() > 1){ dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Desert:" + dist;}
                else { dist =(d6.role() + d6.role())*10;
                    result = "Badlands:" + dist;
                }
                break;

            case "Grass":
                if (d4.role() > 2){ dist = (d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                    result = "Plains:" +dist;}
                else { dist =d10.role() + d10.role() + d10.role() + d10.role() + d10.role();
                    result = "Ripe Fields:" + dist;
                }
                break;

            case "Hills":
                if (d4.role() > 2){ dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Mountains:" + dist;}
                else { dist = d8.role() + d8.role() + d8.role() + d8.role() + d8.role();
                    result = "Light woods:" +dist;
                }
                break;

            case "Inhabited":
                if (d4.role() > 2){ dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Fallow Fields:" + dist;}
                else if (d4.role() == 2) { dist =(d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                    result = "Plains:" + dist;
                }else if (d4.role() == 1) { dist =d10.role() + d10.role() + d10.role() + d10.role() + d10.role();
                    result = "Ripe Fields:" + dist;

                }
                break;

            case "Jungle":
                 dist =d4.role() + d4.role() + d4.role() + d4.role() + d4.role();
                result = "Heavy woods:" + dist;

                break;

            case "Mountain":
                if (d4.role() > 1){ dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Mountains:" + dist;}
                else { dist =(d6.role() + d6.role())*10;
                    result = "Badlands:" + dist;
                }
                break;

            case "Ocean": dist =(d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                result = "Ocean:" + dist;

                break;

            case "River":
                if (d4.role() > 1){ dist =d10.role() + d10.role() + d10.role() + d10.role() + d10.role()+ d10.role() + d10.role() + d10.role();
                    result = "Marsh:" + dist;}
                else { dist =d8.role() + d8.role() + d8.role() + d8.role() + d8.role();
                    result = "Light woods:" + dist;
                }
                break;

            case "Scrub":
                if (d4.role() > 2){ dist =(d20.role() + d20.role() + d20.role() + d20.role() + d20.role())*10;
                    result = "Plains:" + dist;}
                else { dist =(d6.role() + d6.role() + d6.role() + d6.role())*10;
                    result = "Fallow Fields:" + dist;
                }
                break;

            case "Swamp":
                if (d4.role() > 2){ dist =d10.role() + d10.role() + d10.role() + d10.role() + d10.role()+ d10.role() + d10.role() + d10.role();
                    result = "Marsh:" + dist;}
                else {
                     dist =d8.role() + d8.role() + d8.role() + d8.role() + d8.role();
                            result = "Light woods:" + dist;
                }
                break;

            case "Woods":
                if (d4.role() > 2) {
                     dist = d4.role() + d4.role() + d4.role() + d4.role() + d4.role();
                    result = "Heavy woods:" + dist;
                }else {
                     dist = d8.role() + d8.role() + d8.role() + d8.role() + d8.role();
                    result = "Light woods:" + dist;
                }
                break;
        }
        return result;
    }
}
