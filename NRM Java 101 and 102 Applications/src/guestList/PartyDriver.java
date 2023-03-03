package guestList;

/**
* Java Course 2 Module 3
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the Party class.
* Created Date: 5/24/2022
*
*/

public class PartyDriver {

	public static void main(String[] args) {
		
		Party party = new Party(3, "David Beckham");
		party.addGuest("Roberto Baggio");
		party.addGuest("Zinedine Zidane");
		party.addGuest("Roberto Baggio");
		party.addGuest("Johan Cruyff");
		party.addGuest("Diego Maradona");
		party.printParty();
	}

}
