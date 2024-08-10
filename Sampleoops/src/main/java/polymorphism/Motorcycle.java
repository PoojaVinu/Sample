package polymorphism;

public class Motorcycle extends Vehicle {
	public void startEngine() {
		
		System.out.println("Motorcycle Engine Started using Keys");
	}
	public void stopEngine()
	{
		System.out.println("Motorcycle Engine Stopped using Keys");
	}
	public static void main(String args[])
	{
		Vehicle obj;
		
		obj=new Car();
		obj.startEngine();
		obj.stopEngine();
		
		obj=new Motorcycle();
		obj.startEngine();
		obj.stopEngine();
	}
}
