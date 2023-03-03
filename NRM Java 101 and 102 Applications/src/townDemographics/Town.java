package townDemographics;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 2 Module 1
*
* @author Justine Kaye Mojica
* @Description: Java Program that describes the demographics of small towns.
* Created Date: 5/23/2022
* Modified Date: 5/24/2022
* @Modified By: Justine Kaye Mojica
* 
*
*/

public class Town {

	private int numberOfAdults;
	private int numberOfChildren;
	
	Scanner input = new Scanner(System.in);
	
	
	// This initialize method establishes initial values of instance variables
	public void initialize() {
		
		boolean isValidValue;
		
		do {
			
			try {				
				System.out.print("Enter number of Adults: ");
				numberOfAdults = input.nextInt();				
				System.out.print("Enter number of Children: ");
				numberOfChildren = input.nextInt();				
				isValidValue = true;
				
				//Checks if the user inputs negative value, if true it will throw an IllegalArgumentException
				if (numberOfAdults < 0 || numberOfChildren < 0){
					throw new IllegalArgumentException();
				}
				
			} catch(InputMismatchException | IllegalArgumentException e) {
				input.nextLine();
				isValidValue = false;
				System.out.println("Invalid Value");
			}
			
		} while(isValidValue == false);
		
		input.close();
		
	}
	
	//This simulateBirth method simulates the birth of one child.
	public void simulateBirth() {
		numberOfChildren++;
	}
	
	//This printStatistics method prints out the current vital statistics
	public void printStatistics() {
		System.out.println("Current Vital Statistics");
		System.out.println("Number of Adults: " + numberOfAdults);
		System.out.println("Number of Children: " + numberOfChildren);
	}

}
