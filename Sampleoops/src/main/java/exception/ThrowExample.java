package exception;

public class ThrowExample {

	public static void sum(int a,int b)
	{
		int s=a+b;
		if(s>20)
		{
			throw new ArithmeticException("Sum is greater than 20");
		}
		else
		{
			//throw new ArrayIndexOutOfBoundsException();
			System.out.println("Sum is less than 20");
		}
	}
	public static void main(String[] args) {
		try
		{
		ThrowExample.sum(20, 50);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");

	}

}
