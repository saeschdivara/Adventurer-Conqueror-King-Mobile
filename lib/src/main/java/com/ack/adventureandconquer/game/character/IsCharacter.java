package com.ack.adventureandconquer.game.character;

import com.ack.adventureandconquer.game.klass.IsClass;

/**
 * Created by saskyrar on 05/03/15.
 */
public interface IsCharacter extends IsClass {

    public void setClassStrategy(IsClass classStrategy);
    public IsClass getClassStrategy();
}
