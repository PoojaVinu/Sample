package inheritance;

public class Developer extends Employee {
	String a="software";
	public void display()
	{
		System.out.println("the developer" + a);
	}
	public static void main(String[] args) {
		Developer d=new Developer();
		d.display();
		d.details();
		Tester e=new Tester();
		e.details();
		e.salary();
		

	}

}
