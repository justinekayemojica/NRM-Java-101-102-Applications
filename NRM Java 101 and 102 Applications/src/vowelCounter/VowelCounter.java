package vowelCounter;

/**
* Java Course 2 Module 3
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the VowelCounter class.
* Created Date: 5/24/2022
* Modified Date: 5/24/2022
* @Modified By: Justine Kaye Mojica
* 
*
*/

public class VowelCounter {
	
	//initialize variable
	private int[][] vowelCounts = new int[5][2];
	private Character[] vowels = {'A', 'E', 'I', 'O', 'U'};
			
	//This processLine method receives a line of text as a parameter and uses it to update the vowel counts appropriately.
	void processLine(String lineOfText) {		
		char[] lineOfTextChars = lineOfText.toCharArray();
		for(int i = 0 ; i < lineOfTextChars.length ; i++ ) {
			for(int j= 0 ; j < vowels.length; j++) {
				if(lineOfTextChars[i] == Character.toLowerCase(vowels[j])) {
					vowelCounts[j][0]++;
				} else if(lineOfTextChars[i] == vowels[j]) {
					vowelCounts[j][1]++;
				}
			}
		}
	}
	
	//This printSummary method prints a summary of the counts for all vowels entered.
	void printSummary() {	
		for(int i = 0 ; i < vowelCounts.length ; i++ ) {
			for(int j = 0 ; j < vowelCounts[i].length - 1; j++ ) {
				System.out.println( vowels[i] + ": " + vowelCounts[i][j] + " lowercase, " 
									+ vowelCounts[i][j+1] + " uppercase, " 
									+ (vowelCounts[i][j+1] + vowelCounts[i][j]) + " total");
			}
		}
	}

}
