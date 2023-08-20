package com.tq.day10.polymorphism;


class Pen {

	int pprice;
	String pcolour;
	String pbrand;
	
	Pen(int pprice,String pcolour,String pbrand)
	{
		this.pprice=pprice;
		this.pcolour=pcolour;
		this.pbrand=pbrand;
	}
	
	void showPen()
	{
		System.out.println("Pen Brand : "+pbrand+" Pen colour : "+pcolour+" Pen Price : "+pprice);
	}
}
public class BagTest {

	String name ;
	int price;
	String colour;
	Pen p;
	
	BagTest(String name,int price,	String colour,Pen p)
	{
		
		this.name = name ;
		this.price = price;
		this.colour = colour;
		this.p = p;
	}
//	public String toString()
//	{
//		return
//		
//	}
	
	void bagShow()
	{
		p.showPen();
		System.out.println("Bag brand Name : "+name+" Bag colour : "+colour+" Bag Price : "+price);
	}
	
	
	public static void main(String[] args) {
		Pen p = new Pen(10, "Red", "Parker");
		BagTest b = new BagTest("American Tourister", 1999, "Blue",p );
		BagTest b1 = new BagTest("American Tourister", 1999, "Blue",new Pen(12, "Green", "Reynolds") );
		b.bagShow();
		b1.bagShow();
	}
	
}
