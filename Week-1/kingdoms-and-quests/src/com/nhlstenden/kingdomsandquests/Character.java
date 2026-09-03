package com.nhlstenden.kingdomsandquests;

public abstract class Character
{
    protected int attackPower;
    protected int defensePower;

    public Character(int attackPower, int defensePower)
    {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void attack()
    {
        System.out.println("Attack power: " + this.attackPower);
    }

    public void defend()
    {
        System.out.println("Defense power: " + this.defensePower);
    }

    public abstract void useSpecialAbility();
}