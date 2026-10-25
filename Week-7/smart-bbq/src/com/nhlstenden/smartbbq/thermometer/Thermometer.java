package com.nhlstenden.smartbbq.thermometer;

import com.nhlstenden.smartbbq.bbq.SmartBBQ;
import com.nhlstenden.smartbbq.fridge.Fridge;
import com.nhlstenden.smartbbq.food.Food;

public class Thermometer
{
    private static final int COLD_TEMPERATURE = 10;
    private static final int HOT_TEMPERATURE = 70;

    public String measureTemperature(Object object)
    {
        double temperature = switch (object)
        {
            case Fridge fridge -> fridge.getTemperature();
            case SmartBBQ bbq -> bbq.getTemperature();
            case Food food -> food.getCurrentTemperature();
            case null, default -> throw new IllegalArgumentException("Invalid object");
        };

        TemperatureLevel level;

        if (temperature < COLD_TEMPERATURE)
        {
            level = TemperatureLevel.COLD;
        }
        else if (temperature <= HOT_TEMPERATURE)
        {
            level = TemperatureLevel.MEDIUM;
        }
        else
        {
            level = TemperatureLevel.HOT;
        }

        return "I measured a temperature of " + temperature + " degrees Celsius - " + level.name().toLowerCase();
    }
}