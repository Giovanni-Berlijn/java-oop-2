package com.nhlstenden.kingdomsandquests;

public class Warrior extends Character
{
    public Warrior(int attackPower, int defensePower)
    {
        super(attackPower, defensePower);
    }

    @Override
    public void useSpecialAbility()
    {
        System.out.println("Warrior temporarily increases attack power.");
    }
}