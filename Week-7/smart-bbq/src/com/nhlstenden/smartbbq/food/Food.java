package com.nhlstenden.smartbbq.food;

public abstract class Food
{
    private static final double TEMPERATURE_INCREASE_PER_SECOND = 0.5;

    private double currentBrownPercentage;
    private final double browningFactor;
    private double currentTemperature;

    public Food(double browningFactor)
    {
        if (browningFactor < 0)
        {
            throw new IllegalArgumentException("Browning factor cannot be negative.");
        }

        this.browningFactor = browningFactor;
        this.currentBrownPercentage = 0.0;
        this.currentTemperature = 0.0;
    }

    public double getBrowningFactor()
    {
        return this.browningFactor;
    }

    public double getCurrentBrownPercentage()
    {
        return this.currentBrownPercentage;
    }

    public double getCurrentTemperature()
    {
        return this.currentTemperature;
    }

    public void grill(double temperature)
    {
        this.currentTemperature += TEMPERATURE_INCREASE_PER_SECOND;
        this.currentBrownPercentage += this.browningFactor * temperature;
    }
}
