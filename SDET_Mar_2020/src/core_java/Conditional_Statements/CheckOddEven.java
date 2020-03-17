package core_java.Conditional_Statements;
import java.util.*;

public class CheckOddEven
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Number");
		int num = reader.nextInt();
		
	//	reader.close();
		
		if(num%2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}
