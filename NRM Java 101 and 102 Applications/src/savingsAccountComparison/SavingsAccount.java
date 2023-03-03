package savingsAccountComparison;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
* Java Course 3 Module 1
*
* @author Justine Kaye Mojica
* @Description: Java program that establishes two savings accounts with saver1 having account number 10002 
* 		with an initial balance of $2,000, and saver2 having account 10003 with an initial balance of $3,000. 
* Created Date: 5/31/2022
*
*/

public class SavingsAccount {
	
	private BigDecimal annualInterestRate;
	public final int ACCOUNT_NUMBER;
	private BigDecimal balance;
	
	public SavingsAccount(int aCCOUNT_NUMBER, BigDecimal balance) {
		super();
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
		this.balance = balance;
	}

	public int getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}

	public BigDecimal getBalance() {
		return balance;
	} 
	
	public BigDecimal addMonthlyInterest() {		
		BigDecimal currentBalance;
		BigDecimal monthsInYear = new BigDecimal(12);
		BigDecimal monthlyInterest = balance.multiply(annualInterestRate).divide(monthsInYear, 2, RoundingMode.HALF_UP);
		currentBalance = balance.add(monthlyInterest);
		balance = currentBalance;
		return currentBalance;
	}

	public void setAnnualInterestRate(BigDecimal annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	

}
