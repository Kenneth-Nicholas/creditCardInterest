package creditCardInterest;

public class Visa extends Card {

	private double interestRate = 10.0d;
	private double balance;
	private double interest;

	public Visa() {
		
		super();
		
	}

	public Visa(double interestRate, double balance, double interest) {
		
		super();
		
		this.interestRate = interestRate;
		this.balance = balance;
		this.interest = interest;
		
	}

	@Override
	public double calculateInterest(double balance) {
		
		return (this.interestRate / 100.0d) * balance;
				
	}

	public double getInterestRate() {
		
		return interestRate;
		
	}

	public void setInterestRate(double interestRate) {
		
		this.interestRate = interestRate;
		
	}

	public double getBalance() {
		
		return balance;
		
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}

	public double getInterest() {
		
		return interest;
		
	}

	public void setInterest(double interest) {
		
		this.interest = interest;
		
	}
	
}