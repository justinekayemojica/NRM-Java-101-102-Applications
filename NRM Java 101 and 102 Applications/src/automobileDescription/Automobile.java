package automobileDescription;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java Program that asks the user how many automobiles are to be described, and for each automobile 
* 			it inputs the user’s selection of make and color then it outputs color and make.
* Created Date: 5/24/2022
*
*/

public class Automobile {
	
	private String make;
	private String color;
	
	Scanner input = new Scanner(System.in);
	
	public void setMake() {
		
		boolean isValidMake = false;
		List<String> makeList = new ArrayList<>(Arrays.asList("b","c","p"));
						
		do {
			System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
			make = input.nextLine();
						
			if(makeList.contains(make)) { 
				isValidMake = true;
			} else {
				System.out.println("The only valid selections are 'b', 'c', or 'p'");
			}
			
		} while(isValidMake == false);
		
		
	}
	
	public void setColor() {
		
		boolean isValidColor = false;
		List<String> colorList = new ArrayList<>(Arrays.asList("b","g","r"));
				
		do {
			System.out.print("Select blue, green, or red (b,g,r): ");
			color = input.nextLine();
						
			if(colorList.contains(color)) {
				isValidColor = true;
			} else {
				System.out.println("The only valid selections are 'b', 'g', or 'r'");
			}
			
		} while(isValidColor == false);
		
		
	}
	
	public Automobile printMake() {
		
		switch(make) {
		case "b":
			System.out.print("Buick \n");
			break;
			
		case "c":
			System.out.print("Chevrolet \n");
			break;
			
		case "p":
			System.out.print("Pontiac \n");
			break;
		}
		return this;
		
	}
	
	public Automobile printColor() {
				
		switch(color) {
		case "b":
			System.out.print("blue ");
			break;
		
		case "g":
			System.out.print("green ");
			break;
		
		case "r":
			System.out.print("red ");
			break;
		}
		return this;
    }

}
