package com.ack.adventureandconquer.game.character;

import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.dice.IsDiceSet;
import com.ack.adventureandconquer.game.dice.NormalDiceSet;
import com.ack.adventureandconquer.game.klass.AntiPaladin;
import com.ack.adventureandconquer.game.klass.Assassin;
import com.ack.adventureandconquer.game.klass.Barbarian;
import com.ack.adventureandconquer.game.klass.Bard;
import com.ack.adventureandconquer.game.klass.Cleric;
import com.ack.adventureandconquer.game.klass.Explorer;
import com.ack.adventureandconquer.game.klass.Fighter;
import com.ack.adventureandconquer.game.klass.IsClass;
import com.ack.adventureandconquer.game.klass.Mage;
import com.ack.adventureandconquer.game.klass.Mystic;
import com.ack.adventureandconquer.game.klass.Paladin;
import com.ack.adventureandconquer.game.klass.Thief;
import com.ack.adventureandconquer.game.klass.Venturer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saskyrar on 11/03/15.
 */
public class CharacterBuilder {

    private IsCharacter character;
    private IsDiceSet diceSet;
    private IsClass preferredClass;

    public CharacterBuilder(IsCharacter characterClass) {
        this.character = characterClass;
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

        // Set class
        IsClass characterClass = getPreferredClass();
        character.setClassStrategy(characterClass);

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
                    List<IsClass> maleClassList = new ArrayList<>();
                    maleClassList.add(new Explorer());
                    maleClassList.add(new Thief());
                    maleClassList.add(new Mystic());
                    maleClassList.add(new Assassin());
                    maleClassList.add(new Bard());
                    maleClassList.add(new Cleric());
                    maleClassList.add(new AntiPaladin());
                    maleClassList.add(new Fighter());
                    maleClassList.add(new Mage());
                    maleClassList.add(new Paladin());
                    maleClassList.add(new Barbarian());
                    maleClassList.add(new Venturer());

                    IsDice d12 = dices.getD12Dice();
                    int classRole = d12.role() - 1;

                    preferredClass = maleClassList.get(classRole);
                }
                // Female
                else {
                    //
                }
            }
        }

        characterClass = preferredClass;
        return characterClass;
    }
}
