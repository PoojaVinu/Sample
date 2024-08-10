package polymorphism;

public class Car extends Vehicle {
	
	public void startEngine() {
		super.startEngine();
		super.stopEngine();
		System.out.println("Car Engine Started with a Push Button");
	}
	public void stopEngine()
	{
		System.out.println("Car Engine Stopped on Pressing the Push Button");
	}
}
