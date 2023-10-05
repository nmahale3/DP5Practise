package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSelect {
	static String url="jdbc:mysql://localhost:33078/student_db";
	static String driver="com.mysql.cj.jdbc.Driver";
	static String username="root";
	static String userpass="root";
	static PreparedStatement ps;
	static Connection conn;
	static String sql;
	static ResultSet rs;
	public static void getConnect() throws SQLException,ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int sid = sc.nextInt();
		Class.forName(driver);
		System.out.println("Driver Loaded");
		conn = DriverManager.getConnection(url, username, userpass);		
		System.out.println("connected to db");
		sql="select * from student where sid=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, sid);
		System.out.println("Query : "+ps);
		rs= ps.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2));
		}
		else
		{
			System.out.println("Record not found");
		}
		sc.close();
		conn.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnect();
	}

}
