package Abstraction;

public class Federal extends Bank{
	
	public void interest()
	{
		System.out.println("the interest rate of Federal is 8%");
	}
	
	public static void main(String args[])
	{
		Federal obj=new Federal();
		obj.interest();
		
		Icic obj1=new Icic();
		obj1.interest();
		
		
		Hdfc obj2=new Hdfc();
		obj2.interest();
	}

}
