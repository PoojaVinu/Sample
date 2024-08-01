package inheritance;

public class Tester extends Employee{
	int b=10;
	public void salary()
	{
		System.out.println("salary" +b);
	}

	public static void main(String[] args) {
		Tester e=new Tester();
		e.details();
		e.salary();
		

	}

}
