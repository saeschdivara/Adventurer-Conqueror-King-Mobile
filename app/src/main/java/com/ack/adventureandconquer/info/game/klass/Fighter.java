package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Fighter extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 2000;
    }

    @Override
    protected long getLevel3Experience() {
        return 4000;
    }

    @Override
    protected long getLevel4Experience() {
        return 8000;
    }

    @Override
    protected long getLevel5Experience() {
        return 16000;
    }

    @Override
    protected long getLevel6Experience() {
        return 32000;
    }

    @Override
    protected long getLevel7Experience() {
        return 65000;
    }

    @Override
    protected long getLevel8Experience() {
        return 130000;
    }

    @Override
    protected long getLevel9Experience() {
        return 250000;
    }

    @Override
    protected long getLevel10Experience() {
        return 370000;
    }

    @Override
    protected long getLevel11Experience() {
        return 490000;
    }

    @Override
    protected long getLevel12Experience() {
        return 610000;
    }

    @Override
    protected long getLevel13Experience() {
        return 730000;
    }

    @Override
    protected long getLevel14Experience() {
        return 850000;
    }

    @Override
    protected String getLevel1Title() {
        return "Man-at-Arms";
    }

    @Override
    protected String getLevel2Title() {
        return "Warrior";
    }

    @Override
    protected String getLevel3Title() {
        return "Swordmaster";
    }

    @Override
    protected String getLevel4Title() {
        return "Hero";
    }

    @Override
    protected String getLevel5Title() {
        return "Exemplar";
    }

    @Override
    protected String getLevel6Title() {
        return "Myrmidon";
    }

    @Override
    protected String getLevel7Title() {
        return "Champion";
    }

    @Override
    protected String getLevel8Title() {
        return "Epic Hero";
    }

    @Override
    protected String getLevel9Title() {
        return "Warlord";
    }

    @Override
    protected String getLevel10Title() {
        return "Warlord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Warlord (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Warlord (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Warlord (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Overlord";
    }
}
