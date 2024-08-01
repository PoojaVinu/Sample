package encapsulation;

import java.util.Scanner;

public class User {

	
	public static void main(String args[])
	{
		System.out.print("Enter the pin: ");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		Bank bank=new Bank();
	
		bank.setter(pin);
		bank.getter();
		bank.validatePin();
		
		
		
		
	}
}
