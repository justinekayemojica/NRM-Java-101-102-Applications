package bankBalance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
* Java Course 1 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that prompts the user for a starting balance and 
* 	then prints the number of years it takes to reach $100,000 and 
* 	also the number of years it takes to reach $1,000,000
* Created Date: 5/18/2022
* Modified Date: 5/20/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class BankBalance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter starting balance: ");
		float startBal = input.nextFloat();
		input.close();
		
		/*
		Compound interest formula :  A = P(1+r)^n 
		where A is the Amount, P is the original amount invested or principal , 
		r is the annual interest rate as decimal and n is the number of years interest is compounded
		*/
		double yearsToReach100K = Math.log(100000/startBal) / Math.log(2); //Derived from compound interest formula 
		BigDecimal yr100k = new BigDecimal(yearsToReach100K).setScale(0, RoundingMode.UP);
		System.out.println("It takes " + yr100k +" years to reach $100,000."); 
		
		
		double yearsToReach1M = Math.log(1000000/startBal) / Math.log(2); //Derived from compound interest formula 
		BigDecimal yr1M = new BigDecimal(yearsToReach1M).setScale(0, RoundingMode.UP);
		System.out.println("It takes " + yr1M +" years to reach $1,000,000."); 
		
		
	}

}
