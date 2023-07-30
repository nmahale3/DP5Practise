package com.test2;
/*4. Write a Java program to explain “multilevel inheritance.*/
// in an inheritance maintains is a relationship so in which
// sub child class is extends properties of child class
// and child class extends properties of super class.
class Manufacturer
{
	public void mfg()
	{
		System.out.println("Manufacture is Manufacturing");
	}
}

class Dealer extends Manufacturer
{
	public void deal()
	{
		System.out.println("Dealer is Dealing");
	}
}

class Retailer extends Dealer
{
	public void retail()
	{
		System.out.println("Retailer is Retailing");
	}
}

public class Prog4 {

	public static void main(String[] args) {
		Retailer r = new Retailer();
		r.mfg();// retailer owns the properties of Manufacturer
		r.deal();// retailer owns the properties of Dealer
		r.retail();//retailer owns the properties of Retailer
	}
	
}
