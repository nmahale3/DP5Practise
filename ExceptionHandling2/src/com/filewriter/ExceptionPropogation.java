package com.filewriter;

import java.io.IOException;

public class ExceptionPropogation {

	public void m1() throws IOException,ClassNotFoundException
	{
		System.out.println("code.....");
	}
	public void m2() throws IOException,ClassNotFoundException
	{
		m1();
	}
	public void m3()
	{
		try {
			m2();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 }
		 }
	public static void main(String[] args) {

		ExceptionPropogation ep=new ExceptionPropogation();
		ep.m3();
//		try
//		{
//			
//		}
//		catch()
//		{
//			
//		}
	}
}
