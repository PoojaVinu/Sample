package interfaceSample;

public class SampleDemo implements Demo1,Demo2 {
	
	public void display() {
		System.out.println("Default");
	}
	public void print()
	{
		System.out.println("Demo2");
	}
	public static void main(String args[])
	{
		SampleDemo obj=new SampleDemo();
		obj.display();
		obj.print();
	}
	
}
