package stringLengthandInitial;

import java.util.Scanner;

/**
* Java Course 1 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java program that will input a name and then export the length of the name and the first initial.
* Created Date: 5/19/2022
*
*/

public class NameTell {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();
		
		int nameLength = name.length();
		String firstInitial = name.substring(0, 1);
		System.out.println("\nYour name has " + nameLength + " letters including spaces");
		System.out.println("\nThe first letter is: " + firstInitial );
		input.close();

	}

}
