package com.nhlstenden.smartbbq.food.vegetable;

import com.nhlstenden.smartbbq.food.Food;

public abstract class Vegetable extends Food
{
    private static final double INITIAL_MOISTURE_PERCENTAGE = 100.0;

    private double moistPercentage;
    private final double moistFactor;

    public Vegetable(double moistFactor, double browningFactor)
    {
        super(browningFactor);

        if (moistFactor < 0)
        {
            throw new IllegalArgumentException("Moisture factor cannot be negative.");
        }

        this.moistFactor = moistFactor;
        this.moistPercentage = INITIAL_MOISTURE_PERCENTAGE;
    }

    public double getMoistPercentage()
    {
        return this.moistPercentage;
    }

    public void decreaseMoistPercentage(double difference)
    {
        if (difference < 0)
        {
            throw new IllegalArgumentException("Moisture decrease cannot be negative.");
        }

        this.moistPercentage = Math.max(0.0, this.moistPercentage - difference);
    }

    @Override
    public void grill(double temperature)
    {
        super.grill(temperature);
        this.decreaseMoistPercentage(this.moistFactor * temperature);
    }
}
