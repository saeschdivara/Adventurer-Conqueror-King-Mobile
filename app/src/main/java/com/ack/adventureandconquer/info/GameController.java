package com.ack.adventureandconquer.info;

import com.ack.adventureandconquer.game.adventure.Encounter;
import com.ack.adventureandconquer.game.character.Character;
import com.ack.adventureandconquer.game.character.PlayerCharacter;
import com.ack.adventureandconquer.game.klass.Mage;
import com.google.gson.Gson;
import com.snappydb.DB;
import com.snappydb.DBFactory;
import com.snappydb.SnappydbException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 20/01/15.
 */
public class GameController {
    private static GameController instance = null;

    private final static String DB_ENCOUNTER_COUNTER = "encounters";
    private final static String DB_ENCOUNTER_PREFIX = "enc:";

    private Encounter lastEncounter = null;
    private File dbPath;

    private GameController() {}

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }

        return instance;
    }

    public void setPath(File file) {
        dbPath = file;
    }

    public void addEncounter(Encounter encounter) {
        lastEncounter = encounter;
    }

    public Encounter getLastEncounter() {
        return lastEncounter;
    }

    public void destroyData() {
        try {
            DB snappydb = getDatabase();
            snappydb.destroy();
        }
        catch (SnappydbException exc) {
        }
    }

    public List<Encounter> loadEncounters() {

        List<Encounter> encounters = new ArrayList<>();

        try {

            DB snappydb = getDatabase();

            Gson gson = new Gson();

            if (snappydb.countKeys(DB_ENCOUNTER_COUNTER) != 0) {
                String encounterString = snappydb.get("enc:1");
                System.out.printf("New json: " + encounterString);

                // TODO: This should probably be done in a different thread
                Encounter enc = gson.fromJson(encounterString, Encounter.class);
                encounters.add(enc);
                System.out.println(enc);
            }
            else {
                snappydb.putInt(DB_ENCOUNTER_COUNTER, 0);
            }

            snappydb.close();

        } catch (SnappydbException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        return encounters;
    }

    public void saveEncounter() {

        try {
            DB snappydb = getDatabase();

            Gson gson = new Gson();

            if (snappydb.countKeys(DB_ENCOUNTER_COUNTER) == 0) {
                snappydb.putInt(DB_ENCOUNTER_COUNTER, 0);
            }

            int encounterNumber = snappydb.getInt(DB_ENCOUNTER_COUNTER);

            // We count this new one already
            encounterNumber++;

            String encounterEntryKey = DB_ENCOUNTER_PREFIX + String.valueOf(encounterNumber);
            String encounterJson = gson.toJson(lastEncounter);

            System.out.println(encounterEntryKey);
            System.out.println(encounterJson);

            // Save encounter to the db
            snappydb.put(encounterEntryKey, encounterJson);

            // Save encounter number
            snappydb.putInt(DB_ENCOUNTER_COUNTER, encounterNumber);

            snappydb.close();

        } catch (SnappydbException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public List<Character> loadCharacterList() {

        List<Character> characters = new ArrayList<>();

        PlayerCharacter pl1 = new PlayerCharacter();
        pl1.setName("Conen");
        pl1.setClassStrategy(new Mage());
        pl1.setExperience(20000);

        characters.add(pl1);

        try {
            DB snappydb = getDatabase();

            snappydb.close();
        }
        catch (SnappydbException exc) {
        }

        return characters;
    }

    private DB getDatabase() throws SnappydbException{

        dbPath.mkdirs();

        DB snappydb = DBFactory.open(dbPath.getAbsolutePath());
        return snappydb;


    }
}
