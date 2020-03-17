package core_java.Basic_OOPS;
import java.util.*;

public class HelloWorld {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner inp = new Scanner(System.in);
			System.out.print("Enter Array Length: ");
			int len = inp.nextInt();
			int intarray[] = new int[len];
			
			for(int i=0; i<len;i++)
			{
				System.out.print("Enter Value: ");
				intarray[i] = inp.nextInt();
			}
			
			System.out.println(" Array is"+ intarray);
			System.out.print("The array values are:");
			for(int i=0; i<len;i++)
			{
				System.out.print(intarray[i]+ " ");
			}
		}

	}