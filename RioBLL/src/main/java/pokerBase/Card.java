package pokerBase;

import java.util.Comparator;

public class Card implements Comparable {
	private int rank;
	private int suit;
	private int number;
	
	private static String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
	
	private static int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	public Card(int suit, int rank, int number) {
		super();
		this.rank = rank;
		this.suit = suit;
		this.number = number;
	}
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public static Comparator<Card> CardRank = new Comparator<Card>() {
		public int compare(Card c1, Card c2) {
			int Card1 = c1.getRank().getNumber();
			int Card2 = c2.getRank().getNumber();
			return Card2 - Card1;
		}};
		public int compareTo(Object o) {
			Card c = (Card) o;
			return c.getRank().compareTo(this.getRank());
	}
}