package com.nhlstenden.smartbbq;

public abstract class Food
{
    private double currentBrownPercentage;
    private double browningFactor;
    private double currentTemperature;

    public Food(double browningFactor)
    {
        this.currentBrownPercentage = 0.0;
        this.setBrowningFactor(browningFactor);
        this.currentTemperature = 0.0;
    }

    public double getBrowningFactor()
    {
        return this.browningFactor;
    }

    public void setBrowningFactor(double browningFactor)
    {
        if (browningFactor < 0)
        {
            throw new IllegalArgumentException("Browning factor cannot be negative.");
        }

        this.browningFactor = browningFactor;
    }

    public double getCurrentTemperature()
    {
        return this.currentTemperature;
    }

    public void grill(int temperature)
    {
        this.currentTemperature += 0.5;
        this.currentBrownPercentage = this.getCurrentBrownPercentage() + this.browningFactor * temperature;
    }

    public double getCurrentBrownPercentage()
    {
        return this.currentBrownPercentage;
    }
}
