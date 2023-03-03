package personObject;

/**
* Java Course 2 Module 2
*
* @author Justine Kaye Mojica
* @Description: This is a driver for the Person class.
* Created Date: 5/23/2022
*
*/

public class PersonDriver {

	public static void main(String[] args) {
		
		  Person person1 = new Person();
		  person1.printFullName();
		  Person person2 = new Person("Matt", "Thebo");
		  person2.printFullName();
		  person1.setFirst("Paul");
		  person1.setLast("John");
		  person1.printFullName();
		  System.out.println("Total number of people = " +
		  Person.getNumOfPeople());


	}

}
