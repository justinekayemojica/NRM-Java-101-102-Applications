package triangles;

import java.util.Scanner;

/**
* Java Course 1 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that generates an isosceles triangle made of asterisks
* Created Date: 5/18/2022
* Modified Date: 5/20/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class Triangles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the equal sides in an isosceles triangle: ");
		int equalSidesLength = input.nextInt();
		String asterisk = "*";
		input.close();
		
		for(int i = 0; i <= equalSidesLength ; ++i) {			
			for(int y = 0; y < i ; ++y) {
				System.out.print(asterisk);
			}			
			System.out.println();
		}
	}

}
