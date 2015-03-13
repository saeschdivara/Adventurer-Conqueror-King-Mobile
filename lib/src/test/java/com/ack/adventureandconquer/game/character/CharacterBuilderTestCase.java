package com.ack.adventureandconquer.game.character;

import com.ack.adventureandconquer.game.dice.FakeDice;
import com.ack.adventureandconquer.game.dice.FakeDiceSet;
import com.ack.adventureandconquer.game.klass.Cleric;
import com.ack.adventureandconquer.game.klass.IsClass;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by saskyrar on 12/03/15.
 */
public class CharacterBuilderTestCase extends TestCase {

    @Test
    public void testMe() {

        FakeDiceSet diceSet = new FakeDiceSet();

        diceSet.setD6(new FakeDice(new int[]{
                2, // Human
                1, // Male
        }));

        diceSet.setD12(new FakeDice(new int[]{
                6, // Cleric
        }));

        CharacterBuilder builder = new CharacterBuilder(new PlayerCharacter());
        builder.withDiceSet(diceSet);
        IsCharacter character = builder.build();

        IsClass cls = character.getClassStrategy();
        assertNotNull(cls);
        assertTrue( cls.getClass() == Cleric.class);
    }

}
