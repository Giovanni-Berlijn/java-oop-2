package com.nhlstenden.smartbbq;

public class Hamburger extends Meat
{
    private static final double BROWNING_FACTOR = 0.06 / 100;
    private static final double COOKING_FACTOR = 1.0 / (100 * Math.PI);

    public Hamburger()
    {
        super(BROWNING_FACTOR, COOKING_FACTOR, MeatType.COW);
    }

    @Override
    public String toString()
    {
        return "Hamburger";
    }
}
