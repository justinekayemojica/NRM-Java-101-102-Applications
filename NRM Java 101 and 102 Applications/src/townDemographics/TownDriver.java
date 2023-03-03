package townDemographics;

/**
* Java Course 2 Module 1
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the Town class.
* Created Date: 5/23/2022
*
*/


public class TownDriver {

	public static void main(String[] args) {
		
		Town newHome = new Town();
		newHome.initialize();
		newHome.simulateBirth();
		newHome.simulateBirth();
		newHome.printStatistics();

	}

}
