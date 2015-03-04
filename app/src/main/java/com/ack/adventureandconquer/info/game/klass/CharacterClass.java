package com.ack.adventureandconquer.info.game.klass;

import com.ack.adventureandconquer.info.game.creature.npc.Npc;

/**
 * Created by saskyrar on 03/03/15.
 */
public abstract class CharacterClass extends Npc implements IsClass {
    private long experience;

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    @Override
    public int getLevel() {

        long experience = getExperience();

        if (experience >= 0 && experience < getLevel2Experience()) {
            return 1;
        }
        else if (experience >= getLevel2Experience() && experience < getLevel3Experience()) {
            return 2;
        }
        else if (experience >= getLevel3Experience() && experience < getLevel4Experience()) {
            return 3;
        }
        else if (experience >= getLevel4Experience() && experience < getLevel5Experience()) {
            return 4;
        }
        else if (experience >= getLevel5Experience() && experience < getLevel6Experience()) {
            return 5;
        }
        else if (experience >= getLevel6Experience() && experience < getLevel7Experience()) {
            return 6;
        }
        else if (experience >= getLevel7Experience() && experience < getLevel8Experience()) {
            return 7;
        }
        else if (experience >= getLevel8Experience() && experience < getLevel9Experience()) {
            return 8;
        }
        else if (experience >= getLevel9Experience() && experience < getLevel10Experience()) {
            return 9;
        }
        else if (experience >= getLevel10Experience() && experience < getLevel11Experience()) {
            return 10;
        }
        else if (experience >= getLevel11Experience() && experience < getLevel12Experience()) {
            return 11;
        }
        else if (experience >= getLevel12Experience() && experience < getLevel13Experience()) {
            return 12;
        }
        else if (experience >= getLevel13Experience() && experience < getLevel14Experience()) {
            return 13;
        }
        else {
            return 14;
        }
    }

    @Override
    public void setLevel(int level) {

        if (level == 1) {
            setExperience(0);
        }
        else if (level == 2) {
            setExperience(getLevel2Experience());
        }
        else if (level == 3) {
            setExperience(getLevel3Experience());
        }
        else if (level == 4) {
            setExperience(getLevel4Experience());
        }
        else if (level == 5) {
            setExperience(getLevel5Experience());
        }
        else if (level == 6) {
            setExperience(getLevel6Experience());
        }
        else if (level == 7) {
            setExperience(getLevel7Experience());
        }
        else if (level == 8) {
            setExperience(getLevel8Experience());
        }
        else if (level == 9) {
            setExperience(getLevel9Experience());
        }
        else if (level == 10) {
            setExperience(getLevel10Experience());
        }
        else if (level == 11) {
            setExperience(getLevel11Experience());
        }
        else if (level == 12) {
            setExperience(getLevel12Experience());
        }
        else if (level == 13) {
            setExperience(getLevel13Experience());
        }
        else {
            setExperience(getLevel14Experience());
        }
    }

    @Override
    public String getTitle() {

        int level = getLevel();

        if (level == 1) {
            return getLevel1Title();
        }
        else if (level == 2) {
            return getLevel2Title();
        }
        else if (level == 3) {
            return getLevel3Title();
        }
        else if (level == 4) {
            return getLevel4Title();
        }
        else if (level == 5) {
            return getLevel5Title();
        }
        else if (level == 6) {
            return getLevel6Title();
        }
        else if (level == 7) {
            return getLevel7Title();
        }
        else if (level == 8) {
            return getLevel8Title();
        }
        else if (level == 9) {
            return getLevel9Title();
        }
        else if (level == 10) {
            return getLevel10Title();
        }
        else if (level == 11) {
            return getLevel11Title();
        }
        else if (level == 12) {
            return getLevel12Title();
        }
        else if (level == 13) {
            return getLevel13Title();
        }
        else {
            return getLevel14Title();
        }
    }

    abstract protected long getLevel2Experience();
    abstract protected long getLevel3Experience();
    abstract protected long getLevel4Experience();
    abstract protected long getLevel5Experience();
    abstract protected long getLevel6Experience();
    abstract protected long getLevel7Experience();
    abstract protected long getLevel8Experience();
    abstract protected long getLevel9Experience();
    abstract protected long getLevel10Experience();
    abstract protected long getLevel11Experience();
    abstract protected long getLevel12Experience();
    abstract protected long getLevel13Experience();
    abstract protected long getLevel14Experience();

    abstract protected String getLevel1Title();
    abstract protected String getLevel2Title();
    abstract protected String getLevel3Title();
    abstract protected String getLevel4Title();
    abstract protected String getLevel5Title();
    abstract protected String getLevel6Title();
    abstract protected String getLevel7Title();
    abstract protected String getLevel8Title();
    abstract protected String getLevel9Title();
    abstract protected String getLevel10Title();
    abstract protected String getLevel11Title();
    abstract protected String getLevel12Title();
    abstract protected String getLevel13Title();
    abstract protected String getLevel14Title();
}
