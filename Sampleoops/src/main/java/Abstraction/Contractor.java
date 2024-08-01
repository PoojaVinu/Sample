package Abstraction;

public class Contractor extends Employee {

	public void calculateSalary()
	{
		int workingHours=10;
		int paymentPerHour=500;
		int salary=10*500;
		System.out.println("Salary of contractor :" + salary);
	}
}
