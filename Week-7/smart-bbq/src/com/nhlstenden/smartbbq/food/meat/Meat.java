package com.nhlstenden.smartbbq.food.meat;

import com.nhlstenden.smartbbq.food.Food;

public abstract class Meat extends Food
{
    private double currentCookedPercentage;
    private final double cookingFactor;
    private final MeatType meatType;

    public Meat(MeatType meatType, double cookingFactor, double browningFactor)
    {
        super(browningFactor);

        if (meatType == null)
        {
            throw new IllegalArgumentException("Meat type cannot be null.");
        }

        if (cookingFactor < 0)
        {
            throw new IllegalArgumentException("Cooking factor cannot be negative.");
        }

        this.meatType = meatType;
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
    public void grill(double temperature)
    {
        super.grill(temperature);
        this.currentCookedPercentage += this.cookingFactor * temperature;
    }
}
