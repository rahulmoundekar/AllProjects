package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility 
{
	private static Connection connection = null;

	public static Connection getConnection() 
	{
		try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajaxcurd","root","root");
		 }
		 catch (Exception e) 
		 {
			 e.printStackTrace();
		  }
		 
		 return connection;
	}
}
