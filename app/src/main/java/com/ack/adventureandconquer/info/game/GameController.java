package com.ack.adventureandconquer.info.game;

import android.os.Environment;

import com.ack.adventureandconquer.info.game.adventure.Encounter;
import com.google.gson.Gson;
import com.snappydb.DB;
import com.snappydb.DBFactory;
import com.snappydb.SnappydbException;

import java.io.File;

/**
 * Created by saskyrar on 20/01/15.
 */
public class GameController {
    private static GameController instance = null;

    private final static String DB_ENCOUNTER_COUNTER = "encounters";

    private Encounter lastEncounter = null;

    private GameController() {}

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }

        return instance;
    }

    public void addEncounter(Encounter encounter) {
        lastEncounter = encounter;
    }

    public Encounter getLastEncounter() {
        return lastEncounter;
    }

    public void destroyData() {
        File file = new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_DCIM
                ),
                "ack"
        );
        try {
            DB snappydb = DBFactory.open(file.getAbsolutePath());
            snappydb.destroy();
        }
        catch (SnappydbException exc) {
        }
    }

    public void loadEncounters() {
        try {
            File file = new File(
                    Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_DCIM
                    ),
                    "ack"
            );

            file.mkdirs();

            DB snappydb = DBFactory.open(file.getAbsolutePath());

            Gson gson = new Gson();

            if (snappydb.countKeys(DB_ENCOUNTER_COUNTER) != 0) {
//                snappydb.findKeysBetween("enc:0", "enc:3");
                String encounterString = snappydb.get("enc:1");
                System.out.printf("New json: " + encounterString);

                // TODO: This should probably be done in a different thread
                Encounter enc = gson.fromJson(encounterString, Encounter.class);
                System.out.println(enc);
            }
            else {
                snappydb.putInt(DB_ENCOUNTER_COUNTER, 0);
            }

            snappydb.close();

        } catch (SnappydbException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void saveEncounter() {

        try {
            File file = new File(
                    Environment.getExternalStoragePublicDirectory(
                            Environment.DIRECTORY_DCIM
                    ),
                    "ack"
            );

            file.mkdirs();

            DB snappydb = DBFactory.open(file.getAbsolutePath());

            Gson gson = new Gson();

            if (snappydb.countKeys(DB_ENCOUNTER_COUNTER) == 0) {
                snappydb.putInt(DB_ENCOUNTER_COUNTER, 0);
            }

            int encounterNumber = snappydb.getInt(DB_ENCOUNTER_COUNTER);

            // We count this new one already
            encounterNumber++;

            String encounterEntryKey = "enc:" + String.valueOf(encounterNumber);
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
}
