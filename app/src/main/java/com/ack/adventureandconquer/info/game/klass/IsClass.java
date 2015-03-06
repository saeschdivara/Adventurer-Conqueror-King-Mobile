package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public interface IsClass {

    public String getTitle();

    public int getLevel();
    public void setLevel(int level);

    public int getPetrificationParalysisSaving();
    public int getPoisonDeathSaving();
    public int getBlastBreathSaving();
    public int getStaffsWandsSaving();
    public int getSpellsSaving();

    public int getAttackThrow();

}
