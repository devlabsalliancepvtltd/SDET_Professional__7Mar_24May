package core_java.Exceptions;

public class MultipleExceptionsDemo 
{
		   public static void main (String args[]) {
		      int array[] = {20,20,40};
		      int num1 = 15, num2 = 0;
		      int result = 0;
		      try 
		      {
		       for(int i = 5; i >= 0; i--)
			         {
			            System.out.println("The value of array is" +array[i]);
			         }
		         System.out.println("The result is" +result);
		      
		      } 
		      catch (ArrayIndexOutOfBoundsException e)
		      {
			         System.out.println("Array is out of Bounds"+e);
			  }
		      catch (ArithmeticException ae) {
			         System.out.println ("Can't divide by Zero"+ae);
		      }
		      result = num1/num2;
		      System.out.println("Check");
		   }
}

