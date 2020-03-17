package core_java.Basic_OOPS;

public class ConstructorDemo
{
    public ConstructorDemo() {
        // Default Constructor
        System.out.println("This is a default constructor");
    }
    
    public ConstructorDemo(String name) {
        // This constructor has one parameter
        System.out.println("Hello: "+ name );
        System.out.println("Welcome");
   }
 
   public static void main(String []args)
   {
    //Creating an object using default constructor
	   //ConstructorDemo myObj = new ConstructorDemo();
 
    //Creating an object using parameterized constructor
	   ConstructorDemo myObj1 = new ConstructorDemo("Max");
   }
}
 