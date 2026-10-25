package com.nhlstenden.smartbbq;

import com.nhlstenden.smartbbq.bbq.SmartBBQ;
import com.nhlstenden.smartbbq.fridge.Fridge;
import com.nhlstenden.smartbbq.food.meat.Hamburger;
import com.nhlstenden.smartbbq.food.meat.Meat;
import com.nhlstenden.smartbbq.food.meat.Sausage;
import com.nhlstenden.smartbbq.food.vegetable.BellPepper;
import com.nhlstenden.smartbbq.food.vegetable.Corn;
import com.nhlstenden.smartbbq.thermometer.Thermometer;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Fridge fridge = Fridge.getInstance();
        SmartBBQ bbq = new SmartBBQ();
        Thermometer thermometer = new Thermometer();

        fridge.addFood(new Corn());
        fridge.addFood(new Corn());
        fridge.addFood(new Corn());

        fridge.addFood(new BellPepper());
        fridge.addFood(new BellPepper());

        fridge.addFood(new Hamburger());
        fridge.addFood(new Hamburger());

        fridge.addFood(new Sausage());
        fridge.addFood(new Sausage());
        fridge.addFood(new Sausage());

        Meat meat1 = fridge.getNextMeat();
        Meat meat2 = fridge.getNextMeat();
        Meat meat3 = fridge.getNextMeat();

        bbq.addFood(meat1);
        bbq.addFood(meat2);
        bbq.addFood(meat3);

        bbq.turnOn(180);

        Thread.sleep(3000);

        System.out.println(thermometer.measureTemperature(meat1));

        bbq.setTemperature(200);

        Thread.sleep(3000);

        System.out.println(thermometer.measureTemperature(meat1));

        bbq.turnOff();
    }
}