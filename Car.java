package week1.day1;

public class Car {
	public void applyBreak()
	{
	System.out.println("Applying the break");
	}
	public void applyGear()
	{
	System.out.println("Applying the Gear");
	}	
	public void switchOnac()
	{
	System.out.println("Switching on the AC");
	}
	public void appyAccelerate()
	{
	System.out.println("Applying the Accelerate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar=new Car();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.switchOnac();
		mycar.appyAccelerate();
	}

}
