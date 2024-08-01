package accessmodifier1;

   public class Sample1 {
   protected int a=10;
   protected void display()
   {
	System.out.println(a);
   }
   public static void main(String args[])
   {
	Sample1 s=new Sample1();
	s.display();
   }
}
