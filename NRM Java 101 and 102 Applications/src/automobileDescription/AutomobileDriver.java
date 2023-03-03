package automobileDescription;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the Automobile class.
* Created Date: 5/24/2022
*
*/

public class AutomobileDriver {

	public static void main(String[] args) {
		
		int numberOfCars;
		boolean isValidValue = false;
		
		Scanner input = new Scanner(System.in);
		Automobile auto = new Automobile();
		
		do {
			
			try {			
				System.out.print("How many cars do you want to consider? ");
				numberOfCars = input.nextInt();	
				
				for(int i = 0 ; i < numberOfCars ; i++) {
					auto.setMake();
					auto.setColor();
					auto.printColor().printMake();
				}
				
			} catch (InputMismatchException e) {
				input.nextLine();
				isValidValue = false;
				System.out.println("Invalid Value.");
			}
			
		} while(isValidValue == false);
			
		
		input.close();
	}

}
