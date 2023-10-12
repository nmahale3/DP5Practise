package com.jdbc.assignment;
import java.sql.*;
public class DBConnectionToTestcourse {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:33078/testcoursedb";
		String username="root";
		String userpass="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url, username, userpass);
		Statement st = conn.createStatement();
		
	}
	

}
