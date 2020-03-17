package core_java.Lab_Solutions.Lab1;
import java.util.*;

public class AreaPerimeterRectangle {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int l,b,area,perimeter;
         System.out.println("Enter the length of the rectangle: ");
         l = scanner.nextInt();
         System.out.println("Enter the breadth of the rectangle: ");
         b = scanner.nextInt();
         scanner.close();
         
		 area = l*b;
		 perimeter = 2*(l+b);
		 
		 System.out.println("The area of the rectangle is: " + area);
		 System.out.println("The perimeter of the rectangle is: " + perimeter);
	}
}
