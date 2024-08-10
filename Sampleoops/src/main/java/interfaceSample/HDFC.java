package interfaceSample;


public class HDFC implements RBI{
	
	public double recurringDeposit(double amount,int duration )
	{
	  System.out.println("Amount Deposited : " + amount );
	  double simpleInterest=amount*INTEREST_RATE*duration;
	  System.out.println("The Interest of Deposited Amount is " + simpleInterest + " for " + duration + " years at an interest rate of " + INTEREST_RATE);
	  double totalAmount=amount+simpleInterest;
	  return totalAmount;
		
	}
	
	public static void main(String args[])
	{
		RBI obj=new HDFC();
		System.out.println("The Total Amount Received after calculating interest is :" + obj.recurringDeposit(10000.00,5));
	}

}
