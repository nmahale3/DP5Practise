package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {
	
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:33078/student_db";
	
	static String username="root";
	static String userpass="root";
	static String sql;
	static Statement st;
	static Connection conn;
	
	public static void getConnect() throws SQLException,ClassNotFoundException {
		
		Class.forName(driver);
		System.out.println("Driver Loaded");
		conn=DriverManager.getConnection(url,username,userpass);
		System.out.println("Connected to db");
		
//		sql="create table teacher(tid int primary key ,tfname varchar(20) not null,salary double not null,cid int)";
		sql="select * from teacher";
		st=conn.createStatement();
		boolean result = st.execute(sql);
		System.out.println("result : "+result);
		conn.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnect();
	}

}
