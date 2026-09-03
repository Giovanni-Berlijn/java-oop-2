package com.nhlstenden.kingdomsandquests;

public class Mage extends Character
{
    public Mage(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);
    }

    @Override
    public void useSpecialAbility()
    {
        System.out.println("Mages increases defense.");
    }
}