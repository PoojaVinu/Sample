package interfaceSample;

public class Dog implements Animal{
	public void bark(){
		
	}
	public void speak()
	{
		System.out.println("Dog is barking");
	}
	public static void main(String args[])
	{
	Animal obj=new Dog();
	obj.speak();
	}

}
