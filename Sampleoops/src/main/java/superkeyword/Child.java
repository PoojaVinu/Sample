package superkeyword;

public class Child extends Parent {
	int a=90;
	public void display()
	{   
		super.display();
		super.print();
		System.out.println("child class method");
		System.out.println(a);
		System.out.println(super.a);
	}
	public Child()
	{   
		super();//super will be called implicitly
		System.out.println("child constructor");
	}


	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		

	}

}
