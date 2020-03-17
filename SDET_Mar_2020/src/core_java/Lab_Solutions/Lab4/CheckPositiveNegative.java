package core_java.Lab_Solutions.Lab4;
import java.util.*;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = read.nextInt();
		read.close();
		
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }

	}

}
