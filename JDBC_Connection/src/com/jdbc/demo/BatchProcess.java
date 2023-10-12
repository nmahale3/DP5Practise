package com.jdbc.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcess {
	
	public static void showBatchProcess() throws ClassNotFoundException,SQLException
	{
		Connection conn=DBConnectionStudent_DB.getConnect();
		Statement stmt= conn.createStatement();
	
		String s1="insert into Student values (302,'neeta','pateliya','1995-09-06','F','npateliya@gmail.com',8475645645,'B.COM',75)";
		String s2="update student set  s_totalmarks=78 where sid=13";
		String s3="delete from student where sid=116";
		
		
		stmt.addBatch(s1);
		stmt.addBatch(s2);
		stmt.addBatch(s3);

		int i[]= stmt.executeBatch();
		for(int a:i)
			System.out.println("Result : "+a);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		showBatchProcess();
	}

}
