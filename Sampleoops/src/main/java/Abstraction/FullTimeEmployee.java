package Abstraction;

public class FullTimeEmployee extends Employee {
	
	public void calculateSalary()
	{
		
		int paymentPerHour=500;
		int salary=500*8;
		System.out.println("Salary of Full time Employeec:" + salary);
	}

	public static void main(String[] args) {
		
		FullTimeEmployee obj=new FullTimeEmployee();
		obj.calculateSalary();
		
		Contractor obj1=new Contractor();
		obj1.calculateSalary();
		
	}

}
