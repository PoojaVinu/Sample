package superkeyword;

public class DivisibleClass extends AddClass {
	public void divisible()
	{
		
		super.add(80,10);
		System.out.println("The sum is: " + super.sum);
		if(sum%10==0)
		{
			System.out.print("Divisible by 10");
		}
		else
			System.out.println("Not divisible by 10");
	}
	public static void main(String args[]) {
		DivisibleClass obj=new DivisibleClass();
		obj.divisible();

	}
}
