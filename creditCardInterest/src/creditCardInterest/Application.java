package creditCardInterest;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		Person testCaseOnePerson = new Person();
		Wallet testCaseOneWallet = new Wallet();
		Card testCaseOneVisa = new Visa();
		Card testCaseOneMastercard = new Mastercard();
		Card testCaseOneDiscover = new Discover();
		
		testCaseOneVisa.setBalance(100.00d);
		testCaseOneMastercard.setBalance(100.00d);
		testCaseOneDiscover.setBalance(100.00d);
		
		ArrayList<Card> cards = new ArrayList<Card>();
		ArrayList<Wallet> wallets = new ArrayList<Wallet>();
		
		cards.add(testCaseOneVisa);
		cards.add(testCaseOneMastercard);
		cards.add(testCaseOneDiscover);
		
		wallets.add(testCaseOneWallet);
		
		testCaseOneWallet.setCards(cards);
		
		testCaseOnePerson.setWallets(wallets);
		
		Double totalInterest = testCaseOneVisa.calculateInterest(testCaseOneVisa.getBalance()) + testCaseOneMastercard.calculateInterest(testCaseOneMastercard.getBalance()) + testCaseOneDiscover.calculateInterest(testCaseOneDiscover.getBalance());
		
		System.out.println("Test case one: \nA person has one wallet and three cards.\nOne card is a Visa, one card is a Mastercard, and one is a Discover card.");
		System.out.println("Each card currently has a balance of $100.00 and each card has a different interest rate.");
		System.out.println("The Visa has an interest rate of 10 percent\nThe Mastercard has an interest rate of 5 percent\nThe Discover card has an interest rate of 1 percent");
		System.out.println("\nThe amount of interest that will need to be paid for the Visa card is: " + testCaseOneVisa.calculateInterest(testCaseOneVisa.getBalance()));
		System.out.println("\nThe amount of interest that will need to be paid for the Mastercard is: " + testCaseOneMastercard.calculateInterest(testCaseOneMastercard.getBalance()));
		System.out.println("\nThe amount of interest that will need to be paid for the Discover card is: " + testCaseOneDiscover.calculateInterest(testCaseOneDiscover.getBalance()));
		System.out.println("\nThe total interest that this person will pay is: " + totalInterest);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Begin Test Case 2
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Person testCaseTwoPerson = new Person();
		Wallet testCaseTwoWallet = new Wallet();
		Wallet testCaseTwoWalletTwo = new Wallet();
		
		Card testCaseTwoVisa = new Visa();
		Card testCaseTwoMastercard = new Mastercard();
		Card testCaseTwoDiscover = new Discover();
		
		testCaseTwoVisa.setBalance(100.00d);
		testCaseTwoMastercard.setBalance(100.00d);
		testCaseTwoDiscover.setBalance(100.00d);
		
		ArrayList<Card> cardsTwoWalletOne = new ArrayList<Card>();
		ArrayList<Card> cardsTwoWalletTwo = new ArrayList<Card>();
		
		ArrayList<Wallet> walletsTwo = new ArrayList<Wallet>();
		
		cardsTwoWalletOne.add(testCaseTwoVisa);
		cardsTwoWalletOne.add(testCaseTwoDiscover);
		
		cardsTwoWalletTwo.add(testCaseTwoMastercard);
		
		walletsTwo.add(testCaseTwoWallet);
		walletsTwo.add(testCaseTwoWalletTwo);
		
		testCaseTwoWallet.setCards(cardsTwoWalletOne);
		testCaseTwoWalletTwo.setCards(cardsTwoWalletTwo);
		
		testCaseTwoPerson.setWallets(walletsTwo);
		
		Double totalInterestTwo = testCaseTwoVisa.calculateInterest(testCaseTwoVisa.getBalance()) + testCaseTwoMastercard.calculateInterest(testCaseTwoMastercard.getBalance()) + testCaseTwoDiscover.calculateInterest(testCaseTwoDiscover.getBalance());
		
		Double interestWalletOne = testCaseTwoVisa.calculateInterest(testCaseTwoVisa.getBalance()) + testCaseTwoDiscover.calculateInterest(testCaseTwoDiscover.getBalance());
		Double interestWalletTwo = testCaseTwoMastercard.calculateInterest(testCaseTwoMastercard.getBalance());
		
		System.out.println("\n\n\nTest case two: \nA person has two wallets. The first wallet has a Visa card and a Discover card. The second wallet has a Mastercard.");
		System.out.println("Each card currently has a balance of $100.00 and each card has a different interest rate.");
		System.out.println("The Visa has an interest rate of 10 percent\nThe Mastercard has an interest rate of 5 percent\nThe Discover card has an interest rate of 1 percent");
		System.out.println("\nThe amount of interest that will need to be paid for the Visa card is: " + testCaseTwoVisa.calculateInterest(testCaseTwoVisa.getBalance()));
		System.out.println("\nThe amount of interest that will need to be paid for the Mastercard is: " + testCaseTwoMastercard.calculateInterest(testCaseTwoMastercard.getBalance()));
		System.out.println("\nThe amount of interest that will need to be paid for the Discover card is: " + testCaseTwoDiscover.calculateInterest(testCaseTwoDiscover.getBalance()));
		System.out.println("\nThe total interest that this person will pay is: " + totalInterestTwo);
		System.out.println("\nThe amount of interest that this person will pay for wallet one is: " + interestWalletOne);
		System.out.println("\nThe amount of interest that this person will pay for wallet two is: " + interestWalletTwo);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Begin Test Case 3
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Person person1 = new Person();
		ArrayList<Wallet> person1Wallets = new ArrayList<Wallet>();
		Wallet person1Wallet = new Wallet();
		ArrayList<Card> person1Cards = new ArrayList<Card>();
		Card person1MC = new Mastercard();
		person1MC.setBalance(100.00d);
		Card person1Visa = new Visa();
		person1Visa.setBalance(100.00d);
		person1Cards.add(person1MC);
		person1Cards.add(person1Visa);
		person1Wallet.setCards(person1Cards);
		person1Wallets.add(person1Wallet);
		person1.setWallets(person1Wallets);
		
		Double person1Interest = person1MC.calculateInterest(person1MC.getBalance()) + person1Visa.calculateInterest(person1MC.getBalance());
		
		Person person2 = new Person();
		ArrayList<Wallet> person2Wallets = new ArrayList<Wallet>();
		Wallet person2Wallet = new Wallet();
		ArrayList<Card> person2Cards = new ArrayList<Card>();
		Card person2MC = new Mastercard();
		person2MC.setBalance(100.00d);
		Card person2Visa = new Visa();
		person2Visa.setBalance(100.00d);
		person2Cards.add(person2MC);
		person2Cards.add(person2Visa);
		person2Wallet.setCards(person2Cards);
		person2Wallets.add(person2Wallet);
		person2.setWallets(person2Wallets);
		
		Double person2Interest = person2MC.calculateInterest(person2MC.getBalance()) + person2Visa.calculateInterest(person2MC.getBalance());
		
		System.out.println("\n\n\nTest case three:\nPerson one has one wallet with a Visa and Mastercard in it. Both cards have a balance of $100.00.");
		System.out.println("\nPerson one will have to pay a total of: " + person1Interest + " in total interest (the interest from both cards added together)");
		System.out.println("\nSince person one only has one wallet, they will pay a total of: " + person1Interest + " in interest for wallet 1");
		
		System.out.println("\nPerson two has one wallet with a Visa and Mastercard in it. Both cards have a balance of $100.00.");
		System.out.println("\nPerson two will have to pay a total of: " + person2Interest + " in total interest (the interest from both cards added together)");
		System.out.println("\nSince person one only has one wallet, they will pay a total of: " + person2Interest + " in interest for wallet one");
	}

}