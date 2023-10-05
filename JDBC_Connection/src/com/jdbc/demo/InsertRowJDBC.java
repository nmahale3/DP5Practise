package com.jdbc.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertRowJDBC {



	public static void showResultSet() throws ClassNotFoundException, SQLException {
		Connection conn = DBConnectionStudent_DB.getConnect();
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sql="select * from student";

		ResultSet rs = st.executeQuery(sql);

		System.out.println("insert new row in table");
//		rs.updateXXX();
		rs.moveToInsertRow();
		rs.updateInt(1, 23);
		rs.updateString(2,"Harshal");
		rs.updateString(3,"Patil");
		rs.updateString(4,"2002-04-05");
		rs.updateString(5,"M");
		rs.updateString(6,"hpatil@gmail.com");
		rs.updateString(7,"9890987896");
		rs.updateString(8,"MBA");
		rs.updateDouble(9, 60);
//		rs.insertRow();
		System.out.println("-----rows after insert-----");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"|"+rs.getString(2));
		}
		
		System.out.println("delete row");
		rs.absolute(20);
		rs.deleteRow();
		System.out.println("-----rows after delete-----");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"|"+rs.getString(2));
		}
		System.out.println("Delete Row");
		conn.close();

	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		showResultSet();
	}
}


