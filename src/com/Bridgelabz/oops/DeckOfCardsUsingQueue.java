package com.Bridgelabz.oops;

public class DeckOfCardsUsingQueue extends  DeckOfCards
{
	public static void main(String args[]) 
	{
		DeckOfCards deck = new  DeckOfCardsUsingQueue();
		deck.getCards();
		deck.shuffleCard();
		String playerCards[][] = deck.distribute(4, 9);
		int i = 1;
		for (String[] playerCard : playerCards) 
		{
			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");
			for (String card : playerCard) 
			{
				QueueUsingLinkedListForDeck_Program<String> queue = new QueueUsingLinkedListForDeck_Program<String>();
				queue.enqueue(card);	//store it into the queue
				System.out.print(card+"  ");
			}
			System.out.println();
		}
	}
}