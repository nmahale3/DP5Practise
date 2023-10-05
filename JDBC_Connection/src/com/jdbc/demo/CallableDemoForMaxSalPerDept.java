package com.jdbc.demo;

import java.sql.*;

public class CallableDemoForMaxSalPerDept {
	
	public static void callProcedure() throws ClassNotFoundException,SQLException {
		Connection conn=DBConnectionTestCourseDB.getConnect();
		CallableStatement cs=conn.prepareCall("{call salarybydeptid(?,?)}");
		cs.registerOutParameter(2, Types.INTEGER);
		cs.setInt(1, 60);
		boolean status=cs.execute();
		System.out.println("Status : "+status);
		System.out.println(cs.getDouble(2));
		conn.close();
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		callProcedure();
	}
}
