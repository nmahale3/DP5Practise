package day17.interfaces;
/*1.write a program to create a interface  named shape.
 * In this class we have three sub classes circle, triangle and square 
 * each class has two member function named draw () and erase (). 
 * Create these using polymorphism concepts.
 */
interface Shape
{
	void draw();
	void erase();
}
class Circle implements Shape 
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing a circle");
	}

	@Override
	public void erase() 
	{
		System.out.println("Erasing a circle");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() 
	{
		System.out.println("Drawing a triangle");
	}

	@Override
	public void erase() 
	{
		System.out.println("Erasing a triangle");
	}
}
class Square implements Shape {
	@Override
	public void draw()
	{
		System.out.println("Drawing a square");
	}

	@Override
	public void erase() 
	{
		System.out.println("Erasing a square");
	}
}

public class Program1 {
	public static void main(String[] args) 
	{
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();

		// Using draw() and erase() on different shapes without knowing their specific types
		drawAndEraseShape(circle);
		drawAndEraseShape(triangle);
		drawAndEraseShape(square);
	}

	// A method to demonstrate polymorphism
	public static void drawAndEraseShape(Shape shape)
	{
		shape.draw();
		shape.erase();
		System.out.println("=================================");
	}
}