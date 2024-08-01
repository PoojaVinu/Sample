package inheritance;
import java.util.Scanner;
public class SalaryClass1 {
	double basicpay;
	double deduction;
	double bonus;
	public void employeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the basic pay :");
		basicpay=sc.nextDouble();
		System.out.print("Enter the deduction :");
		deduction=sc.nextDouble();
		System.out.print("Enter the bonus :");
		bonus=sc.nextDouble();
		
	}
}
