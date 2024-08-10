package Abstraction;

import java.util.Scanner;

public class Circle extends Shape {
	int r;	
	public Circle(int r)
	{
		this.r=r;
	}
	public void calculateArea()
	{  
		double area=3.14*r*r;
		System.out.println("The area of circle :" + area);
		
	}
	public void calculatePerimeter()
	{
		double perimeter=2*3.14*r;
		System.out.println("The perimeter of the circle : " + perimeter);
	}

}
