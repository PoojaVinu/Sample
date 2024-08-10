package Abstraction;

import java.util.Scanner;

public class Triangle extends Shape{
	 int base,side1,side2;
	 public Triangle(int base,int side1,int side2)
	 {
		 this.base=base;
		 this.side1=side1;
		 this.side2=side2;
	 }
	public void calculateArea()
	{  
		int height=10;
		double areaOfTriangle=0.5*base*height;
		System.out.println("Area of triangle :" + areaOfTriangle);
	}
	public void calculatePerimeter()
	{	
		double perimeterOfTriangle=base+side1+side2;
		System.out.println("Perimeter of a Triangle :" + perimeterOfTriangle);
	}
	public static void main(String args[])
	{
		Triangle obj=new Triangle(5,6,6);
		obj.calculateArea();
		obj.calculatePerimeter();
		
		Circle obj1=new Circle(5);
		obj1.calculateArea();
		obj1.calculatePerimeter();
	}
}
