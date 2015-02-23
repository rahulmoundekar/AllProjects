package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {

public static Connection con=null;


public static Connection myJdbcConnection(){
	
	
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("class found");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mytest12", "root", "root");
		System.out.println("connection established");
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return con;
}
	
	
}
