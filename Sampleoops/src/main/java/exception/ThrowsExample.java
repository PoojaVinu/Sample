package exception;

public class ThrowsExample {
	public static void check() throws ArithmeticException
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		ThrowsExample.check();

	}

}
