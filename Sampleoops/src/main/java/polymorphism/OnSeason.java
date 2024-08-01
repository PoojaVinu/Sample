package polymorphism;

import java.util.Scanner;

public class OnSeason  {
	double discount;
	double totalAmount;
	double discountTotal;
	public void discount()
	{
		
		System.out.println("OnSeason Discount Applied :");
		discount=.40*totalAmount;
		System.out.println("The discount for OnSeason is :" + discount);
		discountTotal=totalAmount-discount;
		System.out.println("The total amount in OnSeason after discount :" + discountTotal);
	}

}
