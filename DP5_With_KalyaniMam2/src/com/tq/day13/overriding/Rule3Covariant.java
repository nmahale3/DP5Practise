package com.tq.day13.overriding;

class Mains
{
	public Object preliems()
	{
		return "Done"; 
	}
}

class Advance extends Mains
{
	public String preliems()
	{
		return "Done"; 
	}
}
public class Rule3Covariant {
	
	
	public static void main(String[] args) 
	{
		Mains m = new Mains();
		//with Covariant typecasting required
		String s = (String)m.preliems();
		System.out.println(s);
	}

}
