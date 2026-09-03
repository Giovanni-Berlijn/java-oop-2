package com.nhlstenden.kingdomsandquests;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player();

        Character warrior = new Warrior(10, 5);
        Character mage = new Mage(5, 10);
        Character archer = new Archer(8, 6);

        Quest quest = new Quest(50, 3, mage);

        Item item = new Item("Lightsaber");
        SpecialQuest specialQuest = new SpecialQuest(150, 5, archer, item);

        ArrayList<Quest> quests = new ArrayList<>();
        quests.add(quest);
        quests.add(specialQuest);

        System.out.println("Available quests:");

        for (Quest availableQuest : quests)
        {
            System.out.println("XP reward: " + availableQuest.getXpReward());
            System.out.println("Difficulty: " + availableQuest.getDifficulty());
            System.out.println("Required XP: " + availableQuest.getRequiredXp());
        }

        warrior.attack();
        warrior.defend();
        warrior.useSpecialAbility();

        player.gainXp(50);

        if (player.canPlayQuest(specialQuest))
        {
            player.gainXp(specialQuest.getXpReward());
            player.levelUp();

            System.out.println("Quest completed.");
            System.out.println("Received item: " + specialQuest.getItem().getTitle());
            System.out.println("Player XP: " + player.getXp());
            System.out.println("Player level: " + player.getLevel());
        }
        else
        {
            System.out.println("Not enough XP to play this quest.");
        }
    }
}