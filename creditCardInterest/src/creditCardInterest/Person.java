package creditCardInterest;

import java.util.ArrayList;

public class Person {
	
	private ArrayList<Wallet> wallets;
	
	public Person() {
		
		super();
		
	}

	public Person(ArrayList<Wallet> wallets) {
		
		super();
		
		this.wallets = wallets;
		
	}

	public ArrayList<Wallet> getWallets() {
		
		return wallets;
		
	}

	public void setWallets(ArrayList<Wallet> wallets) {
		
		this.wallets = wallets;
		
	}

}