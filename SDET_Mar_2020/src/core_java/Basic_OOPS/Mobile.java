package core_java.Basic_OOPS;

public class Mobile extends Product  //Mobile is a Product
{
	String brand;
	String os;
	int ram;
	
	Mobile()
	{
		//super();
		System.out.println("---Mobile object created--------");
	}
	
	   
	public static void main(String[] args)
	{
		Product p1 = new Product();
		System.out.println("Product 1: " + p1);
		
		p1.setProductDetails(10,30000,"ledtv");
		
		p1.showProductDetails();
		
		Mobile mb = new Mobile();
		
	    mb.setProductDetails(2, 30000, "Galaxy","Samsung","Android", 256);
		
		mb.showProductDetails();
		
	}

	//same method as in parent but different set of attributes
	//same name, different parameters : METHOD OVERLOADING
		public void setProductDetails(int pid,int price, String name,String brand,String os, int ram) //input parameters
		{
			this.pid = pid; //this is a keyword which points to this object
			this.price = price; //LHS will also belong to the object, RHS will belong to the method
			this.name = name;
			this.brand = brand; //this is a keyword which points to this object
			this.os = os; //LHS will also belong to the object, RHS will belong to the method
			this.ram = ram;
		}
	
	//same method, same set of parameters
	//METHOD OVERRIDING
	 void showProductDetails()
	    {
	    	System.out.println("ProductID:" + pid);
	    	System.out.println("Price:" + price);
	    	System.out.println("Name:" + name);
	    	System.out.println("Brand:" + brand);
	    	System.out.println("OS:" + os);
	    	System.out.println("Ram:" + ram);
	    }
}
