package encapsulation;

import java.util.Scanner;

public class Bank {

	private int pin;
	public void setter(int pin)
	{
		this.pin=pin;
		
	}
	public void getter()
	{
		System.out.println(pin);
	}
	
	public void validatePin()
	{
		if(pin==1001 || pin==1234 || pin==1212)
		{
			System.out.println("Valid PIN ..WITHDRAW AMOUNT "  );
			System.out.println("Enter the amount to be withdrawn");
			Scanner sc=new Scanner(System.in);
			int amount=sc.nextInt();
			System.out.println("The withdraw amount is " + amount);
		}
		else
			System.out.println("Invalid PIN...AMOUNT CANNOT BE WITHDRAWN");
	}
}
