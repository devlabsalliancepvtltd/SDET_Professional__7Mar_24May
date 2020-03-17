package core_java.Loops;
import java.util.*;

public class CheckPrimeFor {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the number: ");
		int num = scan.nextInt();
		
		scan.close();
		boolean flag = false;
		
		int i=2;
		while(i<=num/2)
		{
			if(num%i == 0)
			{
				flag = true;
				System.out.println("true" + flag);
			}
			i++;
		}
		if(flag)
		  System.out.println(num + " is not a prime no");
		else
			System.out.println(num + " is a prime no");
	}

}
