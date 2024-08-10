package interfaceSample;

public interface RBI {
	final double INTEREST_RATE=0.75;
	
	public abstract double recurringDeposit(double amount,int duration);
}
