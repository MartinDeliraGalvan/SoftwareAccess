package com.jjcom.subsystem.database;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;



public class InternalDB {
	
	//public static void main(String []args){
  public static boolean authenticate(String userlogin, String passwordlogin ) {

	System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://127.0.0.1/access","root", "");
		String query = "SELECT * FROM user";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		 while(rs.next()){
	         //Retrieve by column name
	        
	         String username = rs.getString("username");
	         String first = rs.getString("firstname");
	         String last = rs.getString("lastname");
	         String password = rs.getString("password");
	        		 

	         //Display values
	         System.out.println("Username: " + username);
	         System.out.println("First: " + first);
	         System.out.println("Last: " + last);
	         System.out.println("\n\n");
	         
//	         if(username == userlogin && password == passwordlogin){
//	        	 return true;
//	         }
	         
	      }

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
	return false;
	
  }
}