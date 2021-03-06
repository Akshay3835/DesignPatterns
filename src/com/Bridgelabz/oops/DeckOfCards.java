package com.Bridgelabz.oops;

import java.util.Random;

public class DeckOfCards
{
	public static void main(String args[]) 
	{
		DeckOfCards deck = new DeckOfCards();

		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);

		deck.displayCards(playerCards);

	}
	private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] cards = new String[52];

	public String[] getCards() 
	{						
		int i = 0;
		for (String suit : suits) 
		{
			for (String card : ranks)
			{
				cards[i] = card + "-" + suit;
				i++;
			}
		}
		return cards;
	}

	public void shuffleCard()		
	{								
		Random random = new Random();
		for (int i = 0; i < cards.length; i++)
		{
			int index = random.nextInt(52);
			String temp = cards[index];
			cards[index] = cards[i];
			cards[i] = temp;
		}
	}

	public String[][] distribute(int numOfPlayers, int numberOfCards) 	
	{		
		String[][] playerCards = new String[numOfPlayers][numberOfCards];
		int k = 0;
		for (int i = 0; i < numOfPlayers; i++)
		{
			for (int j = 0; j < numberOfCards; j++)
			{
				playerCards[i][j] = cards[k];
				k++;
			}
		}
		return playerCards;
	}

	public void displayCards(String[][] playerCards)	
	{					
		int i = 1;
		for (String[] playerCard : playerCards)
		{
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");

			for (String card : playerCard)
			{
				System.out.print(card + "  ");
			}
			System.out.println();

		}
	}

	
}