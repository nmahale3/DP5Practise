package com.jdbc.demo;
import java.sql.*;

public class JDBCConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String drivername="com.mysql.cj.jdbc.Driver";
		String username="root";
		String userpass="root";
		String url="jdbc:mysql://localhost:33078/student_db";
		try
		{
			Class.forName(drivername);
			System.out.println("driver loaded and registered");
			Connection conn = DriverManager.getConnection(url, username, userpass);
			System.out.println("Connected to db");
			
//			String sql="insert into Student values (130,'ganesh','wadile','1996-02-28','M','gwadile@gmail.com',9867857467,'MPHARM',89)";
			String sql="insert into Student values (20,'Shrikrishna','Temkar','2000-04-08','M','stemkar@gmail.com',9864357637,'BCA',95),"
					+ "(21,'krishna','Patel','1998-03-15','M','spatel@gmail.com',9864312345,'MCA',88),"
					+ "(22,'Jitu','Marathe','1996-10-04','M','jpmarathe@gmail.com',7083277422,'LLB',99)";
			Statement stmt=conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result>0)
			{
				System.out.println("record inserted");
			}
			else
			{
				System.out.println("record not inserted");
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
