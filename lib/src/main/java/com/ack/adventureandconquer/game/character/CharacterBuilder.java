package com.ack.adventureandconquer.game.character;

import com.ack.adventureandconquer.game.dice.IsDice;
import com.ack.adventureandconquer.game.dice.IsDiceSet;
import com.ack.adventureandconquer.game.dice.NormalDiceSet;
import com.ack.adventureandconquer.game.klass.AntiPaladin;
import com.ack.adventureandconquer.game.klass.Assassin;
import com.ack.adventureandconquer.game.klass.Barbarian;
import com.ack.adventureandconquer.game.klass.Bard;
import com.ack.adventureandconquer.game.klass.Bladedancer;
import com.ack.adventureandconquer.game.klass.Cleric;
import com.ack.adventureandconquer.game.klass.Explorer;
import com.ack.adventureandconquer.game.klass.Fighter;
import com.ack.adventureandconquer.game.klass.IsClass;
import com.ack.adventureandconquer.game.klass.Mage;
import com.ack.adventureandconquer.game.klass.Mystic;
import com.ack.adventureandconquer.game.klass.Paladin;
import com.ack.adventureandconquer.game.klass.Priestess;
import com.ack.adventureandconquer.game.klass.Shaman;
import com.ack.adventureandconquer.game.klass.Thief;
import com.ack.adventureandconquer.game.klass.Venturer;
import com.ack.adventureandconquer.game.klass.Warlock;
import com.ack.adventureandconquer.game.klass.Witch;

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
                // Mystic, Tharrasian Gladiator, Nubiran Wonderworker, Zaharan RuianGuard
            }
            // Human classes
            else {
                int genderRole = d6.role();

                IsDice d4 = dices.getD4Dice();
                int proficencyTypeRole = d4.role();

                // Male
                if (genderRole <= 3) {

                    // Fighter
                    if (proficencyTypeRole == 1) {
                        IsClass[] maleFighters = {
                                new Fighter(),
                                new Barbarian(),
                                new Explorer(),
                                new AntiPaladin(),
                                new Assassin(),
                                new Paladin(),
                        };

                        preferredClass = maleFighters[d6.role() - 1];
                    }
                    // Mage
                    else if (proficencyTypeRole == 2) {
                        IsClass[] maleMages = {
                                new Mage(),
                                new Warlock(),
                        };

                        IsDice d2 = dices.getD2Dice();
                        preferredClass = maleMages[d2.role() - 1];
                    }
                    // Cleric
                    else if (proficencyTypeRole == 3) {
                        IsClass[] maleClerics = {
                                new Cleric(),
                                new Shaman(),
                        };

                        IsDice d2 = dices.getD2Dice();
                        preferredClass = maleClerics[d2.role() - 1];
                    }
                    // Thief
                    else if (proficencyTypeRole == 4) {
                        IsClass[] maleThiefs = {
                                new Thief(),
                                new Bard(),
                                new Venturer(),
                        };

                        IsDice d3 = dices.getD3Dice();
                        preferredClass = maleThiefs[d3.role() - 1];
                    }
                }
                // Female
                else {
                    List<IsClass> femaleClassList = new ArrayList<>();
                    femaleClassList.add(new Explorer());
                    femaleClassList.add(new Thief());
                    femaleClassList.add(new Mystic());
                    femaleClassList.add(new Assassin());
                    femaleClassList.add(new Bard());
                    femaleClassList.add(new Cleric());
                    femaleClassList.add(new AntiPaladin());
                    femaleClassList.add(new Fighter());
                    femaleClassList.add(new Bladedancer());
                    femaleClassList.add(new Mage());
                    femaleClassList.add(new Paladin());
                    femaleClassList.add(new Barbarian());
                    femaleClassList.add(new Priestess());
                    femaleClassList.add(new Shaman());
                    femaleClassList.add(new Warlock());
                    femaleClassList.add(new Witch());
                    femaleClassList.add(new Venturer());
                }
            }
        }

        characterClass = preferredClass;
        return characterClass;
    }
}
