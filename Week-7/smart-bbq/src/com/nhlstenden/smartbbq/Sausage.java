package com.nhlstenden.smartbbq;

public class Sausage extends Meat
{
    private static final double BROWNING_FACTOR = 0.05 / 100;
    private static final double COOKING_FACTOR = 1.0 / (80 * Math.PI);

    public Sausage()
    {
        super(BROWNING_FACTOR, COOKING_FACTOR, MeatType.PIG);
    }

    @Override
    public String toString()
    {
        return "Sausage";
    }
}
