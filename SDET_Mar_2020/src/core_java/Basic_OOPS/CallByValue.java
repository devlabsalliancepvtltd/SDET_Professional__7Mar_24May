package core_java.Basic_OOPS;

public class CallByValue
{
	public static void main(String[] args)//calling function
	{
	      int a = 45;
	      int b = 60;
	      System.out.println("Before swapping, a = " + a + " and b = " + b);
	      // Invoke the swap method
	      swapFunction(a, b);
	      System.out.println("\nNow, Before and After swapping values will be same here:");
	      System.out.println("After swapping, a = " + a + " and b is " + b);
	   }	   
		   
	public static void swapFunction(int m, int n) //called function
	   {
	      System.out.println("Before swapping(Inside the function), m = " + m + " n = " + n);
	      // Swap n1 with n2
	      int c = m;
	      m = n;
	      n = c;
	      System.out.println("After swapping(Inside the function), m = " + m + " n = " + n);
	   }	   
		   
}
