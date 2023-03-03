package savingsAccountComparison;

import java.math.BigDecimal;

/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: This is a driver class of SavingsAccount class.
* Created Date: 5/31/2022
* 
*/

public class SavingsAccountDriver {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(10002, new BigDecimal(2000.00));
		SavingsAccount saver2 = new SavingsAccount(10003, new BigDecimal(3000.00));
		
		saver1.setAnnualInterestRate(new BigDecimal(0.05));
		saver2.setAnnualInterestRate(new BigDecimal(0.05));
		System.out.printf("%-5s  %-9s %-7s   %-9s %-7s", "Month", "Account", "Balance", "Account", "Balance");
		System.out.println("\n---------------------------------------------");
		
		
		for(int month = 0 ; month <= 12 ; month++) {
			if(month == 0) {				
				System.out.printf("%-5s  %-9s %-7s   %-9s %-7s%n", month, saver1.getACCOUNT_NUMBER(), saver1.getBalance().setScale(2), 
						saver2.getACCOUNT_NUMBER(), saver2.getBalance().setScale(2));
			} else {
				System.out.printf("%-5s  %-9s %-7s   %-9s %-7s%n", month, saver1.getACCOUNT_NUMBER(), saver1.addMonthlyInterest(), 
						saver2.getACCOUNT_NUMBER(), saver2.addMonthlyInterest());
			}
		}
		
		BigDecimal finalBalance = saver1.getBalance().add(saver2.getBalance());
		System.out.println("\nFinal balance of both accounts combined: " + finalBalance);
	}

}
