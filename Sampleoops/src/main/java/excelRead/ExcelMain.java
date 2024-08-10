package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException{
		System.out.println(ExcelCode.readStringData(3,0));
		System.out.println(ExcelCode.readIntData(3,1));

	}

}
