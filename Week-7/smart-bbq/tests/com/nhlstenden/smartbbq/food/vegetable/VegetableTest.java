package com.nhlstenden.smartbbq.food.vegetable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VegetableTest
{
    @Test
    void testInitialMoistPercentage()
    {
        Corn corn = new Corn();

        assertEquals(100.0, corn.getMoistPercentage(), 0.01);
    }

    @Test
    void testMoistPercentageAfterGrilling()
    {
        Corn corn = new Corn();

        corn.grill(200);

        assertEquals(90.0, corn.getMoistPercentage(), 0.01);
    }

    @Test
    void testMoistPercentageCannotBeNegative()
    {
        Corn corn = new Corn();

        for (int i = 0; i < 20; i++)
        {
            corn.grill(200);
        }

        assertEquals(0.0, corn.getMoistPercentage(), 0.01);
    }

    @Test
    void testMoistPercentageAtZeroTemperature()
    {
        Corn corn = new Corn();

        corn.grill(0);

        assertEquals(100.0, corn.getMoistPercentage(), 0.01);
    }

    @Test
    void testBellPepperMoistPercentage()
    {
        BellPepper pepper = new BellPepper();

        pepper.grill(200);

        assertEquals(80.0, pepper.getMoistPercentage(), 0.01);
    }
}