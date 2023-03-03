package economyPolicy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 1 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that applies these economic policy practices.
* Created Date: 5/18/2022
* Modified Date: 5/20/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class EconomyPolicy {

	public static void main(String[] args) {
		
		
		String recoEcoPol1 = "Increase welfare spending, reduce personal taxes, and decrease discount rate.";
		String recoEcoPol2 = "Reduce business taxes.";
		String recoEcoPol3 = "Increase personal and business taxes, and decrease discount rate.";
		String recoEcoPol4 = "Increase discount rate.";
		String recoEcoPol5 = "No change in economic policy.";
		Boolean isFloat;
		
		Scanner input = new Scanner(System.in);
				
		do {
			try {
				isFloat = true;
				System.out.print("Enter Annual Growth Rate (%) : ");
				float growthRate = input.nextFloat();
				System.out.print("Enter Inflation (%) : ");
				float inflationValue = input.nextFloat();
				
				if(growthRate < 1) {
					if(inflationValue < 3) {
						System.out.println("Recommended economic policy is: " + recoEcoPol1);		
					} else {
						System.out.println("Recommended economic policy is: " + recoEcoPol2);
					}
					
				} else if (growthRate > 4) {
					if(inflationValue < 1) System.out.println("Recommended economic policy is: " + recoEcoPol3);	
					else if(inflationValue > 3) System.out.println("Recommended economic policy is: " + recoEcoPol4);
					else System.out.println("Recommended economic policy is: " + recoEcoPol5);
					
				} else {
					System.out.println("Recommended economic policy is: " + recoEcoPol5);
				}
				
				
			} catch(InputMismatchException e) {
				isFloat = false;
				input.nextLine();
				System.out.println("Please Enter valid value.");
			}
		} while(isFloat == false);
		
		input.close();
	}

}

