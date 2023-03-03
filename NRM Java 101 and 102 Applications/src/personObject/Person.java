package personObject;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: Java Program that simulates the creation and display of Person objects
* Created Date: 5/23/2022
* Modified Date: 5/24/2022
* @Modified By: Justine Kaye Mojica
* 
*/

public class Person {
	
	private String first;
	private String last;
	
	static int numOfPeople = 0;
	
	//This initializer block track the total number of instantiated Person objects.
	{
		numOfPeople++;
	}
	
	//Constructor that initializes the Person object with the name “John Doe.”
	public Person() {
		super();
		first = "John";
		last = "Doe";
	}

	//This method sets the value of first and last name
	public Person(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}

	//This method sets the value of first name
	public void setFirst(String first) {
		this.first = first;
	}

	//This method sets the value of last name
	public void setLast(String last) {
		this.last = last;
	}

	//This method simply return the total number of people 
	public static int getNumOfPeople() {
		return numOfPeople;
	}

	//This method print the first and last name
	public void printFullName() {
		System.out.println(first + " " + last);
	}
	
}
