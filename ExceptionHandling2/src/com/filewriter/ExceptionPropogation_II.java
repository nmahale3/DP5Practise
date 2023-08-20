package com.filewriter;
//if exception occurs in first method the flow goes top to bottom
public class ExceptionPropogation_II {

	public static void m1() {
		System.out.println(10/0);
	}
	public static void m2() {
		m1();
	}
	public static void m3() {
		m2();
	}
	public static void main(String[] args) {
		System.out.println("'''start'''");
		m3();
		System.out.println("'''end'''");
		
	}

}
