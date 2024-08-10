package exception;

public class SampleException {

	public static void main(String[] args) {
		System.out.println("before exception");
		int a=10,b=30;
		int sum=a+b;
		System.out.println("sum =" + sum);
		
		try
		{   int arr[]=new int[5];//first code will be executed
			for(int i=0;i<10;i++)
			{
				System.out.println(arr[i]);
			}
			int result=5/0;
			System.out.println(result);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("Final block will always be executed");
		}
		System.out.println("Rest of the code");
	}

}
