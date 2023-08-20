package com.tq.day13.overriding;

class Derived  
{ 
    public String getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp);
		return temp; 
    } 
} 
  
public class No7Test extends Derived 
{ 
    public String getDetails(String temp) 
    { 
        System.out.println("Test class " + temp); 
        return "0"; 
    } 
    public static void main(String[] args) 
    { 
        No7Test obj = new No7Test(); 
        obj.getDetails("Hello"); 
    } 
} 

