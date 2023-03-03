package addressList;

import java.util.ArrayList;

/**
* Java Course 3 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java program that prints addresses.
* Created Date: 5/31/2022
*
*/

public class AddressList {

	public static void main(String[] args) {
		
		ArrayList<String> addressList = new ArrayList<String>(); 
		addressList.add("1600 Pennsylvania Avenue"); 
		addressList.add("221B Baker Street");
		addressList.add("8700 N.W. River Park Drive");
		
		
		//for each loop to print addresses
		for (String address : addressList) {
			System.out.println(address);
		}

	}

}
