package vowelCounter;

import java.util.Scanner;

/**
* Java Course 2 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java Program that counts the number of occurrences of lowercase and uppercase vowels in entered lines of text. 
* Created Date: 5/24/2022
*
*/

public class VowelCounterDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String lineOfText;
		Boolean exitProcess = false;
		VowelCounter vowelCounter = new VowelCounter();
				
		do {
			
			System.out.println("Enter a line of characters (press enter by itself to quit) ");
			lineOfText = input.nextLine();
			if(!lineOfText.equals("")) {
				vowelCounter.processLine(lineOfText);
			} else { 
				vowelCounter.printSummary();
				exitProcess = true;
			}			
			
		} while(exitProcess == false);		
		
	 input.close();
	 
	}

}
