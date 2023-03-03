package hundredthBirthday;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 1 Module 1
*
* @author Justine Kaye Mojica
* @Description: Java program that prompts the user for his/her birthday month, day, and year and prints the date of the user’s one-hundredth birthday.
* Created Date: 5/17/2022
*  Modified Date: 5/18/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class oneHundredthBirthday {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isValid;
		
		do {
			
			try {
				isValid = true;
				System.out.print("Enter the month you were born: ");
				String month = input.nextLine();
				System.out.print("Enter the day you were born: ");
				int day = input.nextInt();
				System.out.print("Enter the year you were born: ");
				int year = input.nextInt();
				int yr100 = year + 100;
				System.out.println("You will be 100 on " + month + " " + day + ", " + yr100);
							
			}
			catch(InputMismatchException e) {
				input.nextLine();
				isValid = false;
				System.out.println("Please input a valid value");
			}
			
		} while (isValid == false);	

		input.close();
	}

}
