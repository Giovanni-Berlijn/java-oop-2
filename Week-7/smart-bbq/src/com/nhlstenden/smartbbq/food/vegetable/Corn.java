package com.nhlstenden.smartbbq.food.vegetable;

public class Corn extends Vegetable
{
    private static final double MOIST_FACTOR = 0.05;
    private static final double BROWNING_FACTOR = 0.08;

    public Corn()
    {
        super(MOIST_FACTOR, BROWNING_FACTOR);
    }

    @Override
    public String toString()
    {
        return "Corn";
    }
}
