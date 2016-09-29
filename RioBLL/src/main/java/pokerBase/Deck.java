package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();
/* this is how we make the order of cards random?
	public Deck() {
		private ArrayList<Card> deckCards = new ArrayList<Card>(); 
		int index_1, index_2;
		Random generator = new Random();
		Card temp;
		
		for (int a=1; a<4; a++) {
			for (int b=1; b<13; b++) {
				Card c = new Card(a,b);
				deckCards.add(c);
			}
		}	*/
	
	public Deck() {
		int number = 1;
		for (int suit : Card.suits.values()) {
			for (int rank : rank.values()) {
			deckCards.add(new Card(suit, rank, number++));
			}
		}
		
		Collections.shuffle(deckCards);
}
	public Card drawCard() { 
		return deckCards.remove(0);
		return deckCards.size()
	}
}
