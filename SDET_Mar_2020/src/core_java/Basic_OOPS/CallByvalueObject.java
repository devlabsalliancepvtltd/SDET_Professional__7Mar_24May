package core_java.Basic_OOPS;

public class CallByvalueObject
{
	 public static void main(String[] args)
	   {
		   IntegerWrapper a = new IntegerWrapper(30);
		   IntegerWrapper b = new IntegerWrapper(45);
	      System.out.println("Before swapping, a = " + a.a + " and b = " + b.a);
	      // Invoke the swap method
	      swapFunction(a, b); //a, b are objects
	      System.out.println("\n**Now, Before and After swapping values will be different here**:");
	      System.out.println("After swapping, a = " + a.a + " and b is " + b.a);
	   }
	   
	   public static void swapFunction(IntegerWrapper a, IntegerWrapper b) {
	      System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a);
	      // Swap n1 with n2
	      IntegerWrapper c = new IntegerWrapper(a.a);
	      a.a = b.a;
	      b.a = c.a;
	      System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a);
	   }
	}		  

		class IntegerWrapper
		{
		   public int a;
		   public IntegerWrapper(int a) 
		   { 
			   this.a = a;
		   }
		}