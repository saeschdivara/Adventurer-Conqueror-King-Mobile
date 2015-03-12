package com.ack.adventureandconquer.info.game.dice;

/**
 * Created by saskyrar on 12/03/15.
 */
public class FakeDice implements IsDice {

    private int[] roles;
    private int rolesCounter;

    public FakeDice(int[] roles) {
        this.roles = roles;
    }

    @Override
    public int role() {

        int returnValue = roles[rolesCounter];
        if (++rolesCounter == roles.length) {
            rolesCounter = 0;
        }

        return returnValue;
    }
}
