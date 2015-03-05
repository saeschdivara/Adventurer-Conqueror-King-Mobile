package com.ack.adventureandconquer.info.game.character;

import com.ack.adventureandconquer.info.game.klass.IsClass;

/**
 * Created by saskyrar on 05/03/15.
 */
public class Character implements IsCharacter {

    private IsClass classStrategy;

    @Override
    public void setClassStrategy(IsClass classStrategy) {
        this.classStrategy = classStrategy;
    }

    @Override
    public String getTitle() {
        return classStrategy.getTitle();
    }

    @Override
    public int getLevel() {
        return classStrategy.getLevel();
    }

    @Override
    public void setLevel(int level) {
        classStrategy.setLevel(level);
    }

    @Override
    public int getPetrificationParalysisSaving(int level) {
        return 0;
    }

    @Override
    public int getPoisonDeathSaving(int level) {
        return 0;
    }

    @Override
    public int getBlastBreathSaving(int level) {
        return 0;
    }

    @Override
    public int getStaffsWandsSaving(int level) {
        return 0;
    }

    @Override
    public int getSpellsSaving(int level) {
        return 0;
    }

    @Override
    public int getAttackThrow(int level) {
        return 0;
    }
}
