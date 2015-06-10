package com.ack.adventureandconquer.game.creature.npc.animal;

import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flhuebner on 20.05.2015.
 */
public class BlackWidowSpider extends Npc {


    public static List<Npc> getFlock() {
        int flockSize = d3.role();
        return createBlackWidowSpider(flockSize);
    }


    private static List<Npc> createBlackWidowSpider(int packSize) {
        List<Npc> pack = new ArrayList<>();

        for (int i = 1; i <= packSize; i++) {
            BlackWidowSpider spider = new BlackWidowSpider();
            spider.setExtraInformation("Her web acts like the spell, her poison kills in 1 turn");
            spider.setAttackRoutine("Bite 2D6,poison");
            spider.roleHitPoints();
            pack.add(spider);
        }

        return pack;
    }


    @Override
    public int getDefaultArmorClass() {
        return 3;
    }

    @Override
    public int getDefaultHitDice() {
        return 3;
    }

    @Override
    public int getDefaultMovement(){return 60;}

    @Override
    public int getDefaultExtraMovement(){return 120;}

    @Override
    public String getExtraMovementType(){return "Web";}

    @Override
    public int getDefaultMorale() {
        return 0;
    }

    @Override
    public String getDefaultSaves() {
        return "F2";
    }
}
