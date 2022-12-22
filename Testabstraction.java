package com.firstpackage;

abstract class Shape
{
	abstract void draw();
}
class Rectangle11 extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle ...");
	}
}
class Circle11 extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle ...");
	}
}

public class Testabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle11();
		s.draw();
		s=new Circle11();
		s.draw();
	}

}
