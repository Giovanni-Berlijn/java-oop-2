package com.nhlstenden.smartbbq.bbq;

import com.nhlstenden.smartbbq.food.Food;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

public class SmartBBQ
{
    private static final int MAX_FOOD_ITEMS = 6;
    private static final int MAX_TEMPERATURE = 250;

    private final HashSet<Food> food;
    private int temperature;
    private boolean isOn;
    private Timer timer;

    public SmartBBQ()
    {
        this.food = new HashSet<>();
        this.temperature = 0;
        this.isOn = false;
    }

    public void addFood(Food food)
    {
        if (food == null)
        {
            throw new IllegalArgumentException("Food cannot be null");
        }

        if (this.food.size() >= MAX_FOOD_ITEMS)
        {
            throw new IllegalStateException("SmartBBQ is full");
        }

        this.food.add(food);
    }

    public int getTemperature()
    {
        return this.temperature;
    }

    public void setTemperature(int temperature)
    {
        if (temperature < 0 || temperature > MAX_TEMPERATURE)
        {
            throw new IllegalArgumentException("Temperature must be between 0 and " + MAX_TEMPERATURE + " degrees Celsius.");
        }

        this.temperature = temperature;
    }

    public void turnOn(int temperature)
    {
        if (this.isOn)
        {
            throw new IllegalStateException("SmartBBQ is already on");
        }

        this.setTemperature(temperature);
        this.isOn = true;

        this.timer = new Timer();

        this.timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                for (Food item : SmartBBQ.this.food)
                {
                    item.grill(SmartBBQ.this.temperature);
                }
            }
        }, 0, 1000);
    }

    public void turnOff()
    {
        this.isOn = false;

        if (this.timer != null)
        {
            this.timer.cancel();
            this.timer = null;
        }
    }
}
