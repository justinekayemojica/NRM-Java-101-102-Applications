package guestList;

/**
* Java Course 2 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java Program that stores and prints participants in a party. 
* Created Date: 5/24/2022
*
*/


public class Party {

	public final int MAX_NUM_OF_GUESTS;
	private int actualNumOfGuests = 0;
	private String[] namesOfGuests ;	
	private String partyHostName;
	
	
	public Party(int MAX_NUM_OF_GUESTS, String partyHostName) {
		super();
		this.MAX_NUM_OF_GUESTS = MAX_NUM_OF_GUESTS;
		this.partyHostName = partyHostName;
		namesOfGuests = new String[MAX_NUM_OF_GUESTS];	
	}

	
	public void addGuest(String nameOfGuest) {
				
		if((actualNumOfGuests < MAX_NUM_OF_GUESTS)) {			
			Boolean isOnList = isOnList(nameOfGuest);
			if(isOnList.equals(true)) {
				System.out.println(nameOfGuest + " is already on the guest list.");
			} else {				
				namesOfGuests[actualNumOfGuests]= nameOfGuest;
				actualNumOfGuests++;
			}
		} else {
			System.out.println(nameOfGuest + " cannot come to the party. The guest list is full.");
		}
	}
	
	public Boolean isOnList(String nameOfGuest) {		
		boolean onList = false; 
		
		for (int i = 0 ; i < namesOfGuests.length ; i++ ) {			
			if(namesOfGuests[i] == nameOfGuest) {
				onList = true;			
			} 
		}
		return onList;
	}
	
	public void printParty() {		
		System.out.println("Guest list for " + partyHostName +"'s party:");
		for (int i = 0 ; i < namesOfGuests.length; i++) { 
			System.out.println("\t•\t" + namesOfGuests[i]);
		}
	}
}
