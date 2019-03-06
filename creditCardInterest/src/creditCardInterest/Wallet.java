package creditCardInterest;

import java.util.ArrayList;

public class Wallet {

	private ArrayList<Card> cards;
	
	public Wallet() {
		
		super();
		
	}

	public Wallet(ArrayList<Card> cards) {
		
		super();
		
		this.cards = cards;
		
	}

	public ArrayList<Card> getCards() {
		
		return cards;
		
	}

	public void setCards(ArrayList<Card> cards) {
		
		this.cards = cards;
		
	}
	
}