package peachBoxCounter;

import java.util.Scanner;

/**
* Java Course 1 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that initiates the filling and shipping of boxes for Peaches.
* Created Date: 5/18/2022
*
*/

public class PeachBoxCounter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of peaches picked:  ");
		int pickedPeaches = input.nextInt(); 
		
		for(int i = 0; i <= pickedPeaches; i += 20) {
			System.out.println("shipped " + i +  " peaches so far");
		}

		input.close();
	}
	

}
