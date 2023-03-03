package ipAddressFormat;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the IpAddress class.
* Created Date: 5/24/2022
*
*/

public class IpAddressDriver {

	public static void main(String[] args) {
		
		IpAddress ip = new IpAddress("216.27.6.136");
		System.out.println(ip.getDottedDecimal());
		System.out.println(ip.getOctet(4));
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(2));
	}

}
