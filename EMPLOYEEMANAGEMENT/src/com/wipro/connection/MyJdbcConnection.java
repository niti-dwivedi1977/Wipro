package com.wipro.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJdbcConnection {
	
	//static keyword is used to call the methods directly with the class name
	
	private static MyJdbcConnection single_connection = null;
	
	//Connection class object needed
	public static Connection conn; // connect java code to Database
	
	
	//initialize the connection 
	private MyJdbcConnection() throws SQLException
	{
		//Driver to add sqljdbc driver -- type 4
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root" , "root");
		
		
	}
	
	
	public static MyJdbcConnection getConnect() throws SQLException
	{
		//singleton design pattern
		
		if(single_connection == null)
		{
			
			 single_connection = new MyJdbcConnection();
		}
		
		return single_connection;
	}

}
