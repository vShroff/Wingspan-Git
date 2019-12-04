package wingspan;


import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> deck = new ArrayList<Card>(); //deck is just an arraylist of cards
	//below we initialize 6 cards in which we will later add to our deck.
	private Card c1 = new Card("Flamingo related information", 3, false, false, "rodent", "G");
	private Card c2 = new Card("Peacock related information", 2, false, false, "fruit", "G");
	private Card c3 = new Card("Vulture related information", 5, false, false, "invertibrate", "L");
	private Card c4 = new Card("Crow related information", 3, false, false, "seed", "L");
	private Card c5 = new Card("Pigeon related information", 4, false, false, "fruit", "D");
	private Card c6 = new Card("Woodpecker related information", 1, false, false, "rodent", "D");
	
	public Deck() //creates a deck of cards for the player
	{
		//add a bunch of cards to our deck
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c1);
	}
	
	void drawCard(Player player) //draws a random card from the deck
	{
		Random rand = new Random(); 	
	    int pulled = rand.nextInt(deck.size()); 
	    if (deck.size() == 0) System.out.println("emptydeck");
	    player.arr.add(deck.get(pulled));
	    deck.remove(pulled);
	}
	void print()
	{
		System.out.println("Cards "+ deck.toString());
	}
	
	
}