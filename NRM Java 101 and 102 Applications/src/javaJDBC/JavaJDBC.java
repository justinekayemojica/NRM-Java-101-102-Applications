package javaJDBC;

import java.sql.*;  

/**
* Java Course 3 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java program that connects to the MySQL database and returns the unique rows from Person table.
* Created Date: 6/01/2022
*
*/

public class JavaJDBC {

	public static void main(String[] args) {
		
		try {
			//initialize database connection object conn and statement object inside conn	
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JAVA101TRN","root", "root"); 			
		    Statement statement = conn.createStatement();	
		    
		    //initialize perFirstName ResultSet object that will execute query statement: 
		    //SELECT * FROM PERSON GROUP BY FirstName
		    ResultSet perFirstName = statement.executeQuery("SELECT * FROM PERSON GROUP BY FirstName");
		         
		    //Prints header details and table's column name
		    System.out.println("Distinct Person's First Name form Person Table \n");
		    System.out.printf("%-5s%-10s %-10s \n" , "ID" , "FirstName", "LastName");
		    
		    //Loops through row cursor of perFirstName
		    while(perFirstName.next()) {
		    	//Prints row records
		    	System.out.printf("%-5s %-10s %-10s \n" , perFirstName.getString("ID") , 
		    			perFirstName.getString("FirstName"), perFirstName.getString("LastName"));
		    }	         
		    
		    conn.close();
		         
		}catch(SQLException e) {
			e.printStackTrace();
		}  

	}
}
