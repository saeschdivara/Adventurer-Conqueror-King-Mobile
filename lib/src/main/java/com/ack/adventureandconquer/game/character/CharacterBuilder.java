package com.ack.adventureandconquer.game.character;

import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.dice.IsDiceSet;
import com.ack.adventureandconquer.game.dice.NormalDiceSet;
import com.ack.adventureandconquer.game.klass.IsClass;

/**
 * Created by saskyrar on 11/03/15.
 */
public class CharacterBuilder {

    private IsCharacter character;
    private IsDiceSet diceSet;
    private IsClass preferredClass;

    public CharacterBuilder(Class<IsCharacter> characterClass) {
        try {
            this.character = characterClass.newInstance();
        }
        catch (Exception exc) {
            System.out.println("Building failed");
        }
    }

    public CharacterBuilder withDiceSet(IsDiceSet diceSet) {
        this.diceSet = diceSet;
        return this;
    }

    public CharacterBuilder withClass(IsClass preferredClass) {
        this.preferredClass = preferredClass;
        return this;
    }

    public IsCharacter build() {

        IsDiceSet dices = getDiceSet();
        IsClass characterClass = getPreferredClass();

        return character;
    }

    protected IsDiceSet getDiceSet() {
        if (diceSet == null)
            diceSet = new NormalDiceSet();

        return diceSet;
    }

    protected IsClass getPreferredClass() {
        IsClass characterClass = null;

        if (preferredClass == null) {
            IsDiceSet dices = getDiceSet();
            IsDice d6 = dices.getD6Dice();

            int raceClassRole = d6.role();

            // Demi Human classes
            if (raceClassRole == 1) {
                int typeRole = d6.role();
                // Magical
                if (typeRole <= 3) {
                    //
                }
                // Fighter
                else {
                    //
                }
            }
            // Special classes
            else if (raceClassRole == 6) {
                //
            }
            // Human classes
            else {
                int genderRole = d6.role();
                // Male
                if (genderRole <= 3) {
                    //
                }
                // Female
                else {
                    //
                }
            }
        }
        else {
            characterClass = preferredClass;
        }

        return characterClass;
    }
}
