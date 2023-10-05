package com.jdbc.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableSatatementDemo {

	public static void callProcedureMethod() throws ClassNotFoundException,SQLException
	{
		Connection conn= DBConnectionTestCourseDB.getConnect();
		CallableStatement cs=conn.prepareCall("{call findsal(?)}");
		cs.setInt(1, 15000);
		
//		boolean result = cs.execute();//true :- if returns ResultSet
									  //false:- if returns int or nothing
		ResultSet rs=cs.executeQuery();
//		System.out.println(result);
		while (rs.next()) {
			System.out.println(rs.getString(1)+" | "+rs.getInt(3));
		
		}
		conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		callProcedureMethod();
	}
}
