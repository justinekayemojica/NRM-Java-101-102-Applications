package plantGermination;

import java.util.Scanner;

/**
* Java Course 2 Module 1
*
* @author Justine Kaye Mojica
* @Description: Java Program that will input plant date, germinate date and height of a Maple Tree then print the data in dumpData method.
* Created Date: 5/23/2022
*
*/

public class MapleTree {
	
	private String plantDate;
	private Float height;
	private String germinateDate;
			
	Scanner input = new Scanner(System.in);
	
	public void plant() {
		System.out.print("Enter plant date (dd/mm/yyyy): ");
		plantDate = input.nextLine();
	}
	
	public void germinate() {
		System.out.print("Enter germination date (dd/mm/yyyy): ");
		germinateDate = input.nextLine();
		System.out.print("Enter observed height in meters: ");
		height = input.nextFloat();
		
	}
	
	public void dumpData() {
		System.out.println("Plant date = " + plantDate);
		System.out.println("Germinate date = " + germinateDate);
		System.out.printf("Initial height= %.4f\n",height);
	}
	
}
