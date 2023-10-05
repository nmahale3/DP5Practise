package com.jdbc.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetConcurUpdatable {
	
	private static void showResultSet() throws ClassNotFoundException, SQLException {
		Connection conn=DBConnectionStudent_DB.getConnect();
		Statement st = conn.createStatement(1005,ResultSet.CONCUR_UPDATABLE);
		String sql="select * from student";
		
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			int newmarks=rs.getInt(9)+1;
			rs.updateInt(9, newmarks);
//			rs.updateRow();
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(9));
		}
		conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		showResultSet();
	}

}
