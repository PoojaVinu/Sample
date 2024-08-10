package exception;
import java.io.IOException;
public class ThrowsChecked {
	public static void check() throws IOException
	{
		throw new IOException();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ThrowsChecked.check();

	}

}
