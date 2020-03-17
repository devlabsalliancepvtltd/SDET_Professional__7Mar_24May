package core_java.Lab_Solutions.Lab2;

public class SwapNumDemo {

	public static void main(String[] args) {
		float first = 1.22f, second = 2.45f;
		
		 System.out.println("--Before swap--");
		 System.out.println("First number = " + first);
		 System.out.println("Second number = " + second);
		
	        // Value of first is assigned to temporary
			float temporary = first;
		
		    // Value of second is assigned to first
	        first = second;
		
		    // Value of temporary (which contains the initial value of first) is assigned to second
		    second = temporary;
		 
		    System.out.println("--After swap--");
		    System.out.println("First number = " + first);
		    System.out.println("Second number = " + second);
	}

}
