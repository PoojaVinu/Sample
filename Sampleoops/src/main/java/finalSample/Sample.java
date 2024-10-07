package finalSample;

public class Sample {	//class declared final cannot be accessed in the child class
	final int a=30;
	//a=90;
	final int b;//blank final variable or uninitialised final variable
	public Sample()
	{
	 b=90;
	}
	public void display()	//a method with final cannot be accessed in other class
	{
	 System.out.println("final ");	
	}
}
