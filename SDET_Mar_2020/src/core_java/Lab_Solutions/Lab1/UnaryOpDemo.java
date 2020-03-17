package core_java.Lab_Solutions.Lab1;

public class UnaryOpDemo {

	public static void main(String[] args)
	{
		int a=5, b=6;
		int m=9, n=3;
	    int c = a++ + ++b; //5+7
	    
	    System.out.println("The value of b is: " + b);
	    
	    int d = (++a + b++) + a; //7 + 7 + 7
	    
		System.out.println("The value of b is: " + b);
		System.out.println("The value of a after increment is: " + a);
		System.out.println("The value of c is: " + c);
		System.out.println("The value of d is: " + d);
		
		int o = m-- + --n;
		System.out.println("The value of o is: " + o);
		System.out.println("The value of n is: " + n);
		System.out.println("The value of m is: " + m);
	}
}
