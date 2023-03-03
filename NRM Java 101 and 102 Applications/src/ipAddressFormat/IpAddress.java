package ipAddressFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java Program that stores an IP address as a dotted-decimal string and as four octet ints.
* Created Date: 5/24/2022
* Modified Date: 5/24/2022
* @Modified By: Justine Kaye Mojica
* 
*/

public class IpAddress {
	
	private String dottedDecimal;
	private int firstOctet;
	private int secondOctet;
	private int thirdOctet;
	private int fourthOctet;
	
	//This constructor initializes the instance variables with appropriate values.
	//It split up the big IP address number into four smaller numbers called octet.
	public IpAddress(String dottedDecimal) {
		super();
		this.dottedDecimal = dottedDecimal;
		
		//This line of code split up the dottedDecimal by dot and return it as list.
		List<String> ipAddOctetList = new ArrayList<>(Arrays.asList(dottedDecimal.split("[.]")));
		
		if(ipAddOctetList.size() != 4) {
			System.out.println("Invalid IP Address");
			return;
		} else {
			firstOctet = Integer.parseInt(ipAddOctetList.get(0));
			secondOctet = Integer.parseInt(ipAddOctetList.get(1));
			thirdOctet= Integer.parseInt(ipAddOctetList.get(2));
			fourthOctet = Integer.parseInt(ipAddOctetList.get(3));			
		}
	}
	
	//This is a standard accessor method simply returns the dottedDecimal instance variable’s value.
	public String getDottedDecimal() {
		return dottedDecimal;
	}
	
	//This method receives the position of one of the octets (1, 2, 3, or 4) and returns the octet that’s at that position.
	public Integer getOctet(int octet) {
		
		Integer octetVal = null;
		
			 switch(octet) {
			 case 1:
				 octetVal = firstOctet;
				 break;
			 case 2:
				 octetVal = secondOctet;
				 break;
			 case 3:
				 octetVal = thirdOctet;
				 break;
			 case 4:
				 octetVal = fourthOctet;
				 break;
			 }		  
		 return octetVal;
	}

}
