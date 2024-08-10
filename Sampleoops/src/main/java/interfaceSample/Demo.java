package interfaceSample;

public class Demo implements SampleInterface{
	public void display()
	{
		System.out.println("Demo Interface");
		System.out.println("MAX_VALUE = " + MAX_VALUE);
		System.out.println("B= " + B);
	}
	
	public void print()
	{
		System.out.println("Print abstract method");
	}
	public static void main(String args[])
	{
		SampleInterface obj=new Demo();
		obj.display();
		obj.print();
	}
}
