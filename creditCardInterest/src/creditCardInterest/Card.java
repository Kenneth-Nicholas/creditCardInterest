package creditCardInterest;

public abstract class Card {
	
	protected double balance;
	protected double interestRate;
	protected double interest;
	
	public abstract double calculateInterest(double balance);

	public double getBalance() {
		
		return balance;
		
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}

	public double getInterestRate() {
		
		return interestRate;
		
	}

	public void setInterestRate(double interestRate) {
		
		this.interestRate = interestRate;
		
	}

	public double getInterest() {
		
		return interest;
		
	}

	public void setInterest(double interest) {
		
		this.interest = interest;
		
	}
	
}