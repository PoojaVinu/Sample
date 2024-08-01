package polymorphism;

public class ChildHockey extends Game{
	public void display()
	{
		super.display();
		System.out.println("Hockey");
	}
	public static void main(String args[])
	{
	 Game obj;                          //Upcasting
	 obj=new ChildHockey();
	 obj.display();
	 obj=new ChildFootball();
	 obj.display();
	 obj=new ChildCricket();
	 obj.display();
		//ChildHockey obj1=new ChildHockey(); //creating objects for child class
		//obj1.display();
		//ChildCricket obj2=new ChildCricket();
		//obj2.display();
		//ChildFootball obj3=new ChildFootball();
		//obj3.display();
	 
		
	}
}
