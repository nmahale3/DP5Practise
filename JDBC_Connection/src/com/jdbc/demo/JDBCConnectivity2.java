package com.jdbc.demo;

import java.sql.*;


public class JDBCConnectivity2 {

	static String driver ="com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:33078/student_db";
	static String username="root";
	static String userpass="root";
	static Connection conn;
	static Statement stmt;
	static String sql;

	public static void getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		System.out.println("driver loaded");
		conn=DriverManager.getConnection(url, username,userpass);
		stmt=conn.createStatement();
		sql="select * from student";
		ResultSet rs= stmt.executeQuery(sql);
		System.out.println();
		while(rs.next())
		{
			int id = rs.getInt(1);
			String s_firstname=rs.getString("s_firstname");
			System.out.println(+id+"\t"+s_firstname+" "+rs.getString(3));
		}
	}	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		getConnect();	
	}

}
