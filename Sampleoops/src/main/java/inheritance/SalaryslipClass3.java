package inheritance;

public class SalaryslipClass3 extends SalaryClass2{
	public void totalSalary()
	{
		double totalSalary=basicpay+hra-pf-deduction+bonus;
		System.out.println("Salary Slip :");
		System.out.println("Basic Pay:" + basicpay);
		System.out.println("Deduction :" + deduction);
		System.out.println("hra : " + hra);
		System.out.println("pf : " + pf);
		System.out.println("Bonus :" + bonus);
		System.out.println("Total Salary :" + totalSalary);
		
		
	}

	public static void main(String[] args) {
	    SalaryslipClass3 employee=new SalaryslipClass3();
	    employee.employeDetails();
	    employee.calculateHraandPf();
	    employee.totalSalary();

	}

}
