package mySQLJDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
* Java Course 3 Module 3
*
* @author Justine Kaye Mojica
* @Description: Java program that connects to the MySQL database and prints user policies.
* Created Date: 6/01/2022
*
*/

public class userPolicy {

	public static void main(String[] args) {

		try {
			//initialize database connection object conn and statement object inside conn	
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JAVA101TRN","root", "root"); 			
		    Statement statement = conn.createStatement();	
		    
		    
		    //checks if the table exist in database 
		    Boolean tableExist = conn.getMetaData().getTables(null, null, "user_policies", null).next();
		    if(tableExist == false) {
		    	//execute query statement for creation of table
		    	statement.executeUpdate("create table if not exists user_policies ( "
		    			+ "policy_no varchar(20) primary key, "
		    			+ "user_id int, "
		    			+ "date_registered date, "
		    			+ "policy_type_id varchar(10))");
		    }
		    
		    //execute query statement to insert records in user_policies table
//		    statement.executeUpdate("insert into user_policies(policy_no, user_id, date_registered, policy_type_id) "
//		    		+ "values ('689314',1111,'1994-4-18','6896'),"
//		    		+ "('689316',1111,'2012-5-18','6895'),"
//		    		+ "('689317',1111,'2012-6-20','6894'),"
//		    		+ "('689318',2222,'2012-6-21','6894'),"
//		    		+ "('689320',3333,'2012-6-18','6894'),"
//		    		+ "('689420',4444,'2012-4-09','6896')" );
		    
		    
		    String columnNames = String.format("%-9s | %-7s | %-15s | %-14s " , "policy_no" , "user_id", 
		    		"date_registered", "policy_type_id");	    
		    
		    
		    ResultSet allUserPolicy  = statement.executeQuery("select * from user_policies");
		    
		    //prints header and column names
		    System.out.println("All User policies: " );
		    System.out.println("-------------------------------------------------------------- \n" 
		    					+ columnNames);
		    System.out.println("--------------------------------------------------------------");
		    
		    //Loops through row cursor of perFirstName
		    while(allUserPolicy.next()) {
		    	//prints  all the user policy details
		    	System.out.printf("%-9s | %-7d |  %tF     |\t%-14s \n" , allUserPolicy.getString("policy_no") , 
		    			allUserPolicy.getInt("user_id"), allUserPolicy.getDate("date_registered")
		    			, allUserPolicy.getString("policy_type_id"));
		    }
		    
		    
		    ResultSet userPolicy120101  = statement.executeQuery("select * from user_policies "
		    		+ "where date_registered < '2012-01-01' ");
		    
		    //prints header and column names
		    System.out.println("\nUser policies with registered date is less than 2012-01-01:");
		    System.out.println("-------------------------------------------------------------- \n" 
					+ columnNames);
		    System.out.println("--------------------------------------------------------------");
		    
		    //Loops through row cursor of perFirstName
		    while(userPolicy120101.next()) {
		    	//prints the user policy details with registered date less than 2012-01-01
		    	System.out.printf("%-9s | %-7d |  %tF     |\t%-14s \n" , userPolicy120101.getString("policy_no") , 
		    			userPolicy120101.getInt("user_id"), userPolicy120101.getDate("date_registered")
		    			, userPolicy120101.getString("policy_type_id"));
		    }
			
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
