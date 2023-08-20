package com.tq.day16.interfaces;
//Extended Interface
interface Mobile
{
	void balance();
}

interface Basic extends Mobile
{
	void msg();

}
class Nokia implements Mobile
{


	public void balance() 
	{
		// TODO Auto-generated method stub
		System.out.println("Calling balance");	
	}

	public void msg()
	{
		System.out.println("Basic Interface");
	}

}

public class InterfaceIII_I {

	public static void main(String[] args) {
		Nokia n = new Nokia();
		n.balance();
		n.msg();
	}
}
