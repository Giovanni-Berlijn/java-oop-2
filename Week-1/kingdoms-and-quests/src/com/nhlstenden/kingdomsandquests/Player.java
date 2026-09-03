package com.nhlstenden.kingdomsandquests;

public class Player
{
    private int xp;
    private int level;

    public Player()
    {
        this.xp = 0;
        this.level = 1;
    }

    public int getXp()
    {
        return this.xp;
    }

    public int getLevel()
    {
        return this.level;
    }

    public void gainXp(int amount)
    {
        if (amount < 0)
        {
            throw new IllegalArgumentException("XP amount cannot be negative.");
        }

        this.xp += amount;
    }

    public void levelUp()
    {
        if (this.xp >= 200)
        {
            this.level++;
        }
    }

    public boolean canPlayQuest(Quest quest)
    {
        return this.xp >= quest.getRequiredXp();
    }
}