package com.tq.day8.oops.thiis.stattic.constructors;

import com.tq.day9.accessmodifiers.AccessModifiers;

public class AccessModifier2 extends AccessModifiers {
	
	public static void main(String[] args) {
		
		AccessModifier2 a = new AccessModifier2();
//	System.out.println(a.n1);   Showing error while accessing default in another Package
	
		
		
		System.out.println(a.str);
	
	}

}
