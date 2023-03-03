package circleParameters;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 1 Module 1
*
* @author Justine Kaye Mojica
* @Description: Java program that generates and prints circle-related values.
* Created Date: 5/17/2022
* Modified Date: 5/18/2022
* @Modified By: Justine Kaye Mojica
*
*/

public class circleParameters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isFloat;
		
		do {
			System.out.print("Enter a radius value : ");
			try {
				isFloat = true;
				float radius = input.nextFloat();
				diameter(radius);
				circumference(radius);
				area(radius);
			}
			catch(InputMismatchException e) {
				input.next();
				isFloat = false;
				System.out.println("Please input a valid value");
			}
			
		} while (isFloat == false);
		
		input.close();
	}
	
	static void diameter(float r) {
		float diameter = 2 * r;
		System.out.println("Diameter = " + diameter);
	}
	
	static void area(float r) {
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("Circumference = " + area);	
	}
	
	static void circumference(float r) {
		double circumference = Math.PI * r * 2;
		System.out.println("Area = " + circumference);		
	}
}
