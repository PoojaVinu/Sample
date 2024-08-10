package encapsulation;

public class Car1 {
	public static void main(String args[])
	{
		Car obj=new Car();
		
		
		obj.setCompany_name("Honda");
		obj.setModel_name("Amaze");
		obj.setYear(2023);
		
		System.out.println("Update Details");
		System.out.println("Company Name :" + obj.getCompany_name());
		System.out.println("Model Name :" + obj.getModel_name());
		System.out.println("Year : " + obj.getYear());
		System.out.println("Mileage :" +obj.getMileage());
	}

}
