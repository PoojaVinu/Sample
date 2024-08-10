package exception;

public class TestUserexception {
	public static void validate(int age) throws UserDefinedException
	{
		if(age<18)
		{
			throw new UserDefinedException("not eligible for licence");
		}
		else
		{
			System.out.println("Eligible for driving");
		}
	}
	public static void main(String args[])
	{
		try
		{
			TestUserexception.validate(1);
		}
		catch(UserDefinedException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
