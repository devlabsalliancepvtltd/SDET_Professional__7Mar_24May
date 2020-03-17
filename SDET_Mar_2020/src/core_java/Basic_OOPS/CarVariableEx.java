package core_java.Basic_OOPS;

public class CarVariableEx {
	
	static int tyres =4; //static variable declaration
	int price;
	int speed;
	String colour; //instance variables
	
	public void display() //member function or method
	{
		String brand = "Maruti"; //local variable
		System.out.println("Brand is:" + brand);
		//price = 600;
		System.out.println("Price is:" + price);
		System.out.println("Tyres:" + tyres);
	}
	
	public static void main(String[] args) 
	{
		CarVariableEx car1 = new CarVariableEx(); //car1 object created
		car1.price = 50000;
		car1.colour = "black";
		car1.display(); //static methods called with class name
		
	}

}
