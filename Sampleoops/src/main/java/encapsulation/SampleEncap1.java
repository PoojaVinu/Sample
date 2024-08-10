
package encapsulation;

public class SampleEncap1 {
	public static void main(String args[])
	{
		SampleEncap obj=new SampleEncap();
		obj.setMailId("abc");
		obj.setAccBalc(800);
		obj.setAccNo(8000);
		System.out.println("mailid: " + obj.getMailId());
		System.out.println("accbal: " + obj.getAccBalc());
		System.out.println("accnum: " + obj.getAccNo());
	}

}
