package com.jdbc.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void showResultSet() throws ClassNotFoundException, SQLException {
		Connection conn = DBConnectionStudent_DB.getConnect();
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String sql="select * from student";
		
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("-----------absolute()-----------");
//		it is use to move a cursor to a specific row(pass parameter as row number)
//		if parameter value is positive than cursor shows present row
//		if parameter value is negative than cursor shows present from bottom to top row number
//		if parameter value is zero than cursor shows SQL Exception
		
//		boolean a= rs.absolute(1);//this will give us row number 1
		boolean a= rs.absolute(-3);//this will give us row number 3 from bottom to top
		System.out.println("row present : "+a);
		System.out.println(rs.getInt(1)+" | "+rs.getString(2));
		
		
//		backward	
		System.out.println("-----------rows in backward direction-----------");
		rs.afterLast();//it makes ResultSet cursor to move after the last row
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2));
		}
		
//		First Row
		System.out.println("-----------First Row-----------");
		rs.first();//Return first row
		System.out.println(rs.getInt(1)+" | "+rs.getString(2));
		System.out.println("-----------Last Row-----------");
		rs.last();//Return first row
		System.out.println(rs.getInt(1)+" | "+rs.getString(2));
	
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		showResultSet();
	}
}
