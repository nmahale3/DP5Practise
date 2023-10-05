package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {

	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:33078/student_db";
	static String username="root";
	static String userpass="root";
	static PreparedStatement ps;
	static Connection conn;
	static String sql;

	public static void getConnect() throws ClassNotFoundException,SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course Id");
		int cid =sc.nextInt();
		System.out.println("Enter Course name");
		String cname=sc.next();
		System.out.println("Enter Course Duration");
		int cduration=sc.nextInt();
		System.out.println("Enter Course fees");
		double cfees=sc.nextDouble();

		Class.forName(driver);
		System.out.println("Driver loaded");
		conn=DriverManager.getConnection(url,username,userpass);
		sql="insert into course values (?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setInt(1, cid);
		ps.setString(2, cname);
		ps.setInt(3, cduration);
		ps.setDouble(4, cfees);
		System.out.println("Query : "+ps);
		int result=ps.executeUpdate();
		if (result>0)
		{
			System.out.println("record inserted");
		}
		else
		{
			System.out.println("record not inserted");
		}
		sc.close();
		conn.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
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
