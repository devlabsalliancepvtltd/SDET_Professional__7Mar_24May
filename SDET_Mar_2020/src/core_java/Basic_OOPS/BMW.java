package core_java.Basic_OOPS;

public class BMW implements VehicleInterface1
{
	
	int gear, increment, decrement, speed;

	public void applyBrakes(int dec)
	{
		speed = speed - dec;
	}
	
	public void changeGear(int gear)
	{
		this.gear = gear;
	}
	
	public void speedUp(int inc)
	{
		speed = speed + inc;
	}
	
	public void displayStats()
	{
		System.out.println("Speed" + speed + "and gear:" +gear);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.gear= 4;
		b.speed=30;
		b.applyBrakes(2);
		b.changeGear(3);
		b.speedUp(1);
		b.displayStats();
		
		Car c = new Car();
	//	System.out.println("Private Access check" + c.data);
		
	}

}
