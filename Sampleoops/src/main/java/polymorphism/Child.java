package polymorphism;

public class Child extends Parent {
	int sum;
	public void sum(int a,int b)
	{
     super.sum(30,40);
	 sum=a+b;
	 System.out.println("Child Sum= " + sum);
    }
 public static void main(String args[])
 {
	 Child c=new Child();
	 c.sum(20,70);
 }
}