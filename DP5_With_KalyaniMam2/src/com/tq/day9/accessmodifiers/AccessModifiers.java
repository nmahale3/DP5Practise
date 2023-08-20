package com.tq.day9.accessmodifiers;

public class AccessModifiers {

	int n1=123;

	protected String str ="Navin";
	
	
	public static void main(String[] args) {
		
	AccessModifiers a = new AccessModifiers();
//	default with same classes
//	System.out.println(a.n1);
		
	
	System.out.println(a.str);
	}
	
	
}
