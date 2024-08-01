package encapsulation;

public class EmployeeDetails {
	private String name;
	private String desig;
	private int salary;
	
	public void setter(String name,String desig,int salary)
	{
		this.name=name;
		this.desig=desig;
		this.salary=salary;
	}
	
	public void getter()
	{
		System.out.println("name :" +name);
		System.out.println("desig :" + desig);
		System.out.println("salary " + salary);
	}

}
