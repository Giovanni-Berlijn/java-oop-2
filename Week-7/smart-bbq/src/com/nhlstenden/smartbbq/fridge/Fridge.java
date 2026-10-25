package com.nhlstenden.smartbbq.fridge;

import com.nhlstenden.smartbbq.exceptions.NoMoreFoodException;
import com.nhlstenden.smartbbq.exceptions.FridgeIsEmptyException;
import com.nhlstenden.smartbbq.food.Food;
import com.nhlstenden.smartbbq.food.meat.Meat;
import com.nhlstenden.smartbbq.food.vegetable.Vegetable;

import java.util.HashSet;
import java.util.Iterator;

public class Fridge
{
    private static final int DEFAULT_TEMPERATURE = 8;

    private static Fridge instance;
    private final HashSet<Food> foodInFridge;
    private int temperature;

    private Fridge()
    {
        this.foodInFridge = new HashSet<>();
        this.temperature = DEFAULT_TEMPERATURE;
    }

    public static Fridge getInstance()
    {
        if (instance == null)
        {
            instance = new Fridge();
        }

        return instance;
    }

    public int getTemperature()
    {
        return this.temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    public void addFood(Food food)
    {
        if (food == null)
        {
            throw new IllegalArgumentException("Food cannot be null.");
        }

        this.foodInFridge.add(food);
    }

    public Meat getNextMeat()
    {
        return this.takeNextFood(Meat.class, "meat");
    }

    public Vegetable getNextVegetable()
    {
        return this.takeNextFood(Vegetable.class, "vegetables");
    }

    private <T extends Food> T takeNextFood(Class<T> foodType, String typeName)
    {
        if (this.foodInFridge.isEmpty())
        {
            throw new FridgeIsEmptyException("The fridge is empty.");
        }

        Iterator<Food> iterator = this.foodInFridge.iterator();

        while (iterator.hasNext())
        {
            Food food = iterator.next();

            if (foodType.isInstance(food))
            {
                iterator.remove();
                return foodType.cast(food);
            }
        }

        throw new NoMoreFoodException("No more " + typeName + " available in the fridge.");
    }
}
