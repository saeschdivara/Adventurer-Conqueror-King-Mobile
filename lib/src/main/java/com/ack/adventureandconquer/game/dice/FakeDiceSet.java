package com.ack.adventureandconquer.game.dice;

/**
 * Created by saskyrar on 13/03/15.
 */
public class FakeDiceSet implements IsDiceSet {

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
        return d2;
    }

    @Override
    public IsDice getD3Dice() {
        return d3;
    }

    @Override
    public IsDice getD4Dice() {
        return d4;
    }

    @Override
    public IsDice getD6Dice() {
        return d6;
    }

    @Override
    public IsDice getD8Dice() {
        return d8;
    }

    @Override
    public IsDice getD10Dice() {
        return d10;
    }

    @Override
    public IsDice getD12Dice() {
        return d12;
    }

    @Override
    public IsDice getD20Dice() {
        return d20;
    }

    @Override
    public IsDice getD100Dice() {
        return d100;
    }

    public void setD2(IsDice d2) {
        this.d2 = d2;
    }

    public void setD3(IsDice d3) {
        this.d3 = d3;
    }

    public void setD4(IsDice d4) {
        this.d4 = d4;
    }

    public void setD6(IsDice d6) {
        this.d6 = d6;
    }

    public void setD8(IsDice d8) {
        this.d8 = d8;
    }

    public void setD10(IsDice d10) {
        this.d10 = d10;
    }

    public void setD12(IsDice d12) {
        this.d12 = d12;
    }

    public void setD20(IsDice d20) {
        this.d20 = d20;
    }

    public void setD100(IsDice d100) {
        this.d100 = d100;
    }
}
