package Abstraction;

public class AbstractDemo1 extends AbstractDemo {
	
	public void show()
	{
		System.out.println("Implementation of abstract method");
	}
	
	public void display()
	{
		System.out.println("Display method of second class");
	}
	
	public static void main(String args[])
	{
		AbstractDemo1 obj=new AbstractDemo1();
		obj.show();
		obj.display();
		obj.print();
	}

}
