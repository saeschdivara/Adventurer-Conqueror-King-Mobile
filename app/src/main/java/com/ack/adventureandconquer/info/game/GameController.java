package com.ack.adventureandconquer.info.game;

import com.ack.adventureandconquer.info.game.adventure.Encounter;

/**
 * Created by saskyrar on 20/01/15.
 */
public class GameController {
    private static GameController instance = null;

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
}
