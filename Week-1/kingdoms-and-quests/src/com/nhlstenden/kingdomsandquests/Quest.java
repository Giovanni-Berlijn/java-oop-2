package com.nhlstenden.kingdomsandquests;

public class Quest
{
    private int xpReward;
    private int difficulty;
    private Character opponent;

    public Quest(int xpReward, int difficulty, Character opponent)
    {
        this.xpReward = xpReward;
        this.difficulty = difficulty;
        this.opponent = opponent;
    }

    public int getXpReward()
    {
        return this.xpReward;
    }

    public int getDifficulty()
    {
        return this.difficulty;
    }

    public Character getOpponent()
    {
        return this.opponent;
    }

    public int getRequiredXp()
    {
        return this.difficulty * 10;
    }
}