package finalSample;

public class Sample1 extends Sample{
	public void display()
	{	
		super.display();
		System.out.println("Child class");
	}
	
	public static void main(String args[])
	{
		Sample1 obj=new Sample1();
		obj.display();
	}

}
