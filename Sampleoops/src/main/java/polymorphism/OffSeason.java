package polymorphism;

import java.util.Scanner;

public class OffSeason extends OnSeason {
	
	public void discount()
	{
		System.out.print("OffSeason Discount Applied: ");
	    discount=.15*totalAmount;
		System.out.println("The discount for offSeason is :" + discount);
		discountTotal=totalAmount-discount;
		System.out.println("The totalamount after discount in offseason is :" + discountTotal);
		
	}
	
public static void main(String args[])
 {	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the totalAmount :");
	double totalAmount=sc.nextDouble();
	
	OnSeason onseason=new OnSeason();
	OffSeason offseason=new OffSeason();
	
	onseason.totalAmount=totalAmount;
	offseason.totalAmount=totalAmount;
	
	boolean run=true;
	
	while(run)
	{
		System.out.println("Menu :");
		System.out.println("1.OnSeason");
		System.out.println("2.OffSeason");
		System.out.println("3.Exit");
		System.out.print("Choose an Option : ");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:onseason.discount();
			       break;
		    case 2:offseason.discount();
			       break;
		    case 3:System.out.println("Exiting..");
		           run=false;
		           break;
		   default:System.out.println("Invalid choice");
		} 
	}
  }
}
	

