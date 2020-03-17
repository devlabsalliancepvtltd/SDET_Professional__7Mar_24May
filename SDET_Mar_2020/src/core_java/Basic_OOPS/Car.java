package core_java.Basic_OOPS;

public class Car
{
    static int tyres = 4; 
    
	int price; //only declaration
	
	/*
	 * private int data=40;
	 * 
	 * private void msg(){ System.out.println("Hello java"); }
	 * 
	 * 
	 * 
	 * private Car() { System.out.println("Private Constructor"); } //Singleton
	 * pattern
	 */	 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String model ="Ciaz";
        int x=20; //declaration n initialization
        Car c = new Car();
	}
	
	protected void display()
	{
		System.out.println("inside display");
		
	}

}
