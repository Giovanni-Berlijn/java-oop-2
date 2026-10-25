package com.nhlstenden.smartbbq.food.meat;

public class Hamburger extends Meat
{
    private static final double BROWNING_FACTOR = 0.06 / 100.0;
    private static final double COOKING_FACTOR = 1.0 / (100.0 * Math.PI);

    public Hamburger()
    {
        super(MeatType.COW, COOKING_FACTOR, BROWNING_FACTOR);
    }

    @Override
    public String toString()
    {
        return "Hamburger";
    }
}
