package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionStudent_DB {
	
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:33078/student_db";
	static String username="root";
	static String userpass="root";
	static Connection conn=null;
	
	public static Connection getConnect() throws ClassNotFoundException,SQLException {
	
		Class.forName(driver);
		System.out.println("Driver Loaded");
		conn=DriverManager.getConnection(url, username, userpass);
		System.out.println("Connect to db");
		return conn;
	}

}
