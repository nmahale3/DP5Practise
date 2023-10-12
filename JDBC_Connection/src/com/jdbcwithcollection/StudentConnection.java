package com.jdbcwithcollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentConnection {

	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:33078/student_db";
	static String username="root";
	static String userpass="root";
	static Connection conn;
	static Statement stmt;
	static String sql;
	static ResultSet rs;
	public static void getConnect() throws ClassNotFoundException,SQLException {

		Class.forName(driver);
		System.out.println("Driver Loaded");
		conn=DriverManager.getConnection(url, username, userpass);
		System.out.println("Connect to db");
		stmt=conn.createStatement();
		sql="select * from student";
		rs=stmt.executeQuery(sql);
		Student stud;
		List<Student> slist= new ArrayList<Student>();
		while (rs.next()) {
			stud=new Student();
			stud.setSid(rs.getInt(1));
			stud.setS_firstname(rs.getString(2));
			stud.setS_lastname(rs.getString(3));
			stud.setS_dob(rs.getString(4));
			stud.setS_gender(rs.getString(5));
			stud.setS_email(rs.getString(6));
			stud.setS_contact(rs.getLong(7));
			stud.setS_degree(rs.getString(8));
			stud.setS_totalmarks(rs.getInt(9));
			slist.add(stud);
		}
		for(Student s:slist )
		{
			System.out.println(s);
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnect();
	}
}
