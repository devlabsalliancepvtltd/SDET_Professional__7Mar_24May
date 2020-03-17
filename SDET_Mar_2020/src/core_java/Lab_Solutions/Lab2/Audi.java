package core_java.Lab_Solutions.Lab2;

import core_java.Basic_OOPS.VehicleInterface1;

public class Audi implements VehicleInterface1{
	int gear,increment, speed=20;
	
	public void applyBrakes(int decrement)
	{
		speed = speed-decrement;
	}

	public void changeGear(int value)
	{
		gear = value+1;
	}

	public void speedUp(int increment)
	{
		speed= speed*2;
	}
	
	public void displayStats()
	{
		System.out.println("Speed is:" + speed +"and gear is:" + gear);
	}

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.applyBrakes(2);
		a.changeGear(3);
		a.speedUp(1);
		a.displayStats();

	}

}
