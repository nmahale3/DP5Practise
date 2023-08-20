package com.tq.day16.interfaces;

interface Printable {
	int a = 10;

	void showMsg();
}

class Print implements Printable {
	@Override
	public void showMsg() {
		System.out.println("print class");
	}

}

public class Printing 
{
	public static void main(String[] args) {
		
	//	Printable p1 = new Printable(); we cannt create object of Interface
		
		Printable p = new Print();
		p.showMsg();
	}
	
}
