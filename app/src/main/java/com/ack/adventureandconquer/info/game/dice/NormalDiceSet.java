package com.ack.adventureandconquer.info.game.dice;

/**
 * Created by saskyrar on 12/03/15.
 */
public class NormalDiceSet implements IsDiceSet {

    private IsDice d2;
    private IsDice d3;
    private IsDice d4;
    private IsDice d6;
    private IsDice d8;
    private IsDice d10;
    private IsDice d12;
    private IsDice d20;
    private IsDice d100;

    @Override
    public IsDice getD2Dice() {
        if (d2 == null)
            d2 = new D2();

        return d2;
    }

    @Override
    public IsDice getD3Dice() {
        if (d3 == null)
            d3 = new D3();

        return d3;
    }

    @Override
    public IsDice getD4Dice() {
        if (d4 == null)
            d4 = new D4();

        return d4;
    }

    @Override
    public IsDice getD6Dice() {
        if (d6 == null)
            d6 = new D6();

        return d6;
    }

    @Override
    public IsDice getD8Dice() {
        if (d8 == null)
            d8 = new D8();

        return d8;
    }

    @Override
    public IsDice getD10Dice() {
        if (d10 == null)
            d10 = new D10();

        return d10;
    }

    @Override
    public IsDice getD12Dice() {
        if (d12 == null)
            d12 = new D12();

        return d12;
    }

    @Override
    public IsDice getD20Dice() {
        if (d20 == null)
            d20 = new D20();

        return d20;
    }

    @Override
    public IsDice getD100Dice() {
        if (d100 == null)
            d100 = new D100();

        return d100;
    }
}
