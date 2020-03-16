package core_java;

public class Product {
	
	//constructor
	Product()
	{
		System.out.println("---PRoduct object created--------");
	}

	//attributes
	int pid;
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int price;
	String name;
    
    void setProductDetails(int pid,int price,String name)
    {
    	this.pid = pid;    //LHS : instance variables   RHS : formal parameters/argument values
    	this.price = price;
    	this.name = name;
    }
    
    void showProductDetails()
    {
    	System.out.println("ProductID:" + pid);
    	System.out.println("Price:" + price);
    	System.out.println("Name:" + name);
    }

	public static void main(String[] args) 
	{
		Product p = new Product(); //creating Product object
		
		p.setProductDetails(1,245,"Samsung");
		
		p.showProductDetails();
		
	}

}
