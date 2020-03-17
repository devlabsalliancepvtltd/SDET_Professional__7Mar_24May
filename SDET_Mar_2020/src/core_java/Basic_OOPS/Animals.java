package core_java.Basic_OOPS;

public abstract class Animals
{

	        String name = " "; 
	      
	        Animals(String name) 
	        { 
	            this.name = name; 
	        } 
	           
	        // declare non-abstract methods 
	        // it has default implementation 
	        public void basicDetails(String details) //concrete method
	        { 
	            System.out.println(this.name + " " + details); 
	        } 
	           
	        // abstract methods which will be implemented by its subclass(es) 
	        
	        abstract public void habitat();//abstract
	        
	        abstract public void respiration(); 
	    } 


