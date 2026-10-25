package com.nhlstenden.smartbbq.fridge;

import com.nhlstenden.smartbbq.exceptions.FridgeIsEmptyException;
import com.nhlstenden.smartbbq.exceptions.NoMoreFoodException;
import com.nhlstenden.smartbbq.food.meat.Hamburger;
import com.nhlstenden.smartbbq.food.vegetable.Corn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FridgeTest
{
    @Test
    void testGetNextMeat()
    {
        Fridge fridge = Fridge.getInstance();

        Hamburger hamburger = new Hamburger();
        Corn corn = new Corn();

        fridge.addFood(corn);
        fridge.addFood(hamburger);

        assertEquals(hamburger, fridge.getNextMeat());
        assertEquals(corn, fridge.getNextVegetable());
    }

    @Test
    void testNoMeatAvailable()
    {
        Fridge fridge = Fridge.getInstance();

        Corn corn = new Corn();
        fridge.addFood(corn);

        assertThrows(NoMoreFoodException.class, () -> fridge.getNextMeat());

        fridge.getNextVegetable();
    }

    @Test
    void testEmptyFridge()
    {
        Fridge fridge = Fridge.getInstance();

        Hamburger hamburger = new Hamburger();
        fridge.addFood(hamburger);

        fridge.getNextMeat();

        assertThrows(FridgeIsEmptyException.class, () -> fridge.getNextMeat());
    }
}