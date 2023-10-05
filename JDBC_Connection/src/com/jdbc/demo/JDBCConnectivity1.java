package com.jdbc.demo;
import java.sql.*;
public class JDBCConnectivity1 {

	static String driver ="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:33078/student_db";
	static String username="root";
	static String userpass="root";
	static Connection conn;
	static Statement stmt;
	static String sql;

	public static void getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		System.out.println("driver loaded");
		conn=DriverManager.getConnection(url,username,userpass);
		System.out.println("Connected to db");
		stmt=conn.createStatement();
		sql="delete from student where sid=130";
		int result =stmt.executeUpdate(sql);
		System.out.println("result : "+result);
		if(result>0)
		{
			System.out.println("record deleted");
		}
		else
		{
			System.out.println("record not inserted");
		}
		
	}
	public static void main(String []args) 	{
		try
		{
			getConnect();
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	

}
