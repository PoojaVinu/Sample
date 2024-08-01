package inheritance;

public class Puppy extends Dog{
	String c="baby";
	public void eat()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		Puppy p=new Puppy();
		p.meet();
		p.bark();
		p.eat();
		System.out.println(p.a + " " + p.b + " " + p.c);
		

	}

}
