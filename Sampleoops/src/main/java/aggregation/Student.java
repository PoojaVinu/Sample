package aggregation;

public class Student {
String name;
int rollno;
int std;
Address add;
public Student(String name,int rollno,int std,Address add)
{
	this.name=name;
	this.rollno=rollno;
	this.std=std;
	this.add=add;
	
}
 public void display()
 {
	 System.out.println("name " + name);
	 System.out.println("rollno " + rollno);
	 System.out.println("std " + std);
	 System.out.println("houseno " + add.houseno);
	 System.out.println("street  " + add.street);
	 System.out.println("city  " +  add.city);
	 System.out.println("state  " + add.state);
 }
public static void main(String[] args) {
	Address obj=new Address(5,"watertank","thrissur","kerala");
	Student obj1=new Student("pooja",87,10,obj);
	obj1.display();
	
}
}
