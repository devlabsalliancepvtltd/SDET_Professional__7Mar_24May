package core_java.Basic_OOPS;

public class VehicleClassObjDemo {
	
	int speed;
	String name;
	String colour;
	
	VehicleClassObjDemo(int speed,String name, String colour)
	{
		this.speed = speed;
		this.name = name;
		this.colour = colour;
	}
	
	public void showVehicleDetails()
	{
		System.out.println("Speed of "+ name + "is " +speed +"km/hr");
		System.out.println("Colour is " +colour);
	}

	public static void main(String[] args) {
		
		
		VehicleClassObjDemo v1 = new VehicleClassObjDemo(30,"Ciaz","Wine");
		v1.showVehicleDetails();
		
	}

}
