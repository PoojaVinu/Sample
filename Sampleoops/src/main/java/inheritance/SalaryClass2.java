package inheritance;

public class SalaryClass2 extends SalaryClass1{
	double hra;
	double pf;
	public void calculateHraandPf()
	{
	 hra=0.05*basicpay;
	 pf=.20*basicpay;
	}

}
