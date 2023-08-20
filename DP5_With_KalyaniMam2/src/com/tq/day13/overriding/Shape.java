package com.tq.day13.overriding;



class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Shape {
	public void draw() {
        System.out.println("Drawing a generic shape.");
    }

    public static void main(String[] args) {
        Shape allShape = new Shape();
        allShape.draw();

        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
