package phoneNumberDisector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
* Java Course 1 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java program that reads phone numbers, and for each phone number, 
* 		it displays the phone number’s three components –country code, 
*		area code, and local number.
* Created Date: 5/19/2022
* Modified Date: 5/20/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class PhoneNumberDissector {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String phoneNumber;
		Boolean exitProcess = false; 
		final int DEFAULT_NUM_OF_PHONE_CODES = 3;
		
		do {
			
			System.out.println("Enter a phone number in the form cc-area-local , where cc = country code digits, area = area code digits,and local = local phone digits.");
			System.out.print("Or enter q to quit: ");
			phoneNumber = input.next();
			
			List<String> phoneDigits = new ArrayList<String>(Arrays.asList(phoneNumber.split("-")));
			
			if(phoneNumber.equalsIgnoreCase("q")) {
				exitProcess = true;
			} else if(phoneDigits.size() != DEFAULT_NUM_OF_PHONE_CODES ) {
				exitProcess = false;
				System.out.println("Invalid phone number.\n");
			} else {
				System.out.println("country code = " + phoneDigits.get(0));
				System.out.println("area code = " + phoneDigits.get(1));
				System.out.println("local phone number = " + phoneDigits.get(2));
				System.out.println();				
			}			
					
		} while (exitProcess.equals(false));
		
		input.close();
	}

}
