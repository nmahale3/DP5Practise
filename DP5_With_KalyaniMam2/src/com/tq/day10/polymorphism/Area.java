package com.tq.day10.polymorphism;

public class Area {
	static float pi=3.142f;
	// Area of Circle=pi*r*r, Rectangle=width*height, 
	// Area of Square=area*area and Triangle=(1/2)*base*height 
	public void area(float r)
	{
		double areaOfCircle = pi*r*r;
		System.out.println("Area of Circle = "+areaOfCircle);
	}
	public void area(double w,double h)
	{
		double areaOfRectangle = w*h;
		System.out.println("Area of Rectangle = "+areaOfRectangle);
	}
	public void area(double a)
	{
		double areaOfSquare = a*a;
		System.out.println("Area of Square = "+areaOfSquare);
	}
	public void area(float breadth,float height)
	{
		float areaOfTriangle = (0.5f)*breadth*height;
		System.out.println("Area of Triangle = "+areaOfTriangle);
	}

	public static void main(String[] args) {
		
		Area a= new Area();
		a.area(8.4);
		a.area(10.05, 5.8);
		a.area(3.8);
		a.area(4.8, 8.4);
		
	}
	
}