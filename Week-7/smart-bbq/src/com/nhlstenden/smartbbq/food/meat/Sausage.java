package com.nhlstenden.smartbbq.food.meat;

public class Sausage extends Meat
{
    private static final double BROWNING_FACTOR = 0.05 / 100.0;
    private static final double COOKING_FACTOR = 1.0 / (80.0 * Math.PI);

    public Sausage()
    {
        super(MeatType.PIG, COOKING_FACTOR, BROWNING_FACTOR);
    }

    @Override
    public String toString()
    {
        return "Sausage";
    }
}
