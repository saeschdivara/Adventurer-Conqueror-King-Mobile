package com.ack.adventureandconquer.info.game.character;

import com.ack.adventureandconquer.info.game.klass.IsClass;

/**
 * Created by saskyrar on 05/03/15.
 */
public interface IsCharacter {

    public void setClassStrategy(IsClass classStrategy);

    public String getTitle();

    public int getLevel();
    public void setLevel(int level);

    public int getPetrificationParalysisSaving(int level);
    public int getPoisonDeathSaving(int level);
    public int getBlastBreathSaving(int level);
    public int getStaffsWandsSaving(int level);
    public int getSpellsSaving(int level);

    public int getAttackThrow(int level);
}
