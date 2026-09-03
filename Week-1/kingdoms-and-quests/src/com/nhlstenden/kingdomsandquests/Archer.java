package com.nhlstenden.kingdomsandquests;

public class Archer extends Character
{
    public Archer(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);
    }

    @Override
    public void useSpecialAbility()
    {
        System.out.println("Archer doubles the damage dealt to an enemy.");
    }
}