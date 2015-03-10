package com.ack.adventureandconquer.info.game.character;

import com.ack.adventureandconquer.info.game.klass.IsClass;

/**
 * Created by saskyrar on 05/03/15.
 */
public class Character implements IsCharacter {

    private IsClass classStrategy;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setClassStrategy(IsClass classStrategy) {
        this.classStrategy = classStrategy;
    }

    @Override
    public long getExperience() {
        return classStrategy.getExperience();
    }

    @Override
    public void setExperience(long experience) {
        classStrategy.setExperience(experience);
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
    public int getPetrificationParalysisSaving() {
        return classStrategy.getPetrificationParalysisSaving();
    }

    @Override
    public int getPoisonDeathSaving() {
        return classStrategy.getPoisonDeathSaving();
    }

    @Override
    public int getBlastBreathSaving() {
        return classStrategy.getBlastBreathSaving();
    }

    @Override
    public int getStaffsWandsSaving() {
        return classStrategy.getStaffsWandsSaving();
    }

    @Override
    public int getSpellsSaving() {
        return classStrategy.getSpellsSaving();
    }

    @Override
    public int getAttackThrow() {
        return classStrategy.getAttackThrow();
    }
}
