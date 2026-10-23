package com.nhlstenden.smartbbq;

public abstract class Meat extends Food
{
    private double currentCookedPercentage;
    private double cookingFactor;
    private MeatType meatType;

    public Meat(double browningFactor, double cookingFactor, MeatType meatType)
    {
        super(browningFactor);

        if (meatType == null)
        {
            throw new IllegalArgumentException("MeatType cannot be null");
        }

        this.meatType = meatType;

        if (cookingFactor < 0)
        {
            throw new IllegalArgumentException("Cooking factor cannot be negative");
        }

        this.cookingFactor = cookingFactor;
        this.currentCookedPercentage = 0.0;
    }

    public double getCurrentCookedPercentage()
    {
        return this.currentCookedPercentage;
    }

    public MeatType getMeatType()
    {
        return this.meatType;
    }

    @Override
    public void grill(int temperature)
    {
        super.grill(temperature);

        this.currentCookedPercentage += this.cookingFactor * temperature;
    }
}
