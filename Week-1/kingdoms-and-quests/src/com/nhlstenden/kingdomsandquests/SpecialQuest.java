package com.nhlstenden.kingdomsandquests;

public class SpecialQuest extends Quest
{
    private Item item;

    public SpecialQuest(int xpReward, int difficulty, Character opponent, Item item)
    {
        super(xpReward, difficulty, opponent);
        this.setItem(item);
    }

    public Item getItem()
    {
        return this.item;
    }

    public void setItem(Item item)
    {
        if (item == null)
        {
            throw new IllegalArgumentException("Item cannot be null.");
        }

        this.item = item;
    }
}