package variableNameChecker;

import java.util.Scanner;

/**
* Java Course 1 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java program that checks the properness of a given variable name.
* Created Date: 5/19/2022
* Modified Date: 5/20/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class VariableNameChecker {

	public static void main(String[] args) {
		
		final String GOOD_MSG = "Good!";
		final String LEGAL_MSG = "Legal, but uses poor style.";
		final String ILLEGAL_MSG = "Illegal.";
		Boolean exitProcess = false;
		Boolean containsSpchlChar = false;
		String name;
		
		Scanner input = new Scanner(System.in);
		
								
		do {
			System.out.print("Enter a variable name (q to quit): ");
			name = input.nextLine();	
			char[] nameChars = name.toCharArray();
			
			for(int i = 0 ; i < nameChars.length ; ++i) {
				if (!Character.isLetterOrDigit(nameChars[i])){
					containsSpchlChar = true;
				}
			}
			
			
			if(name.equalsIgnoreCase("q")) {
				exitProcess = true;
			} else if(name.contains(" ") || Character.isDigit(nameChars[0])) {
				System.out.println(ILLEGAL_MSG + "\n");
			} else if(Character.isUpperCase(nameChars[0]) || containsSpchlChar.equals(true)) {
				System.out.println(LEGAL_MSG + "\n");
			} else {
				System.out.println(GOOD_MSG + "\n");
			}
			
		} while(exitProcess.equals(false));
		
		input.close();
	}

}
