package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import javax.smartcardio.Card;

public class Hand {

	private ArrayList<Card> CardsInHand;
	private ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}
	private static boolean isHandFlush(ArrayList<Card> cards) {
		//TODO Implement this method
		boolean bIsFlush = false;
		return bIsFlush;
	}
	private static boolean isStraight(ArrayList<Card> cards, Card highCard) {
		boolean bIsStright = false;
		//TODO Implement this method
		return bIsStright;
	}
	public static boolean isHandRoyalFlush(Hand h, HandScore hs) {
		boolean isRoyalFlush = false;
		//TODO Implement this method
		return isRoyalFlush;
	}
	public static boolean isHandStraightFlush(Hand h, HandScore hs) {
		boolean isRoyalFlush = false;
		//TODO Implement this method
		return isRoyalFlush;
	}
	public static boolean IsHandFourOfAKind(Hand h, HandScore hs) {
		boolean bHandCheck = false;
	/*	HandScore hs;
		if (CardsInHand.get(0).getiCardRank() == CardsInHand.get(3).getRank()) {
		ArrayList<Card> Kickers = new ArrayList<Card>();
		Kickers.add(CardsInHand.get(4));
		hs = new HandScore(8, CardsInHand.get(0).getRank(),0, Kickers);
	}
		else if (CardsInHand.get(1).getiCardRank() == CardsInHand.get(4).getRank()) {
			ArrayList<Card> Kickers = new ArrayList<Card>();
			Kickers.add(CardsInHand.get(0));
			hs = new HandScore(8, CardsInHand.get(1).getRank(), 0, Kickers);
	} */
	return bHandCheck;			
	}
	public static boolean isHandFullHouse(Hand h, HandScore hs) {
		boolean isFullHouse = false;
		//TODO Implement this method
		return isFullHouse;
	}
	public static boolean isHandFlush(Hand h, HandScore hs) {
		boolean bIsFlush = false;
		//TODO Implement this method
		return bIsFlush;
	}
	public static boolean isHandStraight(Hand h, HandScore hs) {
		boolean bIsStraight = false;
		//TODO Implement this method
		return bIsStraight;
	}
	public static boolean isHandThreeOfAKind(Hand h, HandScore hs) {
		boolean isThreeOfAKind = false;
		//TODO Implement this method
		return isThreeOfAKind;
	}
	public static boolean isHandTwoPair(Hand h, HandScore hs) {
		boolean isTwoPair = false;
		//TODO Implement this method
		return isTwoPair;
	}
	public static boolean isHandPair(Hand h, HandScore hs) {
		boolean isPair = false;
		//TODO Implement this method
		return isPair;
	}
	public static boolean isHandHighCard(Hand h, HandScore hs) {
		//TODO Implement this method
		return true;
	}
	
	public void evalHand() {
		Collections.sort(CardsInHand);
	}
}




























