package com.tq.day13.overriding;



class Overriderule2 extends OverrideRule333
{
	public int newssss() 
	{
		System.out.println("Hello............");
		return 0;
	}
}
class OverrideRule333 {

	public int newssss() 
	{
		System.out.println("Hiiiii............");
		return 0;
	}




	public static void main(String[] args) {

		OverrideRule333 o = new OverrideRule333();
		o.newssss();

		Overriderule2 o1 = new Overriderule2();
		o1.newssss();

	}

}